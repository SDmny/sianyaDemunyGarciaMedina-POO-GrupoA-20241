import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Menu
        Scanner scanner = new Scanner(System.in);
        System.out.println("Menu ------------------------------------");
        System.out.print("1 - Crear empleado\n2 - Crear cuenta\n3 - Ver empleado\n4 - Ver lista de empleados\n5 - Ver cuenta\n6 - Ver lista de cuentas\n7 - Realizar operación\n0 - Salir\nElegir: ");
        int action = scanner.nextInt(), aux, aux2;
        double amount;
        while (action!=0) {
            switch (action){
                case 1: // Crear empleado
                    Employee.createEmployee();
                    break;
                case 2: // Crear cuenta
                    Employee.addAccount();
                    break;
                case 3: // Ver empleado
                    System.out.println("Ingrese numero de empleado (Visible en opción 4 - Ingrese 0 para cancelar)");
                    aux = scanner.nextInt();
                    if(aux > 0){
                        Employee.seeEmployee(Employee.employeeArray.get(aux-1));
                    }
                    break;
                case 4: // Ver lista de empleados
                    Employee.seeEmployees();
                    break;
                case 5: // Ver cuenta
                    System.out.println("Ingrese numero de cuenta (Visible en opción 6 - Ingrese 0 para cancelar)");
                    aux = scanner.nextInt();
                    if(aux > 0){
                        Bank.seeAccount(Bank.accounts.get(aux-1));
                    }
                    break;
                case 6: // Ver lista de cuentas
                    Bank.seeAccounts();
                    break;
                case 7: // Realizar operación
                    System.out.println("Ingrese numero de cuenta (Visible en opción 6 - Ingrese 0 para cancelar)");
                    aux = scanner.nextInt()-1;
                    if(aux >= 0){
                        System.out.println("Seleccione operación a realizar\n1 - Deposito\n2 - Retiro");
                        aux2 = scanner.nextInt();
                        if(aux2 == 1){
                            System.out.print("Ingrese cantidad a depositar: ");
                            amount = scanner.nextDouble();
                            Bank.accounts.get(aux).addAmount(amount);
                        } else if(aux2 == 2) {
                            System.out.print("Ingrese cantidad a retirar: ");
                            amount = scanner.nextDouble();
                            Bank.accounts.get(aux).substractAmount(amount);
                        } else {
                            System.out.println("Operación inexistente");
                        }
                    } else {
                        System.out.println("Operación cancelada");
                    }
                    break;
                default:
            }
            System.out.println("\nMenu ------------------------------------");
            System.out.print("1 - Crear empleado\n2 - Crear cuenta\n3 - Ver empleado\n4 - Ver lista de empleados\n5 - Ver cuenta\n6 - Ver lista de cuentas\n7 - Realizar operación\n0 - Salir\nElegir: ");
            action = scanner.nextInt();
        }
    }
}