
/*
    Anggota Kelompok:
    1. Muchammad Yuda Tri Ananda		(24060124110142)
    2. Muhammad Zaidaan Ardiyansyah		(24060124140200)
    3. Muhamad Kemal Faza			    (24060124120013)
    4. Anintya Abhi Wiryateja			(24060124130053)
    5. Nadia Azura Nurhaniya 			(24060124120019)
*/
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
