/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo10_24060124120013;

/**
 * File: MainDAO.java
 * Deskripsi: Main program untuk akses DAO
 * @author kemal
 */
public class MainDAO {
    public static void main(String args[]) {
        Person person = new Person("Kemal");
        DAOManager m = new DAOManager();
        m.setPersonDAO(new MySQLPersonDAO());
        
        try {
            m.getPersonDAO().savePerson(person);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
