package visitor;

public interface StateContext {
    void setState(State state);
    void performAction(StateVisitor visitor);
}
