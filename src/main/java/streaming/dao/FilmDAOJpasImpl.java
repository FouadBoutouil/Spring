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
import org.springframework.transaction.annotation.Transactional;
import streaming.entity.Film;

/**
 *
 * @author Administrateur
 */
@Repository
public class FilmDAOJpasImpl implements FilmDao{
    
    @PersistenceContext
    private EntityManager em;
    
    @Override
    public Film findBytitre(String titre) {
    Query query = em.createQuery("SELECT f FROM Film f WHERE f.titre=:t");
    query.setParameter("t",titre);
    return (Film)query.getSingleResult();
    }

    @Override
    public Film findById(long idFilm) {
        
        return em.find(Film.class, idFilm);
    }
    
    @Override
    public void update(Film f) {
    em.merge(f);
    }
    @Override
    public void insert(Film f) {
        em.persist(f);
    }

    @Override
    public List<Film> list() {
        Query query = em.createQuery("SELECT f FROM Film f");
        return query.getResultList();
    }
    
    @Override
    public void removeAll() {
       em.createQuery("DELETE FROM Film f").executeUpdate();
    }
    
}
