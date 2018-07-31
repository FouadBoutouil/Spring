/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.service;

import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author Administrateur
 */
public class FacturationService {
    @Autowired
    JournalService journal;
    @Autowired
    private CompteurIService compteurService;

    double calculerCoutEnergetique(String ville) {
        // log dans le journal
        journal.enregisterMSG("calculerenerrgypour "+ville);
        return 0.14 * compteurService.listerTotalEnergyDepensee(ville);
    }

}
