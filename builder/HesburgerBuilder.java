package builder;

import java.util.ArrayList;

class HesburgerBuilder implements BurgerBuilder {
    private ArrayList<Object> ingredients;

    public HesburgerBuilder() {
        this.ingredients = new ArrayList<>();
    }

    @Override
    public void addPihvi() {
        ingredients.add(new HesburgerPihvi());
    }

    @Override
    public void addSalaatti() {
        ingredients.add(new JäävuoriSalaatti());
    }

    @Override
    public ArrayList<Object> getBurger() {
        return ingredients;
    }
}
