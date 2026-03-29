/*
    Anggota Kelompok:
    1. Muchammad Yuda Tri Ananda		(24060124110142)
    2. Muhammad Zaidaan Ardiyansyah		(24060124140200)
    3. Muhamad Kemal Faza			    (24060124120013)
    4. Anintya Abhi Wiryateja			(24060124130053)
    5. Nadia Azura Nurhaniya 			(24060124120019)
*/
public class PhysicalProduct extends Product {
    double weight;
    String dimensions;
    int stock;

    public PhysicalProduct(String id, String name, double price, String category, double weight, String dimensions,
            int stock) {
        super(id, name, price, category);
        this.weight = weight;
        this.dimensions = dimensions;
        this.stock = stock;
    }

    public double calculateShippingCost() {
        return weight * 10000;
    }

    public void reduceStock(int quantity) {
        assert (quantity > 0 && this.stock >= quantity) : "Kuantitas tidak valid";
        this.stock -= quantity;
        return;

    }

}
