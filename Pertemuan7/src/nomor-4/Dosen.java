public class Dosen extends CivitasAkademika {
    private String nip;

    public Dosen(String nama, String nip) {
        super(nama);
        this.nip = nip;
    }

    public void setNIP(String nip) {
        this.nip = nip;
    }

    @Override
    public String getNomor() {
        return this.nip;
    }
}
