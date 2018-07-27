package streaming.test;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.Query;
import static org.junit.Assert.*;
import org.junit.Test;

/**
 *
 * @author Administrateur
 */
public class ExerciceJPQL {

//    @Test
//    public void req07() {
//        EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();
//
//        Query query = em.createQuery("SELECT COUNT(f) FROM Film f JOIN f.realisateurs r WHERE r.nom='Polanski'");
//        long l = (long) query.getSingleResult();
//        assertEquals(2L, l);
//    }
//
//    //7. Nombre de films à la fois interprétés et réalisés par polanski
//    @Test
//    public void req7() {
//        EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();
//        Query query = em.createNamedQuery("");
//    }
    //21. Le nombre de films réalisés pour chaque genre ( GROUP BY )

    @Test
    public void req21(){
    EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();
    Query query = em.createQuery("SELECT COUNT(f), g.nom FROM Film f JOIN f.genre g GROUP BY g");
    }

//    @Test
//    public void req04() {
//
//        EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();
//        Query query = em.createNamedQuery(" SELECT COUNT(1) "
//                + "                          FROM Lien l     "
//                + "                          JOIN l.film f   "
//                + "                          WHERE f.titre='Big Lebowski (The)'");
//    }
//
    //Nombre de films réalisés par Polanski
//    @Test
//    public void req05() {
//
//        EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();
//        Query query = em.createQuery(
//                " SELECT count(f)  "
//                + "from Film f  "
//                + "      Join f.realisateurs r "
//                + "where   r.nom='Polanski'");
//        long l = (long) query.getSingleResult();
//        assertEquals(2L, l);
//    }
}
