public class MataKuliah {
    private String idMatkul, nama;
    private int sks;

    public MataKuliah(String idMatkul, String nama, int sks) {
        this.idMatkul = idMatkul;
        this.nama = nama;
        this.sks = sks;
    }

    public MataKuliah() {
        this("", "", 0);
    }

    public String getIdMatkul() {
        return this.idMatkul;
    }

    public String getNama() {
        return this.nama;
    }

    public int getSks() {
        return this.sks;
    }

    public void setIdMatkul(String newIdMatkul) {
        this.idMatkul = newIdMatkul;
    }

    public void setNama(String newNama) {
        this.nama = newNama;
    }

    public void setSks(int newSks) {
        this.sks = newSks;
    }

}
