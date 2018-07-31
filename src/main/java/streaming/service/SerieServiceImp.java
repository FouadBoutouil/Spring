/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import streaming.dao.SerieDao;
import streaming.entity.Serie;

/**
 *
 * @author Administrateur
 */
@Service
public class SerieServiceImp implements SerieService {

    @Autowired
    private JournalService journal;
    @Autowired
    private SerieDao dao;

    @Override
    public List<Serie> lister() {
        return dao.lister();
    }

    @Override
    public List<Serie> findByTitre(String titre) {
        return dao.findByTitre(titre);
    }

    @Transactional
    @Override
    public void insert(Serie s) {
        dao.insert(s);
        journal.enregisterMSG("vous venez dajouter une serie");
    }

}
