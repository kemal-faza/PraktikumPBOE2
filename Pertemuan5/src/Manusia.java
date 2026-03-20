import java.time.LocalDate;

public abstract class Manusia {
    protected String nama;
    protected LocalDate tanggalMulaiKerja;
    protected String alamat;
    protected double pendapatan;
    protected static int counterManusia = 0;

    public Manusia() {
        counterManusia++;
    }

    public Manusia(String nama, String tanggalMulaiKerja, String alamat, double pendapatan) {
        this.nama = nama;
        this.tanggalMulaiKerja = LocalDate.parse(tanggalMulaiKerja);
        this.alamat = alamat;
        this.pendapatan = pendapatan;
        counterManusia++;
    }

    public String getNama() {
        return nama;
    }

    public LocalDate getTanggalMulaiKerja() {
        return tanggalMulaiKerja;
    }

    public String getAlamat() {
        return alamat;
    }

    public double getPendapatan() {
        return pendapatan;
    }

    public static int getCounterManusia() {
        return counterManusia;
    }

    public void setNama(String newNama) {
        this.nama = newNama;
    }

    public void setTanggalMulaiKerja(LocalDate newTanggalMulaiKerja) {
        this.tanggalMulaiKerja = newTanggalMulaiKerja;
    }

    public void setAlamat(String newAlamat) {
        this.alamat = newAlamat;
    }

    public void setPendapatan(double newPendapatan) {
        this.pendapatan = newPendapatan;
    }

    public void cetakInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("Tanggal Mulai Kerja: " + IdFormatter.getIdDateFormat(tanggalMulaiKerja));
        System.out.println("Alamat: " + alamat);
        System.out.println("Pendapatan: " + IdFormatter.getCurrencyIdFormat(pendapatan));
        System.out.println("Jumlah Objek Manusia: " + counterManusia);
    }

    public abstract int hitungMasaKerja();
}
