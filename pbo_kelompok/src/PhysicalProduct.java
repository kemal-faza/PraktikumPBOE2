package pbo_kelompok.src;

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
