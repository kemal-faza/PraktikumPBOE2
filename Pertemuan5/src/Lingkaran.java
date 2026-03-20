/**
 * File : Lingkaran.java
 * Deskripsi : Class untuk bangun datar lingkaran
 * Nama : Muhamad Kemal Faza
 * Tanggal : 18 Maret 2026
 */

public class Lingkaran extends BangunDatar implements IResize {
    private double jari;

    public Lingkaran(double jari) {
        super();
        this.jari = jari;
        setJmlSisi(0); // Lingkaran direpresentasikan memiliki 0 sisi lurus
    }

    public Lingkaran(double diameter, String warna, String border) {
        super(0, warna, border);
        this.jari = diameter / 2;
    }

    public double getJari() {
        return jari;
    }

    public void setJari(double jari) {
        this.jari = jari;
    }

    @Override
    public double getLuas() {
        return Math.PI * jari * jari;
    }

    @Override
    public double getKeliling() {
        return 2 * Math.PI * jari;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Jari-jari: " + jari);
        System.out.println("Luas: " + getLuas());
        System.out.println("Keliling: " + getKeliling());
    }

    @Override
    public void zoomIn() {
        jari *= 1.1;
    }

    @Override
    public void zoomOut() {
        jari *= 0.9;
    }

    @Override
    public void zoom(int percent) {
        jari *= percent / 100.0;
    }
}