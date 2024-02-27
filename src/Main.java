import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // variables
        Scanner read = new Scanner(System.in);
        int act;
        System.out.println("Menu\n1 - Rectangulo\n2 - Empleado\n3 - Calculadora de Impuestos\n0 - Salir");
        act = read.nextInt();
        // do while + switch
        do{
            System.out.println();
            switch (act){
                case 1: // Rectangulo
                    Rectangulo.askNumber();
                    break;
                case 2: // Empleado
                    System.out.println("Salario: "+Empleado.calculateSalary(750));
                    System.out.println("Salario: "+Empleado.calculateSalary(1200.5, 67));
                    System.out.println("Salario: "+Empleado.calculateSalary(820, 150.5, 7));
                    break;
                case 3: // CalculadoraImpuestos
                    System.out.printf("\nImpuestos: %.2f", CalculadoraImpuestos.calculateTaxes(7500));
                    System.out.printf("\nImpuestos: %.2f", CalculadoraImpuestos.calculateTaxes(12500, 75));
                    System.out.printf("\nImpuestos: %.2f", CalculadoraImpuestos.calculateTaxes(50, 7500, 5000));
                    System.out.printf("\nImpuestos: %.2f", CalculadoraImpuestos.calculateTaxes(50, 7500, 500));
                    System.out.println();
                    break;
                default:
            }
            System.out.println("\nMenu\n1 - Rectangulo\n2 - Empleado\n3 - Calculadora de Impuestos\n0 - Salir");
            act = read.nextInt();
        }while (act!=0);
    }
}