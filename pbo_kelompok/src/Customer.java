package pbo_kelompok.src;

import java.time.LocalDate;

public class Customer extends User {
    String address;

    public Customer(String id, String name, String email, String address) {
        super(id, name, email);
        this.address = address;
    }

    public void browseProducts() {
        System.out.println(name + " sedang melihat daftar produk...");
        System.out.println("Kategori populer: Physical, Digital, Peripherals");
    }

    public void placeOrder() {
        Order order = new Order("ORD-CUST-" + id, LocalDate.now(), "PENDING");
        System.out.println("Order baru berhasil dibuat oleh " + name + ": " + order.id);
    }
}
