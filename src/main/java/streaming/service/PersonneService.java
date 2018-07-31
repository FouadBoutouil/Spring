/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.service;

import java.util.List;
import streaming.entity.Pays;
import streaming.entity.Personne;

/**
 *
 * @author Administrateur
 */
public interface PersonneService {
    public void ajouter(Personne p);

    public void supprimer(Personne p);

    public List<Personne> lister();
    
}
