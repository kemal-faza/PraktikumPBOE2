// Nama File    : MPiaraan.java
// NIM          : 24060124120013
// Nama         : Muhamad Kemal Faza
// Tanggal      : 7 Mei 2026

package Piaraan;

public class MPiaraan {
    public static void main(String[] args) {
        Piaraan p = new Piaraan();

        p.enqueueAnabul(new Kucing("Mimi", 3.5));
        p.enqueueAnabul(new Anjing("Doggy"));
        p.enqueueAnabul(new Anggora("Anggi", 4.2));
        p.enqueueAnabul(new Burung("Tweety"));
        p.enqueueAnabul(new Kembangtelon("Kembar", 5.0));

        System.out.println("=== Daftar Anabul ===");
        p.showAnabul();

        System.out.println("\n=== Jenis Anabul ===");
        p.showJenisAnabul();

        System.out.println("\nJumlah total: " + p.getNbelm());
        System.out.println("Jumlah kucing: " + p.countKucing());
        System.out.println("Total bobot kucing: " + p.bobotKucing() + " kg");

        System.out.println("\nAnabul terdepan: " + p.getAnabul().getNama());

        Anabul keluar = p.dequeueAnabul();
        System.out.println("Dequeue: " + keluar.getNama());

        System.out.println("\n=== Setelah dequeue ===");
        p.showAnabul();
        System.out.println("Jumlah total: " + p.getNbelm());
    }
}
