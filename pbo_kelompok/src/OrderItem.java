package pbo_kelompok.src;

public class OrderItem {
    Product product;
    int quantity;
    double subTotal;

    public OrderItem(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
        calculateSubTotal();
    }

    public void calculateSubTotal() {
        this.subTotal = product.price * quantity;
    }

    public void applyPromo(String promoCode) {
        if (promoCode != null && !promoCode.isBlank()) {
            this.subTotal = this.subTotal * 0.9;
        }
    }
}
