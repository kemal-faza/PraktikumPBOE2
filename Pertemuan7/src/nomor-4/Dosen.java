/* NIM  : 24060124120013
   Nama : Muhamad Kemal Faza
   Tanggal  : 27 April 2026
*/


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
