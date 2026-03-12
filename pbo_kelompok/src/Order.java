package pbo_kelompok.src;

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

        if (total <= 0) {
            throw new PaymentFailedException("Total pesanan tidak valid");
        }

        if (!paymentMethod.processPayment(total)) {
            throw new PaymentFailedException("Pembayaran gagal");
        }

        status = "PAID";
    }
}
