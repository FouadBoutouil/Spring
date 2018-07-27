/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.test;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import streaming.config.SpringConfig;
import streaming.service.CompteurIService;
import streaming.service.CompteurServiceMockImpl;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = SpringConfig.class)

/**
 *
 * @author Administrateur
 */
public class FacturationServiceTest {

    @Autowired
    private CompteurIService compteur;

    @Test
    public void test() {
        System.out.println("Votre Facture $$$$$$$$$$$$$$$$$$$$$$$$$");
        System.out.println(compteur.listerTotalEnergyDepensee("bou")); 
    }

}
