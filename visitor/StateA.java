package visitor;

public class StateA implements State {
    @Override
    public void performAction(StateContext context, StateVisitor visitor) {
        System.out.println("State A");
        visitor.visitStateA(context);
    }
}
