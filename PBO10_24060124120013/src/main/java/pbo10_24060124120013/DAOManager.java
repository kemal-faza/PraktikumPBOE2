/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo10_24060124120013;

/**
 *  File: DAOManager.java
 *  Deskripsi: pengelola DAO dalam program
 * @author kemal
 */
public class DAOManager {
    private PersonDAO personDAO;
    
    public void setPersonDAO(PersonDAO person) {
        personDAO = person;
    }
    
    public PersonDAO getPersonDAO() {
        return this.personDAO;
    }
}
