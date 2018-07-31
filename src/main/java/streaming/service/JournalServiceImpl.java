/*
 * To chajouter(j);ge this license heajouter(j);er, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.service;

import java.util.Date;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import streaming.dao.JournalDao;
import streaming.entity.Journal;

/**
 *
 * @author Administrateur
 */
@Service
public class JournalServiceImpl implements JournalService{

    @Autowired
    private JournalDao dao;

    public void enregisterMSG(String msg) {
        //System.out.println(new Date()) + " : " + msg);
        Journal j = new Journal();
        j.setMsg(msg);
        j.setDate(new Date());
        dao.ajouter(j);        

    }

    
}
