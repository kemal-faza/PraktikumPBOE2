package pbo_kelompok.src;

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
