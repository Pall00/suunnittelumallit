package visitor;

public interface State {
    void performAction(StateContext context, StateVisitor visitor);
}
