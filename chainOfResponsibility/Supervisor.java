package chainOfResponsibility;

public class Supervisor extends SalaryHandler{
    private double ALLOWABLE = 0.02;

    @Override
    public void handleRequest(double amount) {
       if(amount <= ALLOWABLE){
        System.out.println("Lähiesimies hoitaa palkkapyynnön.");
       } else if(successor != null) {
        successor.handleRequest(amount);
       } else {
        throw new IllegalArgumentException("Pyyntöä ei voida hoitaa");
       }
    }
    
}
