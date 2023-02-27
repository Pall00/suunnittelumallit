package decorator;

public class Main {
    public static void main(String[] args) {
        // Luodaan kolme mieleistä pizzaa
        Pizza pizza1 = new Pineapple(new Cheese(new EmptyPizza()));
        Pizza pizza2 = new Pepperoni(new Cheese(new Pineapple(new EmptyPizza())));
        Pizza pizza3 = new Pepperoni(new Cheese(new Pineapple(new Bbq(new EmptyPizza()))));

        // Tulostetaan pizzamenun hintoineen
        System.out.println("Pizza 1: " + pizza1.getDescription() + " Hinta: " + pizza1.getCost() + "e");
        System.out.println("Pizza 2: " + pizza2.getDescription() + " Hinta: " + pizza2.getCost() + "e");
        System.out.println("Pizza 3: " + pizza3.getDescription() + " Hinta: " + pizza3.getCost() + "e");
    }
}
