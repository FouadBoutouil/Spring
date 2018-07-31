/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import streaming.entity.Film;

/**
 *
 * @author Administrateur
 */
public interface FilmDaoCrud extends CrudRepository<Film, Long> {

    public Film findOneByTitre(String t);

    public long countByActeursNomAndRealisateursNom(String nomAct, String nomReal);

    public long countByActeursNomAndActeursPrenom(String nom, String prenom);

    public Film findOneByGenreNomAndPaysNomAndRealisateursNom(String genre, String pays, String realisateur);

    //9. Le nomnbre de films réalisés par joel coen
    public long countAllByrealisateursNomAndRealisateursPrenom(String nom, String prenom);

    @Query("SELECT COUNT(f)"
            + "FROM  Film f"
            + "      JOIN f.realisateurs r1 "
            + "      JOIN f.realisateurs r2 "
            + "      WHERE r1.nom =?1 "
            + "      AND r1.prenom =?2"
            + "      AND r2.nom =?3 "
            + "      AND r1.prenom =?4")
    public long compteFilmRealisesParDeuxReal(String nom, String nomReal, String prenomReal2, String nomReal2);

    //11. Le nombre de films réalisés à la fois par les 2 frères Coen, et interprétés par Steve Buscemi
    //12. Le nombre de films policiers réalisés à la fois par les 2 frères Coen, et interprétés par Steve Buscemi
    //13. Le nombre de saisons de la série Dexter
//14. Le nombre total d'épisodes de la série Dexter
//15. Le nombre d'épisodes de la saison 8 de la série Dexter
//16. Le nombre total de liens pour nos films policiers américains

//17. Le nombre totals de liens pour nos films d'horreur interprétés par Polanski
//18. Tous les films d'horreur, sauf ceux interprétés par Polanski ( utiliser UNION ou MINUS ou INTERSECT )
//19. Parmi tous les films, uniquement ceux interprétés par Polanski  ( utiliser UNION ou MINUS ou INTERSECT )
//20. Tous les films interprétés par Polanski et aussi tous les films d'horreur ( utiliser UNION ou MINUS ou INTERSECT )
//21. Le nombre de films réalisés pour chaque genre ( GROUP BY )
//22. Le nombre de films réalisés pour chaque réalisateur, triés par ordre croissant puis par ordre alphabétique ( GROUP BY )
//23. Le nombre de films réalisés pour chaque réalisateur, uniquement si >= 2 ( GROUP BY et HAVING )
//24. Le nombre total de saisons pour chaque série, triés par ordre croissant de saisons, puis par ordre alphabétique.
//25. Le nombre total d'épisodes pour chaque série, pour peu qu'il y ait plus de 5 épisodes au total. Le tout trié par nbre d'épisodes.
}
