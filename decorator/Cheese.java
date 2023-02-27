package decorator;

class Cheese extends ToppingDecorator {
    public Cheese(Pizza pizza) {
        super(pizza);
    }

    public String getDescription() {
        return pizza.getDescription() + ", juusto";
    }

    public double getCost() {
        return pizza.getCost() + 1.00;
    }
}
