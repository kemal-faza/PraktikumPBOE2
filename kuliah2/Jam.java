package kuliah2;

public class Jam {
    protected int jam, menit, detik;

    public Jam(int jam, int menit, int detik) {
        this.jam = jam;
        this.menit = menit;
        this.detik = detik;
    }
    
    public int getJam() {
        return this.jam;
    }

    public int getMenit() {
        return this.menit;
    }

    public int getDetik() {
        return this.detik;
    }

    public void setJam(int jam) {
        this.jam = jam;
    }

    public void setMenit(int menit) {
        this.menit = menit;
    }

    public void setDetik(int detik) {
        this.detik = detik;
    }
}
