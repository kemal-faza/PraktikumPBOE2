package classDiagram;

public class PelatihanReguler extends Pelatihan {
    private int durasiBulan;
    private String level;
    private String metode;

    public PelatihanReguler(String kode, String nama, int kuota, String namaInstruktur, double harga,
            int durasiBulan, String level, String metode) {
        super(kode, nama, kuota, namaInstruktur, harga);
        this.durasiBulan = durasiBulan;
        this.level = level;
        this.metode = metode;
    }

    public int getDurasiBulan() {
        return durasiBulan;
    }

    public void setDurasiBulan(int durasiBulan) {
        this.durasiBulan = durasiBulan;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getMetode() {
        return metode;
    }

    public void setMetode(String metode) {
        this.metode = metode;
    }

    @Override
    public void tampilkanDetail() {
        System.out.println("=== Detail Pelatihan Reguler ===");
        super.tampilkanDetail();
        System.out.println("Durasi Bulan     : " + durasiBulan);
        System.out.println("Level            : " + level);
        System.out.println("Metode           : " + metode);
    }
}
