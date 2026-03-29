/*
    Anggota Kelompok:
    1. Muchammad Yuda Tri Ananda		(24060124110142)
    2. Muhammad Zaidaan Ardiyansyah		(24060124140200)
    3. Muhamad Kemal Faza			    (24060124120013)
    4. Anintya Abhi Wiryateja			(24060124130053)
    5. Nadia Azura Nurhaniya 			(24060124120019)
*/
public class Admin extends User {
    public Admin(String id, String name, String email) {
        super(id, name, email);
    }

    public void manageProducts() {
        System.out.println("Admin " + name + " sedang mengelola data produk...");
        System.out.println("Aksi tersedia: tambah, ubah, hapus, dan cek stok produk.");
    }

    public void manageUsers() {
        System.out.println("Admin " + name + " sedang mengelola data pengguna...");
        System.out.println("Aksi tersedia: verifikasi akun, update profil, dan nonaktifkan user.");
    }
}
