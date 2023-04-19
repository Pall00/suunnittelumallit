package builder;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        BurgerDirector director = new BurgerDirector();
        HesburgerBuilder hesburgerBuilder = new HesburgerBuilder();
        McDonaldsBuilder mcdonaldsBuilder = new McDonaldsBuilder();

        director.setBuilder(hesburgerBuilder);
        director.constructBurger();
        ArrayList<Object> hesburgerBurger = hesburgerBuilder.getBurger();
        System.out.println("Hesburger-burger: " + hesburgerBurger);

        director.setBuilder(mcdonaldsBuilder);
        director.constructBurger();
        StringBuilder mcdonaldsBurger = mcdonaldsBuilder.getBurger();
        System.out.println("McDonalds-burger: " + mcdonaldsBurger);
    }
}
