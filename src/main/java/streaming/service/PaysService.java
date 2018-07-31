/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.service;

import org.springframework.beans.factory.annotation.Autowired;
import streaming.dao.PaysDao;
import streaming.entity.Pays;

/**
 *
 * @author Administrateur
 */
public interface PaysService {
    
    public void ajouter(Pays p);

    public void supprimer(Pays p);

    public void listerPays();

}
