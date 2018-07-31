/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import streaming.dao.PersonnageDao;
import streaming.entity.Pays;
import streaming.entity.Personne;

/**
 *
 * @author Administrateur
 */
@Service
public class PersonneServiceJPAImp implements PersonneService{
    @Autowired
    private PersonnageDao dao; 
    
    @Autowired
    private JournalService journal;
    
    @Override
    public void ajouter(Personne p) {
        dao.ajouter(p);
        journal.enregisterMSG("vous venez dajouter une personne");
    }

    @Override
    public void supprimer(Personne p) {
        dao.supprimer(p);
        journal.enregisterMSG("vous venez de supprimer une personne");
    }

    @Override
    public List<Personne> lister() {
        return (List<Personne>) dao.lister();
    }

    
    
}
