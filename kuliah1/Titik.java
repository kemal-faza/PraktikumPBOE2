package kuliah1;

class Titik {
    // atribut
    protected double absis, ordinat;

    // method
    public Titik() {
        this.absis = 0;
        this.ordinat = 0;
    }

    double getAbsis() {
        return this.absis;
    }

    double getOrdinat() {
        return this.ordinat;
    }

    void setAbsis(double x) {
        this.absis = x;
    }

    void setOrdinat(double y) {
        this.ordinat = y;
    }
}