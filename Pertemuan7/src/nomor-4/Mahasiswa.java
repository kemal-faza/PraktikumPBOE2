public class Mahasiswa extends CivitasAkademika {
    private String nim;
    private Dosen dosenWali;

    public Mahasiswa(String nama, String nim) {
        super(nama);
        this.nim = nim;
    }

    public void setNIM(String nim) {
        this.nim = nim;
    }

    @Override
    public String getNomor() {
        return this.nim;
    }

    public Dosen getDosenWali() {
        return this.dosenWali;
    }

    public void setWali(Dosen dosenWali) {
        this.dosenWali = dosenWali;
    }

    public void tampilDataMahasiswa() {
        System.out.println("NIM: " + getNomor());
        System.out.println("Nama Mahasiswa: " + this.getNama());
        System.out.println("Dosen Wali: " + this.dosenWali.getNama());
    }
}
