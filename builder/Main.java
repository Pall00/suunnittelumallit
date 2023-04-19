package builder;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Rakennetaan Hesburger-hampurilainen
        HesburgerBuilder hesburgerBuilder = new HesburgerBuilder();
        hesburgerBuilder.lisääSalaatti();
        hesburgerBuilder.lisääPihvi();
        hesburgerBuilder.lisääJuusto();
        ArrayList<HampurilaisenOsa> hesburgerBurger = hesburgerBuilder.getBurger();

        System.out.println("Hesburger hampurilainen sisältää:");
        for (HampurilaisenOsa osa : hesburgerBurger) {
            System.out.println(osa.getClass().getSimpleName());
        }

        // Rakennetaan McDonalds-hampurilainen
        McDonaldsBuilder mcdonaldsBuilder = new McDonaldsBuilder();
        mcdonaldsBuilder.lisääSalaatti();
        mcdonaldsBuilder.lisääPihvi();
        mcdonaldsBuilder.lisääJuusto();
        StringBuilder mcdonaldsBurger = mcdonaldsBuilder.getBurger();

        System.out.println("\nMcDonalds hampurilainen sisältää:");
        System.out.println(mcdonaldsBurger.toString());
    }
}