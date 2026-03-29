package pbo_kelompok.src;

public class PaymentFailedException extends Exception {
    public PaymentFailedException() {
        super("Pembayaran gagal dilakukan, silahkan coba kembali.");
    }
}
