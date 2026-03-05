public class Dosen {
    private String nip, nama, prodi;

    public Dosen(String nip, String nama, String prodi) {
        this.nip = nip;
        this.nama = nama;
        this.prodi = prodi;
    }

    public Dosen() {
        this("", "", "");
    }

    public String getNIP() {
        return this.nip;
    }

    public String getNama() {
        return this.nama;
    }

    public String getProdi() {
        return this.prodi;
    }

    public void setNIP(String newNIP) {
        this.nip = newNIP;
    }

    public void setNama(String newNama) {
        this.nama = newNama;
    }

    public void setProdi(String newProdi) {
        this.prodi = newProdi;
    }
}
