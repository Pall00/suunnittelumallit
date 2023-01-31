package composite;


public class Main {

    public static void main(String[] args) {
        Tietokone tietokone = new Tietokone();
        Emolevy emolevy = new Emolevy();
        Kotelo kotelo = new Kotelo();
        Muistipiiri muisti = new Muistipiiri();
        Naytonohjain naytonohjain = new Naytonohjain();
        Prosessori prosessori = new Prosessori();
        Verkkokortti verkkokortti = new Verkkokortti();


        tietokone.addComponent(emolevy);
        tietokone.addComponent(kotelo);
        tietokone.addComponent(muisti);
        tietokone.addComponent(naytonohjain);
        tietokone.addComponent(prosessori);
        tietokone.addComponent(verkkokortti);

        tietokone.printComponentsAndHinta();


    }}
