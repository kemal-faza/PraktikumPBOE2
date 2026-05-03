// Nama File    : Main.java
// NIM          : 24060124120013
// Nama         : Muhamad Kemal Faza
// Tanggal      : 2 Mei 2026

public class Main {
    public static void main(String[] args) {
        // Kamus Lokal
        Datum<Kucing> d1;
        Datum<Kucing> d2;
        Datum<Anabul> d3;
        Datum<Integer> a, b;
        Datum<String> s1, s2;
        Data<Anabul> kelompokAnabul;
        Data<Kucing> kelompokKucing;

        // Inisialisasi
        d1 = new Datum<>();
        d2 = new Datum<>();
        d3 = new Datum<>();
        a = new Datum<>();
        b = new Datum<>();
        s1 = new Datum<>();
        s2 = new Datum<>();
        kelompokAnabul = new Data<>();
        kelompokKucing = new Data<>();

        // GENERIK PADA CLASS
        System.out.println("\n=== Bagian I: GENERIK PADA CLASS ===");

        d1.setIsi(new Anggora("Bobby", 5.4));
        d2.setIsi(new Kembangtelon("Teddy", 6.7));
        d3.setIsi(new Anjing("Oasis"));

        System.out.println(d1.getIsi().toString());
        System.out.println(d2.getIsi().toString());
        System.out.println(d3.getIsi().getNama());

        // GENERIK PADA OPERATOR
        System.out.println("\n=== Bagian II: GENERIK PADA OPERATOR ===");

        // TUKAR INTEGER
        a.setIsi(3);
        b.setIsi(6);
        System.out.println("Integer - Sebelum Tukar: a=" + a.getIsi() + ", b=" + b.getIsi());
        OperatorGenerik.Tukar(a, b);
        System.out.println("Integer - Sesudah Tukar: a=" + a.getIsi() + ", b=" + b.getIsi());

        // TUKAR STRING
        s1.setIsi("Hello");
        s2.setIsi("World");

        System.out.println("String - Sebelum Tukar: a=" + s1.getIsi() + ", b=" + s2.getIsi());
        OperatorGenerik.Tukar(s1, s2);
        System.out.println("String - Sesudah Tukar: a=" + s1.getIsi() + ", b=" + s2.getIsi());

        // TUKAR SESAMA KELUARGA ANABUL
        System.out.println("Kucing - Sebelum Tukar: a=" + d1.getIsi().getNama() + ", b=" + d2.getIsi().getNama());
        OperatorGenerik.Tukar(d1, d2);
        System.out.println("Kucing - Sesudah Tukar: a=" + d1.getIsi().getNama() + ", b=" + d2.getIsi().getNama());

        // BOBOT DARI 2 JENIS KUCING
        double totalBobot = OperatorGenerik.Bobot2(
                d1.getIsi(),
                d2.getIsi());
        System.out.println(
                "Total bobot " + d1.getIsi().getNama() + " dan " + d2.getIsi().getNama() + ": " + totalBobot + " kg");

        // GENERIK PADA DATA
        System.out.println("\n=== Bagian III: GENERIK PADA DATA ===");

        kelompokAnabul.setIsi(1, new Anggora("Snowy", 4.2));
        kelompokAnabul.setIsi(2, new Kembangtelon("Belang", 3.5));
        kelompokAnabul.setIsi(3, new Anjing("Oasis"));

        System.out.println("Isi Data (Anabul) di posisi 1: " + kelompokAnabul.getIsi(1));
        System.out.println("Isi Data (Anabul) di posisi 2: " + kelompokAnabul.getIsi(2));
        System.out.println("Isi Data (Anabul) di posisi 3: " + kelompokAnabul.getIsi(3).getNama());
        System.out.println("Total isi Data: " + kelompokAnabul.getSize());

        kelompokKucing.setIsi(1, new Anggora("Snowy", 4.2));
        kelompokKucing.setIsi(2, new Kembangtelon("Belang", 3.5));

        System.out.println("\nIsi Data (Kucing) di posisi 1: " + kelompokKucing.getIsi(1));
        System.out.println("Isi Data (Kucing) di posisi 2: " + kelompokKucing.getIsi(2));
        System.out.println("Total isi Data: " + kelompokKucing.getSize());

        // HITUNG TOTAL BOBOT Data<Kucing>
        double totalBobotKucing = OperatorGenerik.Bobot2(
                kelompokKucing.getIsi(1),
                kelompokKucing.getIsi(2));
        System.out.println("Total bobot kucing di Data: " + totalBobotKucing + " kg");
    }
}
