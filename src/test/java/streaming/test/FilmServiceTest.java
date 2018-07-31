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
import streaming.dao.FilmDaoCrud;
import streaming.dao.LienDaoCrud;
import streaming.entity.Pays;
import streaming.service.FilmService;
import streaming.service.PaysService;

/**
 *
 * @author Administrateur
 */
//c'es les deux lignes qui démarre Spring
@RunWith(SpringJUnit4ClassRunner.class)
//spécifi le fichier de configuration
@SpringApplicationConfiguration(classes = SpringConfig.class)
//les execption java a revoir !!!!! la stack tress
public class FilmServiceTest {
    
    @Autowired
    private FilmDaoCrud dao;
    
    @Autowired
    private LienDaoCrud daoL;
    
    /**
     *
     */
  
    
    
    @Test
    public void film(){
        System.out.println("*************************************");
        System.out.println(daoL.countByFilmGenreNom("policier"));
        System.out.println("*************************************");
        
        
    }
   
//    @Test
//    public void testLog(){
//        ser.log();
//    }
}
