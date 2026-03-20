/**
 * File : Persegi.java
 * Deskripsi : Class untuk bangun datar persegi
 * Nama : Muhamad Kemal Faza
 * Tanggal : 18 Maret 2026
 */

public class Persegi extends BangunDatar implements IResize {
    private double sisi;

    public Persegi(double sisi) {
        super();
        this.sisi = sisi;
        setJmlSisi(4);
    }

    public Persegi(double sisi, String warna, String border) {
        super(4, warna, border);
        this.sisi = sisi;
    }

    public double getSisi() {
        return this.sisi;
    }

    public void setSisi(double sisi) {
        this.sisi = sisi;
    }

    @Override
    public double getLuas() {
        return sisi * sisi;
    }

    @Override
    public double getKeliling() {
        return 4 * sisi;
    }

    public double getDiagonal() {
        return sisi * Math.sqrt(2);
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Sisi: " + sisi);
    }

    @Override
    public void zoomIn() {
        sisi *= 1.1;
    }

    @Override
    public void zoomOut() {
        sisi *= 0.9;
    }

    @Override
    public void zoom(int percent) {
        sisi *= percent / 100.0;
    }
}
