package kuliah3.src;

public class Tendik extends Pegawai {
    private enum typeBidang {
        AKADEMIK, KEMAHASISWAAN, SUMBER_DAYA
    }

    private typeBidang bidang;
    protected static double persenTunjangan = 1;
    protected static int bup = 55;

    public Tendik(String nip, String nama, String tanggalLahir, String tmt, int gajiPokok, typeBidang bidang) {
        super(nip, nama, tanggalLahir, tmt, gajiPokok);
        this.bidang = bidang;
    }

    public double getTunjangan() {
        return (persenTunjangan / 100) * getMasaKerja().getYears();
    }

    public void printInfo() {
        System.out.println("NIP: " + nip);
        System.out.println("Bidang: " + this.bidang);
        System.out.println("Nama: " + nama);
        System.out.println("Tanggal Lahir: " + getIdDateFormat(tanggalLahir));
        System.out.println("TMT: " + getIdDateFormat(tmt));
        System.out.println("Jabatan: Dosen Tetap");
        System.out.println(
                "Masa Kerja: " + getMasaKerja().getYears() + " tahun " + getMasaKerja().getMonths() + " bulan");
        System.out.println("Tanggal Pensiun: " + getTanggalPensiun(bup));
        System.out.println("Gaji Pokok: " + getCurrencyIdFormat(gajiPokok));
        System.out.println(persenTunjangan + "% x " + getMasaKerja().getYears() + " x " + getCurrencyIdFormat(gajiPokok)
                + " = " + getCurrencyIdFormat(getTunjangan()));
    }
}
