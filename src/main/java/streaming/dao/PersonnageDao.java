/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.dao;

import java.util.List;
import streaming.entity.Pays;
import streaming.entity.Personne;

/**
 *
 * @author Administrateur
 */
public interface PersonnageDao {
    public void ajouter(Personne p);

    public void supprimer(Personne p);

    public List<Personne> lister();
}
