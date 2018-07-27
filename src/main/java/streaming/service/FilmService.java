/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.service;

import java.time.LocalDateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import streaming.dao.FilmDao;

/**
 *
 * @author Administrateur
 */
@Service
public class FilmService {

    @Autowired
    private FilmDao dao;

    public void supprimTout() {
        dao.removeAll();
    }
}
