/**
 * File : Dosen.java
 * Deskripsi : Class untuk Dosen yang extend ke class parent Pegawai
 * Nama : Muhamad Kemal Faza
 * Tanggal : 12 Maret 2026
 */

public abstract class Dosen extends Pegawai {
    protected String fakultas;

    public Dosen(String nip, String nama, String tanggalLahir, String tmt, int gajiPokok, String fakultas) {
        super(nip, nama, tanggalLahir, tmt, gajiPokok);
        this.fakultas = fakultas;
    }
}
