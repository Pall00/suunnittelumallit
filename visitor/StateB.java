package visitor;

public class StateB implements State {
    @Override
    public void performAction(StateContext context, StateVisitor visitor) {
        System.out.println("State B");
        visitor.visitStateB(context);
    }
}
