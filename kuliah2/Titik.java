package kuliah2;

class Titik {
    // atribut
    protected double absis, ordinat;

    // method
    public Titik() {
        this(0, 0);
    }

    public Titik(double x, double y) {
        this.absis = x;
        this.ordinat = y;
    }

    public double getAbsis() {
        return this.absis;
    }

    public double getOrdinat() {
        return this.ordinat;
    }

    public void setAbsis(double x) {
        this.absis = x;
    }

    public void setOrdinat(double y) {
        this.ordinat = y;
    }

    public void geserTitik(double x, double y) {
        setAbsis(getAbsis() + x);
        ;
        setOrdinat(getOrdinat() + y);
        ;
    }

    public int getKuadran() {
        if (getAbsis() > 0 && getOrdinat() > 0) {
            return 1;
        } else if (getAbsis() < 0 && getOrdinat() > 0) {
            return 2;
        } else if (getAbsis() < 0 && getOrdinat() < 0) {
            return 3;
        } else {
            return 4;
        }
    }

    public double jarak() {
        return Math.sqrt(Math.pow(getAbsis(), 2.0) + Math.pow(getOrdinat(), 2));
    }

    public double jarak(Titik T) {
        return Math.sqrt(Math.pow(getAbsis() - T.absis, 2.0) + Math.pow(getOrdinat() - T.ordinat, 2));
    }

    public void refleksiX() {
        setOrdinat(getOrdinat() * -1);
    }

    public void refleksiY() {
        setAbsis(getAbsis() * -1);
    }

    public Titik getTitikRefleksiX() {
        Titik titikBaru = new Titik(getAbsis(), getOrdinat() * -1);
        return titikBaru;
    }

    public Titik getTitikRefleksiY() {
        Titik titikBaru = new Titik(getAbsis() * -1, getOrdinat());
        return titikBaru;
    }
}