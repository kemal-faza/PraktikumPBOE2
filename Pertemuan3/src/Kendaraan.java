public class Kendaraan {
    private String noPlat, jenis;

    public Kendaraan(String noPlat, String jenis) {
        this.noPlat = noPlat;

        if (jenis == "motor" || jenis == "mobil" || jenis == "") {
            this.jenis = jenis;
        }
    }

    public Kendaraan() {
        this("", "");
    }

    public String getNoPlat() {
        return this.noPlat;
    }

    public String getJenis() {
        return this.jenis;
    }

    public void setNoPlat(String newNoPlat) {
        this.noPlat = newNoPlat;
    }

    public void setJenis(String newJenis) {
        if (newJenis == "motor" || newJenis == "mobil") {
            this.jenis = newJenis;
        }
    }
}
