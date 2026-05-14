/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jdbc.program;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import jdbc.model.Mahasiswa;
import jdbc.service.MySQLMahasiswaService;

/**
 *
 * @author kemal
 */
public class Program {
    static MySQLMahasiswaService service = new MySQLMahasiswaService();
    
    public static void main(String[] args) throws SQLException {
        
        System.err.println("\n=== insert");
        Mahasiswa mhsAdd = new Mahasiswa(5, "Kemal");
        service.add(mhsAdd);
        System.out.println("berhasil insert: " + mhsAdd);
        displayAll();
        
        System.out.println("\n=== update");
        Mahasiswa mhsUpdate = service.getById(5);
        System.out.println("Akan diupdate data lama: " + mhsUpdate);
        mhsUpdate.setNama("Faza");
        System.out.println("dengan data baru: " + mhsUpdate);
        service.update(mhsUpdate);
        displayAll();
        
        System.out.println("\n=== delete");
        System.out.println("akan didelete: " + service.getById(5));
        service.delete(5);
        displayAll();
    }
    
    static void displayAll() throws SQLException {
        List<Mahasiswa> listMahasiswa = service.getAll();
        for (Mahasiswa mhs : listMahasiswa) {
            System.out.println(mhs);
        }
    }
}
