package classDiagram;

public class PesertaUmum extends Peserta {

    public PesertaUmum(String noKTP, String nama, String email) {
        super(noKTP, nama, email);
    }

    @Override
    public double getDiskon() {
        return 0.0; // Peserta umum tidak mendapat diskon
    }

    @Override
    public void printInfo() {
        System.out.println("=== Info Peserta Umum ===");
        super.printInfo();
        System.out.println("Jenis Peserta     : Umum");
        System.out.println("Diskon            : " + getDiskon());
    }
}