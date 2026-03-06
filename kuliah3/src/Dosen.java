package kuliah3.src;

public class Dosen extends Pegawai {
    protected String fakultas;

    public Dosen(String nip, String nama, String tanggalLahir, String tmt, int gajiPokok, String fakultas) {
        super(nip, nama, tanggalLahir, tmt, gajiPokok);
        this.fakultas = fakultas;
    }
}
