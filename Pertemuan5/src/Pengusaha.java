import java.time.LocalDate;
import java.time.Period;

public class Pengusaha extends Manusia implements Pajak {
    private String npwp;
    private static int counterPengusaha = 0;

    public Pengusaha(String nama, String tanggalMulaiKerja, String alamat, double pendapatan, String npwp) {
        super(nama, tanggalMulaiKerja, alamat, pendapatan);
        this.npwp = npwp;
        counterPengusaha++;
    }

    public String getNPWP() {
        return npwp;
    }

    public static int getCounterPengusaha() {
        return counterPengusaha;
    }

    public void setNPWP(String newNPWP) {
        this.npwp = newNPWP;
    }

    @Override
    public int hitungMasaKerja() {
        return Period.between(tanggalMulaiKerja, LocalDate.now()).getYears() + 1;
    }

    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("NPWP: " + npwp);
        System.out.println("Jumlah Pengusaha: " + counterPengusaha);
    }

    @Override
    public double hitungPajak() {
        return (15 / 100.0) * pendapatan;
    }
}
