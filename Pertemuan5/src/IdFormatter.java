import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Currency;
import java.util.Locale;

public final class IdFormatter {
    private IdFormatter() {
        throw new UnsupportedOperationException("Tidak bisa membuat objek dari kelas utilitas");
    }

    public static String getIdDateFormat(LocalDate tanggal) {
        return tanggal.format(DateTimeFormatter.ofPattern("dd MMMM yyyy", Locale.of("id", "ID")));
    }

    public static String getCurrencyIdFormat(double number) {
        Currency idr = Currency.getInstance("IDR");
        Locale loc = Locale.of("id", "ID");
        NumberFormat idrFormatter = NumberFormat.getCurrencyInstance(loc);
        idrFormatter.setCurrency(idr);
        return idrFormatter.format(number);
    }
}
