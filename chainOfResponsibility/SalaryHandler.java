package chainOfResponsibility;

public abstract class SalaryHandler {
    protected SalaryHandler successor;

    public void setSuccessor(SalaryHandler successor){
        this.successor = successor;
    }
   
    public abstract void handleRequest(double amount);

}
