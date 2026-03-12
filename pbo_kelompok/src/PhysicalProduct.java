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
        if (quantity > 0 && this.stock >= quantity) {
            this.stock -= quantity;
            return;
        }

    }

}
