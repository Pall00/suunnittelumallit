package abstractfactory;

class AdidasTehdas implements VaateTehdas {
    public Hattu createHattu() {
        return new AdidasHattu();
    }
    public Paita createPaita() {
        return new AdidasPaita();
    }
    public Housut createHousut() {
        return new AdidasHousut();
    }
    public Tossut createTossut() {
        return new AdidasTossut();
    }
}