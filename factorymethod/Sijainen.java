package factorymethod;

public class Sijainen extends AterioivaOtus {

    public Ruoka createRuoka(){
        return new Peruna();
    };

    public Juoma createJuoma(){
        return new Kahvi();
    };

}
