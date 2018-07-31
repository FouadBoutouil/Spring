/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Administrateur
 */
@Service
public class CompteurServiceImpl implements CompteurIService {
    @Autowired 
    JournalService journalService;   
    @Override
    public long listerTotalEnergyDepensee(String ville) {
        // un log dans le journal
        
        if (ville.equals("Grenoble")) {
            journalService.enregisterMSG("listertotalenergie pour ville de grenoble : " + 100000000);
            return 100000000;
        }

        if (ville.equals("Paris")) {
            return 1000;
        }
        return 10;
    }
}
