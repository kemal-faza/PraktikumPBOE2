package classDiagram;

import java.time.LocalDate;

public class PesertaMember extends Peserta {
    private String noAnggota;
    private LocalDate tanggalGabung;

    // Diskon statis karena nilainya seragam untuk semua member sesuai studi kasus
    private static double diskon;

    public PesertaMember(String noKTP, String nama, String email, String noAnggota, LocalDate tanggalGabung) {
        super(noKTP, nama, email);
        this.noAnggota = noAnggota;
        this.tanggalGabung = tanggalGabung;
    }

    public String getNoAnggota() {
        return noAnggota;
    }

    public void setNoAnggota(String noAnggota) {
        this.noAnggota = noAnggota;
    }

    public LocalDate getTanggalGabung() {
        return tanggalGabung;
    }

    public void setTanggalGabung(LocalDate tanggalGabung) {
        this.tanggalGabung = tanggalGabung;
    }

    public static void setDiskon(double nilaiDiskon) {
        diskon = nilaiDiskon;
    }

    @Override
    public double getDiskon() {
        return diskon; // Mengembalikan nilai diskon member statis
    }

    @Override
    public void printInfo() {
        System.out.println("=== Info Peserta Member ===");
        super.printInfo();
        System.out.println("No Anggota        : " + noAnggota);
        System.out.println("Tanggal Gabung    : " + tanggalGabung);
        System.out.println("Diskon            : " + getDiskon());
    }
}