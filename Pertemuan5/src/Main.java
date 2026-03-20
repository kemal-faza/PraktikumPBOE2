public class Main {
    public static void main(String[] args) {
        BangunDatar P1 = new Persegi(10);
        Persegi P2 = new Persegi(5);
        BangunDatar L1 = new Lingkaran(7);
        Lingkaran L2 = new Lingkaran(14);

        System.out.println("=== getLuas() ===");
        System.out.println("Luas P1 (Persegi sisi 10): " + P1.getLuas());
        System.out.println("Luas P2 (Persegi sisi 5): " + P2.getLuas());
        System.out.println("Luas L1 (Lingkaran r=7): " + L1.getLuas());
        System.out.println("Luas L2 (Lingkaran d=14): " + L2.getLuas());

        System.out.println("\n=== isEqualLuas() ===");
        System.out.println("P1 == P2 ? " + P1.isEqualLuas(P2));
        System.out.println("L1 == L2 ? " + L1.isEqualLuas(L2));
        System.out.println("P1 == L1 ? " + P1.isEqualLuas(L1));

        System.out.println("\n=== zoomIn(), zoom(), zoomOut() ===");
        System.out.println("Sisi awal P2: " + P2.getSisi());
        P2.zoomIn();
        System.out.println("Setelah zoomIn P2: " + P2.getSisi());
        P2.zoom(150);
        System.out.println("Setelah zoom(150) P2: " + P2.getSisi());
        P2.zoomOut();
        System.out.println("Setelah zoomOut P2: " + P2.getSisi());

        System.out.println();
        System.out.println("Jari-jari awal L2: " + L2.getJari());
        L2.zoomIn();
        System.out.println("Setelah zoomIn L2: " + L2.getJari());
        L2.zoom(200);
        System.out.println("Setelah zoom(200) L2: " + L2.getJari());
        L2.zoomOut();
        System.out.println("Setelah zoomOut L2: " + L2.getJari());
    }
}
