/*
    Anggota Kelompok:
    1. Muchammad Yuda Tri Ananda		(24060124110142)
    2. Muhammad Zaidaan Ardiyansyah		(24060124140200)
    3. Muhamad Kemal Faza			    (24060124120013)
    4. Anintya Abhi Wiryateja			(24060124130053)
    5. Nadia Azura Nurhaniya 			(24060124120019)
*/
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
