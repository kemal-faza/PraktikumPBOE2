
/*
    Anggota Kelompok:
    1. Muchammad Yuda Tri Ananda		(24060124110142)
    2. Muhammad Zaidaan Ardiyansyah		(24060124140200)
    3. Muhamad Kemal Faza			    (24060124120013)
    4. Anintya Abhi Wiryateja			(24060124130053)
    5. Nadia Azura Nurhaniya 			(24060124120019)
*/
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
