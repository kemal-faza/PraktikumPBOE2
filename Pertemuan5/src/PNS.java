import java.time.LocalDate;
import java.time.Period;

public class PNS extends Manusia implements Pajak {
    private String nip;
    private static int counterPNS = 0;

    public PNS(String nama, String tanggalMulaiKerja, String alamat, double pendapatan, String nip) {
        super(nama, tanggalMulaiKerja, alamat, pendapatan);
        this.nip = nip;
        counterPNS++;
    }

    public PNS(String nama, String tanggal, double pendapatan, String nip) {
        this(nama, tanggal, "Alamat belum diatur", pendapatan, nip);
    }

    public String getNIP() {
        return nip;
    }

    public static int getCounterPNS() {
        return counterPNS;
    }

    public void setNIP(String nip) {
        this.nip = nip;
    }

    @Override
    public int hitungMasaKerja() {
        return Period.between(tanggalMulaiKerja, LocalDate.now()).getYears() + 3;
    }

    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("NIP: " + nip);
        System.out.println("Jumlah PNS: " + counterPNS);
    }

    @Override
    public double hitungPajak() {
        return (10 / 100.0) * pendapatan;
    }
}
