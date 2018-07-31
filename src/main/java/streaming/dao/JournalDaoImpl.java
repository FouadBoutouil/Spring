/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.dao;

import java.util.Date;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import streaming.entity.Journal;

/**
 *
 * @author Administrateur
 */
@Repository
public class JournalDaoImpl implements JournalDao {
    @PersistenceContext
    private EntityManager em;
    public void enregisterMSG(Journal j) {
        Date d = new Date();
        System.out.println("msg" + j);
    }
    public void ajouter(Journal j){
        
        em.persist(j);
        
    }

}
