package builder;

public class McDonaldsBuilder extends HampurilaisBuilder {
    private StringBuilder burger;

    public McDonaldsBuilder() {
        burger = new StringBuilder();
    }

    public void lisääSalaatti() {
        burger.append("Jäävuorisalaatti\n");
    }

    public void lisääPihvi() {
        burger.append("Pihvi\n");
    }

    public void lisääJuusto() {
        burger.append("Juusto");
    }

    public StringBuilder getBurger() {
        return burger;
    }
}
