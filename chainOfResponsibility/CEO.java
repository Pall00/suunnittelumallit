package chainOfResponsibility;

public class CEO extends SalaryHandler{
    private double ALLOWABLE = Double.MAX_VALUE;
   
   
    @Override
    public void handleRequest(double amount) {
       if(amount <= ALLOWABLE){
        System.out.println("Toimitusjohtaja hoitaa pyynnön.");
       } else{
        throw new IllegalArgumentException("Pyyntöä ei voida hoitaa");
       }

    }
    
}
