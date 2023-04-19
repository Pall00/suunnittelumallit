package builder;

class BurgerDirector {
    private BurgerBuilder builder;

    public void setBuilder(BurgerBuilder builder) {
        this.builder = builder;
    }

    public void constructBurger() {
        builder.addPihvi();
        builder.addSalaatti();
    }
}
