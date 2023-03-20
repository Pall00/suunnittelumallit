package memento;

public class Main {
    public static void main(String[] args) {
        Arvuuttaja arvuuttaja = new Arvuuttaja();
        Asiakas[] asiakkaat = new Asiakas[5];
        for (int i = 0; i < asiakkaat.length; i++) {
            asiakkaat[i] = new Asiakas(arvuuttaja);
            asiakkaat[i].start();
        }
        for (int i = 0; i < asiakkaat.length; i++) {
            try {
                asiakkaat[i].join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Peli päättyi!");
    }
}
