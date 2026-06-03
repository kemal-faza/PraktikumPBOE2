/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jdbc.service;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import jdbc.model.Mahasiswa;
import jdbc.utilities.MySQLUtility;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *  File: MySQLMahasiswaService.java
 *  Deskripsi: berfungsi untuk mengelola data Mahasiswa ke dalam database
 * @author kemal
 */
public class MySQLMahasiswaService {
    Connection koneksi = null;
    
    public MySQLMahasiswaService() {
        this.koneksi = MySQLUtility.getConnection();
    }
    
    public Mahasiswa makeMhsObject() {
        return new Mahasiswa();
    }
    
    public void add(Mahasiswa mhs) throws SQLException {
        String query = "INSERT INTO mahasiswa(nama) VALUES('" + mhs.getNama() + "')";
        
        MySQLUtility.executeQuery(query);
    }
    
    public void update(Mahasiswa mhs) throws SQLException {
        String query = "UPDATE mahasiswa SET id=" + mhs.getId() + ", nama='" + mhs.getNama() + "' WHERE id=" + mhs.getId();
        
        MySQLUtility.executeQuery(query);
    }
    
    public void delete(int id) throws SQLException {
        String query = "DELETE FROM mahasiswa WHERE id=" + id;
        
        MySQLUtility.executeQuery(query);
    }
    
    public Mahasiswa getById(int id) throws SQLException {
        String query = "SELECT id, nama FROM mahasiswa WHERE id=" + id;
        Mahasiswa mhs = null;
        
        try(Statement s = koneksi.createStatement();
                ResultSet rs = s.executeQuery(query)) {
            if (rs.next()) {
                mhs = new Mahasiswa(rs.getInt("id"), rs.getString("nama"));
            }
        }
        
        return mhs;
    }
    
    public List<Mahasiswa> getAll() throws SQLException {
        String query = "SELECT * FROM mahasiswa";
        List<Mahasiswa> listMahasiswa = new ArrayList<>();
        
         try(Statement s = koneksi.createStatement();
                ResultSet rs = s.executeQuery(query)) {
            while (rs.next()) {
                Mahasiswa mhs = new Mahasiswa(rs.getInt("id"), rs.getString("nama"));
                listMahasiswa.add(mhs);
            }
        }
         
        return listMahasiswa;
    }

    public void indexReset() throws SQLException {
        String renumber = "SET @new_id = 0";
        String update = "UPDATE mahasiswa SET id = (@new_id := @new_id + 1) ORDER BY id";
        String reset = "ALTER TABLE mahasiswa AUTO_INCREMENT = 1";
        
        try (Statement s = koneksi.createStatement()) {
            s.execute(renumber);
            s.executeUpdate(update);
            s.execute(reset);
        }
    }

    public boolean isEmpty() throws SQLException {
        String query = "SELECT 1 FROM mahasiswa LIMIT 1";
        
        try(Statement s = koneksi.createStatement();
                ResultSet rs = s.executeQuery(query)) {
            return !rs.next();
        }
    }
    
    public void closeConnection() throws SQLException {
        koneksi.close();
    }
}
