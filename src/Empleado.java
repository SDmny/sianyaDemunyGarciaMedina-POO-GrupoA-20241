public class Empleado {
    // Metodos
    public static double calculateSalary(double bSalary){
        double salary = bSalary;
        return salary;
    }
    public static double calculateSalary(double bSalary, double bonus){
        double salary = bSalary+bonus;
        return salary;
    }
    public static double calculateSalary(double bSalary, double bonus, int hrs){
        double salary = bSalary+bonus+(hrs*20);
        return salary;
    }
}
