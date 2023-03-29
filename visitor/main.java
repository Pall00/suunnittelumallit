package visitor;

public class Main {
    public static void main(String[] args) {
        State initialState = new StateA();
        StateContext context = new StateContextImpl(initialState);
        StateVisitor visitor = new StateVisitorImpl();

        for (int i = 0; i < 5; i++) {
            context.performAction(visitor);
        }
    }
}
