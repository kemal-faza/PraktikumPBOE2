import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Currency;
import java.util.Locale;

public abstract class Pegawai {
    protected String nip, nama;
    protected LocalDate tanggalLahir, tmt;
    protected int gajiPokok;

    public Pegawai(String nip, String nama, String tanggalLahir, String tmt, int gajiPokok) {
        this.nip = nip;
        this.nama = nama;
        this.tanggalLahir = LocalDate.parse(tanggalLahir);
        this.tmt = LocalDate.parse(tmt);
        this.gajiPokok = gajiPokok;
    }

    public Period getMasaKerja() {
        return Period.between(tmt, LocalDate.now());
    }

    public String getIdDateFormat(LocalDate tanggal) {
        return tanggal.format(DateTimeFormatter.ofPattern("dd MMMM yyyy", Locale.of("id", "ID")));
    }

    public LocalDate getTanggalPensiun(int bup) {
        return tanggalLahir.plusYears(bup).plusMonths(1).withDayOfMonth(1);
    }

    public String getCurrencyIdFormat(double number) {
        Currency idr = Currency.getInstance("IDR");
        Locale loc = Locale.of("id", "ID");
        NumberFormat idrFormatter = NumberFormat.getCurrencyInstance(loc);
        idrFormatter.setCurrency(idr);
        return idrFormatter.format(number);
    }

    public abstract double getTunjangan();

    public abstract void printInfo();
}
