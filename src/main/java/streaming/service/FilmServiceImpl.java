/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import streaming.dao.FilmDaoCrud;
import streaming.entity.Film;

/**
 *
 * @author Administrateur
 */
@Service
public class FilmServiceImpl implements FilmService {

    private JournalService journal;
    @Autowired
    private FilmDaoCrud dao;
    @Autowired
    private SecurituService serviceSec;

    @Override
    public Film findBytitre(String titre) {
        serviceSec.chekAutorisation("FilmeService.findBytitre");
        return dao.findOneByTitre(titre);
    }

    @Override
    public Film findById(long idFilm) {
        serviceSec.chekAutorisation("FilmeService.findById");
        return dao.findOne(idFilm);
    }

    @Transactional
    @Override
    public void update(Film f) {
        serviceSec.chekAutorisation("FilmeService.update");
        dao.save(f);
        journal.enregisterMSG("Vous venez dajouter le" + f.getTitre());
    }

    @Transactional
    @Override
    public void insert(Film f) {
        serviceSec.chekAutorisation("FilmeService.insert");
        dao.save(f);
        journal.enregisterMSG("msg");
    }

    @Override
    public Iterable<Film> list() {
        return dao.findAll();
    }

    @Transactional
    @Override
    public void removeAll() {
        serviceSec.chekAutorisation("FilmeService.removeAll");

        dao.deleteAll();
        journal.enregisterMSG("formatage reussi !!");
    }
}
