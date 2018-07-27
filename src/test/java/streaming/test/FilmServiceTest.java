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
import streaming.service.FilmService;
import streaming.service.JournalServiceMockImp;

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
    private FilmService service;
    
    // cette ligne sert a instancier la service === new service
    @Autowired
    private JournalServiceMockImp ser;
    public void test() {
        service.supprimTout();
    }
//    @Test
//    public void testLog(){
//        ser.log();
//    }
}
