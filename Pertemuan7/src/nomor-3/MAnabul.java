/* NIM  : 24060124120013
   Nama : Muhamad Kemal Faza
   Tanggal  : 27 April 2026
*/

public class MAnabul {
    public static void main(String[] args) {

        // 3. Implementasi kelas Anjing, Kucing, dan Burung
        Anabul[] daftarAnabul = {
                new Anjing("Rex"),
                new Kucing("Luna"),
                new Burung("Tweety")
        };

        for (Anabul hewan : daftarAnabul) {
            // 3. Simulasi bunyi dan gerakannya
            hewan.bersuara();
            hewan.gerak();
        }
    }
}
