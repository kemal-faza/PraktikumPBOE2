/* NIM  : 24060124120013
   Nama : Muhamad Kemal Faza
   Tanggal  : 27 April 2026
*/


// 3. Realisasi subkelas Anjing
public class Anjing extends Anabul {
    public Anjing(String nama) {
        super(nama);
    }

    @Override
    public void gerak() {
        System.out.println("melata");
    }

    @Override
    public void bersuara() {
        System.out.println("guk-guk");
    }
}
