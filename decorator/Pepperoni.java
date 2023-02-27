package decorator;

class Pepperoni extends ToppingDecorator {
    public Pepperoni(Pizza pizza) {
        super(pizza);
    }

    public String getDescription() {
        return pizza.getDescription() + ", pepperoni";
    }

    public double getCost() {
        return pizza.getCost() + 0.75;
    }
}
