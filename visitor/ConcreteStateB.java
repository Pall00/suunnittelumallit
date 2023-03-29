package visitor;

import javax.naming.Context;

class ConcreteStateB implements State {
    @Override
    public void handle(Context context) {
        System.out.println("Tila B");
        context.accept(new StateChangeVisitor());
    }
}
