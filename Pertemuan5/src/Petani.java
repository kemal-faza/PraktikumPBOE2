import java.time.LocalDate;
import java.time.Period;

public class Petani extends Manusia implements Pajak {
    private String asalKota;
    private static int counterPetani = 0;

    public Petani(String nama, String tanggalMulaiKerja, String alamat, double pendapatan, String asalKota) {
        super(nama, tanggalMulaiKerja, alamat, pendapatan);
        this.asalKota = asalKota;
        counterPetani++;
    }

    public String getAsalKota() {
        return asalKota;
    }

    public static int getCounterPetani() {
        return counterPetani;
    }

    public void setAsalKota(String newAsalKota) {
        this.asalKota = newAsalKota;
    }

    @Override
    public int hitungMasaKerja() {
        return Period.between(tanggalMulaiKerja, LocalDate.now()).getYears() + 0;
    }

    @Override
    public double hitungPajak() {
        return 0;
    }

    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("Asal Kota: " + asalKota);
        System.out.println("Jumlah Petani: " + counterPetani);
    }
}
