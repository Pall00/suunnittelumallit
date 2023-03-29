package visitor;

import javax.naming.Context;

public class Main {
    public static void main(String[] args) {
        Context context = new Context(new ConcreteStateA());

        for (int i = 0; i < 5; i++) {
            context.request();
        }
    }
}