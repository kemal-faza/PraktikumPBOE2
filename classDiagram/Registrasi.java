package classDiagram;

import java.time.LocalDate;

public class Registrasi {
    private LocalDate tanggalRegistrasi;
    private LocalDate tanggalBayar;
    private String metodePembayaran;
    private Pelatihan pelatihan;

    public Registrasi(LocalDate tanggalRegistrasi, LocalDate tanggalBayar, String metodePembayaran) {
        this.tanggalRegistrasi = tanggalRegistrasi;
        this.tanggalBayar = tanggalBayar;
        this.metodePembayaran = metodePembayaran;
    }

    public Registrasi(LocalDate tanggalRegistrasi, LocalDate tanggalBayar, String metodePembayaran,
            Pelatihan pelatihan) {
        this(tanggalRegistrasi, tanggalBayar, metodePembayaran);
        this.pelatihan = pelatihan;
    }

    public LocalDate getTanggalRegistrasi() {
        return tanggalRegistrasi;
    }

    public void setTanggalRegistrasi(LocalDate tanggalRegistrasi) {
        this.tanggalRegistrasi = tanggalRegistrasi;
    }

    public LocalDate getTanggalBayar() {
        return tanggalBayar;
    }

    public void setTanggalBayar(LocalDate tanggalBayar) {
        this.tanggalBayar = tanggalBayar;
    }

    public String getMetodePembayaran() {
        return metodePembayaran;
    }

    public void setMetodePembayaran(String metodePembayaran) {
        this.metodePembayaran = metodePembayaran;
    }

    public Pelatihan getPelatihan() {
        return pelatihan;
    }

    public void setPelatihan(Pelatihan pelatihan) {
        this.pelatihan = pelatihan;
    }

    public double hitungHargaAkhir(double diskonPeserta) {
        if (pelatihan == null) {
            throw new IllegalStateException("Pelatihan belum dihubungkan ke objek Registrasi.");
        }

        double hargaDasar = pelatihan.getHarga();
        double totalDenganPajak = hargaDasar + (hargaDasar * Pelatihan.getPajak());
        double totalAkhir = totalDenganPajak - (totalDenganPajak * diskonPeserta);

        return Math.max(totalAkhir, 0.0);
    }

    public void tampilkanInfoPembayaran() {
        System.out.println("=== Info Pembayaran Registrasi ===");
        System.out.println("Tanggal Registrasi: " + tanggalRegistrasi);
        System.out.println("Tanggal Bayar     : " + tanggalBayar);
        System.out.println("Metode Pembayaran : " + metodePembayaran);

        if (pelatihan != null) {
            System.out.println("Pelatihan         : " + pelatihan.getNama() + " (" + pelatihan.getKode() + ")");
        } else {
            System.out.println("Pelatihan         : belum ditentukan");
        }
    }

}
