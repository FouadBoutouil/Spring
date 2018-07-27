/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.service;

import org.springframework.stereotype.Service;

/**
 *
 * @author Administrateur
 */
//@Service
public class CompteurServiceMockImpl implements CompteurIService{

    @Override
    public long listerTotalEnergyDepensee(String ville) {
        
        return 1000000;
    }
    
}
