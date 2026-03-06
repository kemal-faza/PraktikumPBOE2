package kuliah3.src;

public class Tendik extends Pegawai {
    private enum typeBidang {
        AKADEMIK, KEMAHASISWAAN, SUMBER_DAYA
    }

    private typeBidang bidang;
    protected double persenTunjangan = 1;
    protected int bup = 55;

    public Tendik(String nip, String nama, String tanggalLahir, String tmt, int gajiPokok, typeBidang bidang) {
        super(nip, nama, tanggalLahir, tmt, gajiPokok);
        this.bidang = bidang;
    }

    public double getTunjangan() {
        return (persenTunjangan / 100) * getMasaKerja().getYears();
    }

}
