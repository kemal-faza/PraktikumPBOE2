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
    public void getCounterGaris() {
        System.out.println(counterGaris);
    }

    public double panjangGaris() {
        return getTitikAwal().getJarak(getTitikAkhir());
    }

    public double gradien() {
        return Math.abs(getTitikAkhir().getOrdinat() - getTitikAwal().getOrdinat())
                / Math.abs(getTitikAkhir().getAbsis() - getTitikAwal().getAbsis());
    }

}
