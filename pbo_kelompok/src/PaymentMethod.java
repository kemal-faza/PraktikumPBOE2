package pbo_kelompok.src;

public interface PaymentMethod {
    abstract boolean processPayment(double amount);
}
