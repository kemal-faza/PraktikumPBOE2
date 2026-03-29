/*
    Anggota Kelompok:
    1. Muchammad Yuda Tri Ananda		(24060124110142)
    2. Muhammad Zaidaan Ardiyansyah		(24060124140200)
    3. Muhamad Kemal Faza			    (24060124120013)
    4. Anintya Abhi Wiryateja			(24060124130053)
    5. Nadia Azura Nurhaniya 			(24060124120019)
*/
public abstract class Product {
    protected String id;
    protected String name;
    protected double price;
    protected String category;

    public Product(String id, String name, double price, String category) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.category = category;
    }

    public void calculatePrice() {
        if (price < 0) {
            throw new IllegalArgumentException("Harga produk tidak boleh negatif");
        }

        double finalPrice = price;

        if ("Physical".equalsIgnoreCase(category) || "Peripherals".equalsIgnoreCase(category)) {
            finalPrice = price + (price * 0.10);
        }

        System.out.println("Harga akhicr produk '" + name + "' = " + finalPrice);
    }

    public abstract double calculateShippingCost();
}
