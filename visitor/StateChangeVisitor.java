package visitor;

class StateChangeVisitor implements Visitor {
    @Override
    public void visit(Context context) {
        State currentState = context.getState();
        State nextState;

        if (currentState instanceof ConcreteStateA) {
            nextState = new ConcreteStateB();
        } else {
            nextState = new ConcreteStateA();
        }

        context.setState(nextState);
    }
}
