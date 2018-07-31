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
import org.springframework.stereotype.Repository;
import streaming.entity.Pays;
import streaming.entity.Personne;

/**
 *
 * @author Administrateur
 */
@Repository
public class PersonnageDaoImp implements PersonnageDao{
    @PersistenceContext
    private EntityManager em; 
    public void ajouter(Personne p){
        em.persist(p);
        
    };

    public void supprimer(long id){
        Query query = em.createQuery("DELETE p FROM Personne p WHERE p.id=:id");
        query.setParameter("id", id);
        query.executeUpdate();
    };

    public List<Personne> lister(){
        Query query = em.createQuery("SELECT FROM Personne");
        return (List<Personne>) query.getResultList();
        
    };

    @Override
    public void supprimer(Personne p) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
