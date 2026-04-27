/* NIM  : 24060124120013
   Nama : Muhamad Kemal Faza
   Tanggal  : 24 April 2026
*/

public class PolimorfismeCoercion {
    public static void main(String[] args) {

        // 1a & 1b. Ilustrasi Casting dan Konversi
        int nilaiInt = 65;
        char nilaiChar = (char) nilaiInt; // Polimorfisme Coercion ke char
        double nilaiDouble = (double) nilaiInt; // Coercion ke real
        int balikInt = (int) nilaiDouble; // Kembali ke integer di variabel berbeda

        System.out.println("Integer: " + nilaiInt);
        System.out.println("Karakter: " + nilaiChar); // Output: A
        System.out.println("Real: " + nilaiDouble);
        System.out.println("Kembali ke Integer: " + balikInt);

        // 1c. string konkatenasi vs penjumlahan integer
        String X = "1234";
        String Y = "5678";
        String S = X + Y; // konkatenasi
        Integer Z = Integer.parseInt(X) + Integer.parseInt(Y); // penjumlahan
        System.out.println("Hasil S (String): " + S);
        System.out.println("Hasil Z (Integer): " + Z);

        // 1d. string konkatenasi vs penjumlahan double
        String P = "12.34";
        String Q = "56.78";
        String R = P + Q;
        Double D = Double.parseDouble(P) + Double.parseDouble(Q);
        System.out.println("Hasil R (String): " + R);
        System.out.println("Hasil D (Double): " + D);

        // 1e & 1f. konversi lanjutan
        try {
            // S adalah "12345678", diubah ke integer
            Integer A = Integer.valueOf(S);
            System.out.println("Objek Integer A: " + A);

            // A diubah kembali ke string T
            String T = A.toString();
            System.out.println("Objek String T: " + T);
        } catch (NumberFormatException e) {
            System.out.println("Error konversi: String S terlalu besar untuk Integer!");
        }
    }
}