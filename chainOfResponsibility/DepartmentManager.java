package chainOfResponsibility;

public class DepartmentManager extends SalaryHandler{
    private double ALLOWABLE = 0.05;

    @Override
    public void handleRequest(double amount) {
        if(amount <= ALLOWABLE){
            System.out.println("Yksikön päällikkö hoitaa palkka pyynnön.");
        } else if(successor != null){
            successor.handleRequest(amount);
        } else{
            throw new IllegalArgumentException("Pyyntöä ei voida hoitaa.");
        }
    }
    
}
