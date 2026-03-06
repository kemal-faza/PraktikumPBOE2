package kuliah2;

public class Main {
    public static void main(String[] args) {
        Titik myTitik = new Titik(2, 3);
        Titik myTitik2 = new Titik(-1, -1);

        System.out.println(myTitik.getAbsis());
        System.out.println(myTitik.jarak());
        System.out.println(myTitik.jarak(myTitik2));
    }
}
