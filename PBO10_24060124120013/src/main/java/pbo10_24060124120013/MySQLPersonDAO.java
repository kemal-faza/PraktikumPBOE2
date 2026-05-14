/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo10_24060124120013;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 *  File: MySQLPersonDAO.java
 *  Deskripsi: implementasi PersonDAO untuk MySQL
 * @author kemal
 */
public class MySQLPersonDAO implements PersonDAO {
    public void savePerson(Person person) throws Exception {
        String name = person.getName();
        
//        membuat koneksi, nama db, user, password menyesuaikan
        Class.forName("com.mysql.cj.jdbc.Driver");

        String query = "INSERT INTO person(name) VALUES('" + name + "')";
        System.out.println(query);

        try (Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/pbo", "root", "root");
             Statement s = con.createStatement()) {
            s.executeUpdate(query);
        }
    }
}
