/* NIM  : 24060124120013
   Nama : Muhamad Kemal Faza
   Tanggal  : 27 April 2026
*/


// 3. Realisasi kelas induk
public abstract class Anabul {
    private String nama;

    public Anabul(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return this.nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public abstract void gerak();

    public abstract void bersuara();
}
