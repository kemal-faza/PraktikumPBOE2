package classDiagram;

public abstract class Peserta {
    private String noKTP;
    private String nama;
    private String email;

    // Implementasi relasi komposisi (maksimal 3 registrasi)
    private Registrasi[] riwayatRegistrasi;
    private int jumlahRegistrasi;

    protected Peserta(String noKTP, String nama, String email) {
        this.noKTP = noKTP;
        this.nama = nama;
        this.email = email;
        this.riwayatRegistrasi = new Registrasi[3]; // Batasan kuota array sesuai diagram 0..3
        this.jumlahRegistrasi = 0;
    }

    public String getNoKTP() {
        return noKTP;
    }

    public void setNoKTP(String noKTP) {
        this.noKTP = noKTP;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // Method abstrak untuk polimorfisme perhitungan diskon
    public abstract double getDiskon();

    // Memasukkan registrasi ke dalam array dengan validasi batas maksimal 3
    public void daftarPelatihan(Registrasi reg) {
        if (jumlahRegistrasi < 3) {
            riwayatRegistrasi[jumlahRegistrasi] = reg;
            jumlahRegistrasi++;
            System.out.println("Registrasi berhasil ditambahkan untuk peserta: " + this.getNama());
        } else {
            System.out.println(
                    "Gagal mendaftar: Peserta " + this.getNama() + " telah mencapai batas maksimal 3 pelatihan.");
        }
    }

    public void printInfo() {
        System.out.println("No KTP           : " + noKTP);
        System.out.println("Nama             : " + nama);
        System.out.println("Email            : " + email);
        System.out.println("Jumlah Registrasi: " + jumlahRegistrasi + "/3");
    }
}