/* NIM  : 24060124120013
   Nama : Muhamad Kemal Faza
   Tanggal  : 27 April 2026
*/

public class MCivitasAkademika {
    public static void main(String[] args) {

        // 2 Objek Dosen
        Dosen d1 = new Dosen("Dr. Budi", "19800101");
        Dosen d2 = new Dosen("Dr. Siti", "19850202");

        // 5 Objek Mahasiswa
        Mahasiswa m1 = new Mahasiswa("Andi", "2401");
        Mahasiswa m2 = new Mahasiswa("Budi", "2402");
        Mahasiswa m3 = new Mahasiswa("Caca", "2403");
        Mahasiswa m4 = new Mahasiswa("Deni", "2404");
        Mahasiswa m5 = new Mahasiswa("Euis", "2405");

        // Set Dosen Wali
        m1.setWali(d1);
        m2.setWali(d1);
        m3.setWali(d1);
        m4.setWali(d2);
        m5.setWali(d2);

        // Simulasi Menampilkan Data Mahasiswa Individual
        System.out.println("=== Detail Data Mahasiswa ===");
        m1.tampilDataMahasiswa();
        m2.tampilDataMahasiswa();
        m3.tampilDataMahasiswa();
        m4.tampilDataMahasiswa();
        m5.tampilDataMahasiswa();

        System.out.println("\n=== Simulasi Kelas Seminar ===");
        // Membuat objek Seminar
        Seminar seminarPBO = new Seminar();

        // Registrasi Peserta (Dosen dan Mahasiswa)
        seminarPBO.registrasi(d1);
        seminarPBO.registrasi(d2);
        seminarPBO.registrasi(m1);
        seminarPBO.registrasi(m2);
        seminarPBO.registrasi(m3);
        seminarPBO.registrasi(m4);
        seminarPBO.registrasi(m5);

        // 1. Menampilkan total peserta
        System.out.println("Total Peserta Seminar: " + seminarPBO.countPeserta());

        // 2. Menampilkan daftar semua peserta
        System.out.println("\nDaftar Peserta:");
        seminarPBO.tampilPeserta();

        // 3. Menampilkan jumlah khusus mahasiswa (menggunakan instanceof di dalam Seminar)
        System.out.println("\nJumlah Peserta Kategori Mahasiswa: " + seminarPBO.countMahasiswa());
    }
}
