
/*
    Anggota Kelompok:
    1. Muchammad Yuda Tri Ananda		(24060124110142)
    2. Muhammad Zaidaan Ardiyansyah		(24060124140200)
    3. Muhamad Kemal Faza			    (24060124120013)
    4. Anintya Abhi Wiryateja			(24060124130053)
    5. Nadia Azura Nurhaniya 			(24060124120019)
*/
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Order {
    String id;
    LocalDate orderDate;
    String status;
    List<OrderItem> orderItems;
    double total;
    PaymentMethod paymentMethod;

    public Order(String id, LocalDate orderDate, String status) {
        this.id = id;
        this.orderDate = orderDate;
        this.status = status;
        this.orderItems = new ArrayList<>();
        this.total = 0;
        this.paymentMethod = new CreditCardPayment("0000000000000000", LocalDate.now().plusYears(1), "000");
    }

    public void addOrderItem(Product product, int quantity) {
        OrderItem item = new OrderItem(product, quantity);
        orderItems.add(item);

        if (product instanceof PhysicalProduct) {
            ((PhysicalProduct) product).reduceStock(quantity);
        }

    }

    public void addOrderItem(Product product, int quantity, String promoCode) {
        OrderItem item = new OrderItem(product, quantity);
        item.applyPromo(promoCode);
        orderItems.add(item);

        if (product instanceof PhysicalProduct) {
            ((PhysicalProduct) product).reduceStock(quantity);
        }

    }

    public void calculateTotal() {
        total = 0;
        for (OrderItem item : orderItems) {
            item.calculateSubTotal();
            total += item.subTotal;
        }

    }

    public void checkout() throws PaymentFailedException {
        calculateTotal();

        if (!paymentMethod.processPayment(total)) {
            throw new PaymentFailedException();
        }

        status = "PAID";
    }
}
