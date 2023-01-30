package abstractfactory;

class BossTehdas implements VaateTehdas {
    @Override
    public Hattu createHattu() {
        return new BossHattu();
    }
    @Override
    public Paita createPaita() {
        return new BossPaita();
    }
    @Override
    public Housut createHousut() {
        return new BossHousut();
    }
    @Override
    public Tossut createTossut() {
        return new BossTossut();
    }
}