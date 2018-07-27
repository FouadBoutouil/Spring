/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.service;

import java.time.LocalDateTime;
import org.springframework.stereotype.Service;

/**
 *
 * @author Administrateur
 */
// Si on utilise pas cette notation l'injection ne peux pas se faire
@Service
public class JournalServiceMockImp{

    
    public void log(String msg) {
        System.out.println(LocalDateTime.now() + " : " + msg);
    }

}
