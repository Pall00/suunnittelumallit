package prototype;

class Viisari implements Cloneable {
    private int arvo;

    public Viisari(int arvo) {
        this.arvo = arvo;
    }

    public void setArvo(int arvo) {
        this.arvo = arvo;
    }

    public int getArvo() {
        return arvo;
    }

    @Override
    protected Viisari clone() throws CloneNotSupportedException {
        return (Viisari) super.clone();
    }
}
