/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.service;

import java.util.List;
import streaming.entity.Serie;

/**
 *
 * @author Administrateur
 */
public interface SerieService {
    
    public List<Serie> lister();

    public List<Serie> findByTitre(String titre);

    public void insert(Serie s);
    
}
