package decorator;

class Pineapple extends ToppingDecorator {
    public Pineapple(Pizza pizza) {
        super(pizza);
    }

    public String getDescription() {
        return pizza.getDescription() + ", ananas";
    }

    public double getCost() {
        return pizza.getCost() + 0.50;
    }
}
