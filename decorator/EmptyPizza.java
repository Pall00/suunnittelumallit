package decorator;

public class EmptyPizza implements Pizza {
    public String getDescription() {
        return "Pizzapohja";
    }

    public double getCost() {
        return 4.00;
    }
}