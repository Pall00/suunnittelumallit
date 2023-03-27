package decorator;

class Cheese extends ToppingDecorator {
    public Cheese(Pizza pizza) {
        super(pizza);
    }

    public String getDescription() {
        return super.getDescription() + ", juusto";
    }

    public double getCost() {
        return super.getCost() + 1.00;
    }
}
