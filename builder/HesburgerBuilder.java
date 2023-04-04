package builder;

import java.util.ArrayList;

public class HesburgerBuilder extends HampurilaisBuilder {
    private ArrayList<HampurilaisenOsa> osat;

    public HesburgerBuilder() {
        osat = new ArrayList<>();
    }

    public void lisääSalaatti() {
        osat.add(new Salaatti());
    }

    public void lisääPihvi() {
        osat.add(new Pihvi());
    }

    public void lisääJuusto() {
        osat.add(new Juusto());
    }

    public ArrayList<HampurilaisenOsa> getBurger() {
        return osat;
    }
}
