/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import streaming.dao.PaysDao;
import streaming.entity.Pays;

/**
 *
 * @author Administrateur
 */
@Service
public class PaysServieJPAImp implements PaysService{
    @Autowired
    private PaysDao dao;
    
    @Autowired
    private JournalService journal;

    @Transactional
    @Override
    public void ajouter(Pays p) {
        
        dao.ajouter(p);
        journal.enregisterMSG("vous venez dajouter un pays" );
        
    }
    
    @Transactional
    @Override
    public void supprimer(Pays p) {
        dao.supprimer(p);
        journal.enregisterMSG("vous venez dajouter un pays" );
    }

    @Override
    public void listerPays() {
 dao.listerPays();    }
    
}
