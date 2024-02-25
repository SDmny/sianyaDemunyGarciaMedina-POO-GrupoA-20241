public class Empleado {
    // Metodos
    public static double calcularSalario(double bSalary){
        double salary = bSalary;
        return salary;
    }
    public static double calcularSalario(double bSalary, double bonus){
        double salary = bSalary+bonus;
        return salary;
    }
    public static double calcularSalario(double bSalary, double bonus, int hrs){
        double salary = bSalary+bonus+(hrs*20);
        return salary;
    }
}
