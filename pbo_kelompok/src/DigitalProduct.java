package pbo_kelompok.src;

public class DigitalProduct extends Product {
    String downloadUrl;

    public DigitalProduct(String id, String name, double price, String category, String downloadUrl) {
        super(id, name, price, category);
        this.downloadUrl = downloadUrl;
    }

    public double calculateShippingCost() {
        return 0;
    }
}
