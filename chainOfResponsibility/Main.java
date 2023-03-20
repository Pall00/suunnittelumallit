package chainOfResponsibility;

public class Main {
    
    public static void main(String[] args) {
        SalaryHandler supervisor = new Supervisor();
        SalaryHandler departmentManager = new DepartmentManager();
        SalaryHandler ceo = new CEO();

        supervisor.setSuccessor(departmentManager);
        departmentManager.setSuccessor(ceo);

        double amount1 = 0.01; // Alle 2 %
        double amount2 = 0.03; // 2 % - 5 %
        double amount3 = 0.1; // Yli 5 %

        supervisor.handleRequest(amount1);
        supervisor.handleRequest(amount2);
        supervisor.handleRequest(amount3);


    }
}
