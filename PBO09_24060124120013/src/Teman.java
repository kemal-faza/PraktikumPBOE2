// Nama File    : Teman.java
// NIM          : 24060124120013
// Nama         : Muhamad Kemal Faza
// Tanggal      : 7 Mei 2026

import java.util.ArrayList;

public class Teman {
    private ArrayList<String> Lnama;
    private int nbelm;

    public Teman() {
        this.Lnama = new ArrayList<>();
        this.nbelm = 0;
    }

    public int getNbelm() {
        return this.nbelm;
    }

    public String getNama(int indeks) {
        return this.Lnama.get(indeks);
    }

    public void setNama(String nama, int indeks) {
        this.Lnama.set(indeks, nama);
    }

    public void addNama(String nama) {
        this.Lnama.add(nama);
        this.nbelm++;
    }

    public void delNama(String nama) {
        this.Lnama.remove(nama);
        this.nbelm--;
    }

    public boolean isMember(String nama) {
        return this.Lnama.contains(nama);
    }

    public void gantiNama(String nama, String namaBaru) {
        this.Lnama.set(this.Lnama.indexOf(nama), namaBaru);
    }

    public int countNama(String nama) {
        int count = 0;
        for (String n : Lnama) {
            if (n == nama) {
                count++;
            }
        }
        return count;
    }

    public void showTeman() {
        for (String n : Lnama) {
            System.out.println(n);
        }
    }
}