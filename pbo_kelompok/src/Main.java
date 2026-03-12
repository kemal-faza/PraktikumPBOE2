package pbo_kelompok.src;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        PhysicalProduct keyboard = new PhysicalProduct(
                "P001",
                "Mechanical Keyboard",
                850000,
                "Peripherals",
                0.8,
                "45x15x4 cm",
                10);

        DigitalProduct ebook = new DigitalProduct(
                "P002",
                "Java OOP Ebook",
                120000,
                "Digital",
                "https://example.com/download/java-oop");

        Order order = new Order("ORD-001", LocalDate.now(), "PENDING");

        order.addOrderItem(keyboard, 1);
        order.addOrderItem(ebook, 2, "PROMO10");
        order.calculateTotal();

        System.out.println("=== Ringkasan Order ===");
        System.out.println("ID Order   : " + order.id);
        System.out.println("Tanggal    : " + order.orderDate);
        System.out.println("Status     : " + order.status);
        System.out.println("Total item : " + order.orderItems.size());
        System.out.println("Total bayar: " + order.total);
        System.out.println("Sisa stok keyboard: " + keyboard.stock);

        try {
            order.checkout();
            System.out.println("Checkout berhasil. Status baru: " + order.status);
        } catch (PaymentFailedException e) {
            System.out.println("Checkout gagal: " + e.getMessage());
        }
    }
}
