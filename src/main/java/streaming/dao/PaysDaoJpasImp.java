/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import streaming.entity.Pays;
import streaming.service.JournalService;

/**
 *
 * @author Administrateur
 */
@Repository
public class PaysDaoJpasImp implements PaysDao{

    @PersistenceContext
    private EntityManager em;
    
    

    public void ajouter(Pays p) {
        em.persist(p);

    }

    public void supprimer(Pays p) {
        //pars to int
        em.remove(p);
    }

    ;

    @Override
    public List<Pays> listerPays() {
        return em.createQuery("SELECT p FROM Pays p").getResultList();
    }
;

    




}
