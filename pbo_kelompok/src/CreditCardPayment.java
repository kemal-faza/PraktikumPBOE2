
/*
    Anggota Kelompok:
    1. Muchammad Yuda Tri Ananda		(24060124110142)
    2. Muhammad Zaidaan Ardiyansyah		(24060124140200)
    3. Muhamad Kemal Faza			    (24060124120013)
    4. Anintya Abhi Wiryateja			(24060124130053)
    5. Nadia Azura Nurhaniya 			(24060124120019)
*/
import java.time.LocalDate;

public class CreditCardPayment implements PaymentMethod {
    String cardNumber;
    LocalDate expirationDate;
    String cvv;

    public CreditCardPayment(String cardNumber, LocalDate expirationDate, String cvv) {
        this.cardNumber = cardNumber;
        this.expirationDate = expirationDate;
        this.cvv = cvv;
    }

    public boolean processPayment(double amount) {
        return amount > 0;
    }
}
