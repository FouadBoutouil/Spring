/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.dao;

import java.io.Serializable;
import java.util.List;
import org.springframework.data.repository.CrudRepository;
import streaming.entity.Lien;

/**
 *
 * @author Administrateur
 */
public interface LienDaoCrud extends CrudRepository<Lien, Long>{
    List<Lien> findAllByFilmTitre(String title);
    List<Lien> findAllByFilmRealisateursNom(String nom);
    long countByFilmRealisateursNom(String nom);
    //16. Le nombre total de liens pour nos films policiers américains
    public long countByFilmGenreNom(String policiers);
    
}
