package classDiagram;

import java.time.LocalDate;

public class PelatihanInsidental extends Pelatihan {
    private LocalDate tanggal;
    private String metode;

    public PelatihanInsidental(String kode, String nama, int kuota, String namaInstruktur, double harga,
            LocalDate tanggal, String metode) {
        super(kode, nama, kuota, namaInstruktur, harga);
        this.tanggal = tanggal;
        this.metode = metode;
    }

    public LocalDate getTanggal() {
        return tanggal;
    }

    public void setTanggal(LocalDate tanggal) {
        this.tanggal = tanggal;
    }

    public String getMetode() {
        return metode;
    }

    public void setMetode(String metode) {
        this.metode = metode;
    }

    @Override
    public void tampilkanDetail() {
        System.out.println("=== Detail Pelatihan Insidental ===");
        super.tampilkanDetail();
        System.out.println("Tanggal          : " + tanggal);
        System.out.println("Metode           : " + metode);
    }
}