package visitor;

public class StateVisitorImpl implements StateVisitor {
    @Override
    public void visitStateA(StateContext context) {
        // Decide whether to change state
        context.setState(new StateB());
    }

    @Override
    public void visitStateB(StateContext context) {
        // Decide whether to change state
        context.setState(new StateA());
    }
}
