package factorymethod;

public class Opettaja extends AterioivaOtus {

    public Ruoka createRuoka(){
        return new Pihvi();
    };

    public Juoma createJuoma(){
        return new Vesi();
    };

}
