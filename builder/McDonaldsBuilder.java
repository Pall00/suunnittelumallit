package builder;

class McDonaldsBuilder implements BurgerBuilder {
    private StringBuilder ingredients;

    public McDonaldsBuilder() {
        this.ingredients = new StringBuilder();
    }

    @Override
    public void addPihvi() {
        ingredients.append("McDonaldsPihvi,");
    }

    @Override
    public void addSalaatti() {
        ingredients.append("JäävuoriSalaatti,");
    }

    @Override
    public StringBuilder getBurger() {
        return ingredients;
    }
}
    

