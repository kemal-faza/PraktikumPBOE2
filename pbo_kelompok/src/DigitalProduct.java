/*
    Anggota Kelompok:
    1. Muchammad Yuda Tri Ananda		(24060124110142)
    2. Muhammad Zaidaan Ardiyansyah		(24060124140200)
    3. Muhamad Kemal Faza			    (24060124120013)
    4. Anintya Abhi Wiryateja			(24060124130053)
    5. Nadia Azura Nurhaniya 			(24060124120019)
*/
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
