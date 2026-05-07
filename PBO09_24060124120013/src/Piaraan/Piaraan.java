// Nama File    : Piaraan.java
// NIM          : 24060124120013
// Nama         : Muhamad Kemal Faza
// Tanggal      : 7 Mei 2026

package Piaraan;

import java.util.LinkedList;
import java.util.Queue;

public class Piaraan {
    private int nbelm;
    private Queue<Anabul> Lanabul;

    public Piaraan() {
        this.nbelm = 0;
        this.Lanabul = new LinkedList<>();
    }

    public void showAnabul() {
        for (Anabul a : Lanabul) {
            System.out.println(a.getNama());
        }
    }

    public int getNbelm() {
        return this.nbelm;
    }

    public void enqueueAnabul(Anabul anabul) {
        this.Lanabul.add(anabul);
        this.nbelm++;
    }

    public boolean isMember(Anabul anabul) {
        return this.Lanabul.contains(anabul);
    }

    public Anabul getAnabul() {
        return this.Lanabul.peek();
    }

    public Anabul dequeueAnabul() {
        this.nbelm--;
        return this.Lanabul.poll();
    }

    public int countKucing() {
        int count = 0;
        for (Anabul a : Lanabul) {
            if (a instanceof Kucing) {
                count++;
            }
        }
        return count;
    }

    public double bobotKucing() {
        double bobot = 0.0;
        for (Anabul a : Lanabul) {
            if (a instanceof Kucing) {
                bobot += ((Kucing) a).getBobot();
            }
        }
        return bobot;
    }

    public void showJenisAnabul() {
        for (Anabul a : Lanabul) {
            System.out.println(a.getNama() + ", " + a.getClass().getName());
        }
    }
}
