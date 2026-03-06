package kuliah3.src;

import java.time.LocalDate;

public class DosenTamu extends Dosen {
    protected String nidk;
    protected LocalDate tanggalBerakhirKontrak;
    protected double persenTunjangan = 2.5;

    public DosenTamu(String nip, String nama, String tanggalLahir, String tmt, int gajiPokok, String nidk,
            String tanggalBerakhirKontrak) {
        super(nip, nama, tanggalLahir, tmt, gajiPokok, nidk);
        this.nidk = nidk;
        this.tanggalBerakhirKontrak = LocalDate.parse(tanggalBerakhirKontrak);
    }

    public double getTunjangan() {
        return (persenTunjangan / 100) * gajiPokok;
    }
}
