/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.dao;

import streaming.entity.Journal;

/**
 *
 * @author Administrateur
 */
public interface JournalDao {
    public void enregisterMSG(Journal j);

    public void ajouter(Journal j);
    
}
