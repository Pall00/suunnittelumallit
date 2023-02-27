package decorator;

public class Bbq extends ToppingDecorator {
    public Bbq(Pizza pizza) {
        super(pizza);
    }

    public String getDescription() {
        return pizza.getDescription() + ", bbq-kastike";
    }

    public double getCost() {
        return pizza.getCost() + 0.65;
    }
}
