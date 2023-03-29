package visitor;

public class StateContextImpl implements StateContext {
    private State state;

    public StateContextImpl(State initialState) {
        this.state = initialState;
    }

    @Override
    public void setState(State state) {
        this.state = state;
    }

    public void performAction(StateVisitor visitor) {
        state.performAction(this, visitor);
    }
}
