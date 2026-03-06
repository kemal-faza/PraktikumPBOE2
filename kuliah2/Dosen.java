package kuliah2;

public class Dosen {
    protected String NIP, nama;

    public Dosen(String NIP, String nama) {
        this.NIP = NIP;
        this.nama = nama;
    }

    public String getNIP() {
        return this.NIP;
    }

    public String getNama() {
        return this.nama;
    }

    public void setNIP(String NIP) {
        this.NIP = NIP;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
}
