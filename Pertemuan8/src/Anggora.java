// Nama File    : Anggora.java
// NIM          : 24060124120013
// Nama         : Muhamad Kemal Faza
// Tanggal      : 2 Mei 2026

public class Anggora extends Kucing {
    public Anggora(String nama, double bobot) {
        super(nama, bobot);
    }

    @Override
    public String toString() {
        return "Anggora: " + this.getNama() + " (" + this.getBobot() + " kg)";
    }
}
