/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Administrateur
 */
@Service
public class SecurityServiceImpl implements SecurituService {

    @Override
    public void chekAutorisation(String action) {

        String rol = "visiteur";
        if (!rol.equals("ADMIN") && action.contains("delete") || action.contains("remove")) {
            //cette ligne arrete la fonction 
            throw new RuntimeException("operation interdite");
        }
    }
 }
