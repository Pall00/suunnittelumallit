package visitor;

class ConcreteStateA implements State {
    @Override
    public void handle(Context context) {
        System.out.println("Tila A");
        context.accept(new StateChangeVisitor());
    }
}
