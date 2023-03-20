package memento;

import java.util.Random;

public class Asiakas extends Thread {
    private Arvuuttaja arvuuttaja;
    private Memento memento;
    
    public Asiakas(Arvuuttaja arvuuttaja) {
        this.arvuuttaja = arvuuttaja;
    }
    
    public void run() {
        memento = arvuuttaja.liityPeliin();
        int arvaus = 0;
        while (!arvuuttaja.arvaaLuku(memento, arvaus)) {
            Random random = new Random();
            arvaus = random.nextInt(100) + 1;
        }
        System.out.println("Asiakas " + this.getId() + " arvasi oikein!");
    }
}
