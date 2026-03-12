
/**
 * File : DosenTamu.java
 * Deskripsi : Class untuk Dosen tamu yang merupakan anak dari class Dosen
 * Nama : Muhamad Kemal Faza
 * Tanggal : 12 Maret 2026
 */

import java.time.LocalDate;

public class DosenTamu extends Dosen {
    protected String nidk;
    protected LocalDate tanggalBerakhirKontrak;
    protected static double persenTunjangan = 2.5;

    public DosenTamu(String nip, String nama, String tanggalLahir, String tmt, int gajiPokok, String nidk,
            String tanggalBerakhirKontrak) {
        super(nip, nama, tanggalLahir, tmt, gajiPokok, nidk);
        this.nidk = nidk;
        this.tanggalBerakhirKontrak = LocalDate.parse(tanggalBerakhirKontrak);
    }

    public double getTunjangan() {
        return (persenTunjangan / 100) * gajiPokok;
    }

    public void printInfo() {
        System.out.println("NIP: " + nip);
        System.out.println("NIDK: " + nidk);
        System.out.println("Nama: " + nama);
        System.out.println("Tanggal Lahir: " + getIdDateFormat(tanggalLahir));
        System.out.println("TMT: " + getIdDateFormat(tmt));
        System.out.println("Jabatan: Dosen Tetap");
        System.out.println("Fakultas: " + fakultas);
        System.out.println(
                "Masa Kerja: " + getMasaKerja().getYears() + " tahun " + getMasaKerja().getMonths() + " bulan");
        System.out.println("Tanggal Berakhir Kontrak: " + getIdDateFormat(this.tanggalBerakhirKontrak));
        System.out.println("Gaji Pokok: " + getCurrencyIdFormat(gajiPokok));
        System.out.println(persenTunjangan + "% x " + getMasaKerja().getYears() + " x " + getCurrencyIdFormat(gajiPokok)
                + " = " + getCurrencyIdFormat(getTunjangan()));
    }
}
