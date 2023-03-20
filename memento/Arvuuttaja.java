package memento;


import java.util.Random;

// Originator-luokka
public class Arvuuttaja {
    private int arvottuLuku;
    
    public Memento liityPeliin() {
        Random random = new Random();
        arvottuLuku = random.nextInt(100) + 1;
        return new Memento(arvottuLuku);
    }
    
    public boolean arvaaLuku(Memento memento, int arvaus) {
        if (memento.getArvottuLuku() == arvaus) {
            return true;
        } else {
            return false;
        }
    }
}