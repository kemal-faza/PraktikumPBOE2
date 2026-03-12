package pbo_kelompok.src;

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
