package factorymethod;

public class Oppilas extends AterioivaOtus {

    public Ruoka createRuoka(){
        return new Nakki();
    };

    public Juoma createJuoma(){
        return new EsJuoma();
    };

}
