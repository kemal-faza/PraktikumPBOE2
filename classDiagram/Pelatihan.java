package classDiagram;

public abstract class Pelatihan {
    private String kode;
    private String nama;
    private int kuota;
    private String namaInstruktur;
    private double harga;

    // Atribut statis (Pajak berlaku sama untuk semua objek Pelatihan)
    private static double pajak;

    // Constructor menggunakan modifier protected karena ini kelas abstrak
    protected Pelatihan(String kode, String nama, int kuota, String namaInstruktur, double harga) {
        this.kode = kode;
        this.nama = nama;
        this.kuota = kuota;
        this.namaInstruktur = namaInstruktur;
        this.harga = harga;
    }

    public String getKode() {
        return kode;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getKuota() {
        return kuota;
    }

    public void setKuota(int kuota) {
        this.kuota = kuota;
    }

    public String getNamaInstruktur() {
        return namaInstruktur;
    }

    public void setNamaInstruktur(String namaInstruktur) {
        this.namaInstruktur = namaInstruktur;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    public static void setPajak(double nilaiPajak) {
        pajak = nilaiPajak;
    }

    public static double getPajak() {
        return pajak;
    }

    public void tampilkanDetail() {
        System.out.println("Kode             : " + kode);
        System.out.println("Nama             : " + nama);
        System.out.println("Kuota            : " + kuota);
        System.out.println("Nama Instruktur  : " + namaInstruktur);
        System.out.println("Harga            : " + harga);
        System.out.println("Pajak            : " + pajak);
    }
}