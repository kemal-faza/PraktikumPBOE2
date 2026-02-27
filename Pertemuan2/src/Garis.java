public class Garis {
    private Titik TAwal, Takhir;
    static int counterGaris;

    // Kontruktor dengan parameter
    Garis(Titik TAwal, Titik TAkhir) {
        this.TAwal = TAwal;
        this.Takhir = TAkhir;
        counterGaris++;
    }

    // Kontruktor tanpa parameter
    public Garis() {
        Titik TAwal = new Titik(0, 0);
        Titik TAkhir = new Titik(1, 1);
        this(TAwal, TAkhir);
        counterGaris++;
    }

    // Selektor titik awal
    public Titik getTitikAwal() {
        return this.TAwal;
    }

    // selektor titik akhir
    public Titik getTitikAkhir() {
        return this.Takhir;
    }

    // mutator titik awal
    public void setTitikAwal(Titik T) {
        this.TAwal = T;
    }

    // mutator titik akhir
    public void setTitikAkhir(Titik T) {
        this.Takhir = T;
    }

    // selektor untuk counter garis
    public int getCounterGaris() {
        return counterGaris;
    }

    // mengemmbalikan panjang garis (jarak antara titik awal dan titik akhir)
    public double getPanjang() {
        return getTitikAwal().getJarak(getTitikAkhir());
    }

    // mengembalikan nilai gradien garis
    public double getGradien() {
        return Math.abs(getTitikAkhir().getOrdinat() - getTitikAwal().getOrdinat())
                / Math.abs(getTitikAkhir().getAbsis() - getTitikAwal().getAbsis());
    }

    // mengembalikan titik tengah dari garis
    public Titik titikTengah() {
        Titik THasil = new Titik((getTitikAwal().getAbsis() + getTitikAkhir().getAbsis()) / 2,
                (getTitikAwal().getOrdinat() + getTitikAkhir().getOrdinat()) / 2);
        return THasil;
    }

    // memeriksa apakah suatu garis sejajar dengan garis lainnya
    public boolean isSejajar(Garis G) {
        return getGradien() == G.getGradien();
    }

    // memeriksa apakah suatu garis itu tegak lurus dengan garis lainnya
    public boolean isTegakLurus(Garis G) {
        return getGradien() * G.getGradien() == -1;
    }

    // menampilkan titik awal dan titik akhir dari suatu garis
    public void printGaris() {
        System.out.println(getTitikAwal());
        System.out.println(getTitikAkhir());
    }

    // menampilkan suatu garis dalam persamaan garis lurus
    public String getPersamaanGaris() {
        double m = getGradien();
        double c = getTitikAwal().getOrdinat() - (m * getTitikAwal().getAbsis());
        return "y = " + m + "x + " + c;
    }
}
