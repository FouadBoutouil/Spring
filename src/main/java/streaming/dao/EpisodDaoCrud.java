/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.dao;

import java.io.Serializable;
import org.springframework.data.repository.CrudRepository;
import streaming.entity.Episode;

/**
 *
 * @author Administrateur
 */
// 15. Le nombre d'épisodes de la saison 8 de la série Dexter
public interface EpisodDaoCrud extends CrudRepository<Episode, Long> {

    public long countBySaisonNumSaisonAndSaisonSerieTitre(Long numSerie, String titre);

}
