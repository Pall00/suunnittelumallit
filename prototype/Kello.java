package prototype;

class Kello implements Cloneable {
    private Viisari tunti;
    private Viisari minuutti;
    private Viisari sekunti;

    public Kello(int tunti, int minuutti, int sekunti) {
        this.tunti = new Viisari(tunti);
        this.minuutti = new Viisari(minuutti);
        this.sekunti = new Viisari(sekunti);
    }

    // Matalakopiointi
    @Override
    protected Kello clone() throws CloneNotSupportedException {
        return (Kello) super.clone();
    }

    // Syväkopiointi
    public Kello syvaKopio() throws CloneNotSupportedException {
        Kello kopio = (Kello) super.clone();
        kopio.tunti = this.tunti.clone();
        kopio.minuutti = this.minuutti.clone();
        kopio.sekunti = this.sekunti.clone();
        return kopio;
    }

    public void setAika(int tunti, int minuutti, int sekunti) {
        this.tunti.setArvo(tunti);
        this.minuutti.setArvo(minuutti);
        this.sekunti.setArvo(sekunti);
    }

    @Override
    public String toString() {
        return String.format("%02d:%02d:%02d", tunti.getArvo(), minuutti.getArvo(), sekunti.getArvo());
    }
}
