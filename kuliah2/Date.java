package kuliah2;

public class Date {
    protected int tanggal, bulan, tahun;

    public Date(int tanggal, int bulan, int tahun) {
        this.tanggal = tanggal;
        this.bulan = bulan;
        this.tahun = tahun;
    }

    public int getTanggal() {
        return this.tanggal;
    }

    public int getBulan() {
        return this.bulan;
    }

    public int getTahun() {
        return this.tahun;
    }

    public void setTanggal(int tanggal) {
        this.tanggal = tanggal;
    }

    public void setBulan(int bulan) {
        this.bulan = bulan;
    }

    public void setTahun(int tahun) {
        this.tahun = tahun;
    }
}
