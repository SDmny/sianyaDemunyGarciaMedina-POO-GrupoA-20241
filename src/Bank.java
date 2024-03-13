import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Bank {
    // Array + Variables globales
    static Scanner scanner = new Scanner(System.in);
    public static ArrayList<BankAccount> accounts = new ArrayList<>();
    public static void seeAccounts(){
        int numId=1;
        Iterator<BankAccount> bankIterator = accounts.iterator();
        System.out.println("Lista de cuentas\n");
        System.out.println("Numero de cuenta\tTipo de cuenta\tSaldo en cuenta");
        while (bankIterator.hasNext()){
            BankAccount bank = bankIterator.next();
            System.out.println(numId+" - "+bank.getAccountNumber() +"\t"+ bank.getType() +"\t"+ bank.getAmount());
            numId++;
        }
        System.out.println("");
    }
    public static void seeAccount(BankAccount account){
        System.out.println("\nNumero de cuenta: "+account.getAccountNumber());
        System.out.println("Tipo de cuenta: "+account.getType());
        System.out.println("Saldo en cuenta: "+account.getAmount());
    }

    // Setters personalizados
    private static char setType(){
        char type = scanner.next().toUpperCase().charAt(0);;
        if (type != 'A' && type != 'B' && type != 'C') {
            System.out.println("Tipo de cuenta no válido");
            System.out.print("Tipo de cuenta: ");
            type = setType();
        }
        return type;
    }
    private static long setNumberAccount(){
        long number = scanner.nextLong();
        if (number <= 0){
            System.out.println("Numero invalido");
            System.out.print("Numero de cuenta: ");
            number = setNumberAccount();
        }
        return number;
    }
    public static void addAccount(){
        int numEmployee;
        long accountNumber;
        char type;
        System.out.print("Ingrese numero de empleado (Visible en opción 4 - Ingrese 0 para cancelar): ");
        numEmployee = scanner.nextInt()-1;
        if (numEmployee >= 0){
            System.out.println("Ingrese la información de la nueva cuenta");
            System.out.print("Numero de cuenta: ");
            accountNumber = setNumberAccount();
            System.out.print("Tipo de cuenta: ");
            type = setType();
            BankAccount account = new BankAccount(accountNumber, type);
            Employee.employeeArray.get(numEmployee).getAccountsArray().add(account);
            Bank.accounts.add(account);
            System.out.println("Cuenta agregada");
        } else {
            System.out.println("Operacion cancelada");
        }
    }

    // Metodos extras
    public static void createEmployee(){
        String name, lastName;
        int aux;
        System.out.println("¿Desea crear un usuario con cuenta?\n1 - Sí\n2 - No");
        aux = scanner.nextInt();
        if (aux == 2){
            System.out.print("Nombre: ");
            name = scanner.next();
            System.out.print("Apellido: ");
            lastName = scanner.next();
            Employee employee = new Employee(name, lastName);
            Employee.employeeArray.add(employee);
            System.out.println("Empleado agregado");
            seeEmployee(Employee.employeeArray.get(Employee.employeeArray.size()-1));
        }
        else if (aux == 1){
            createEmployeeAndAcount();
            seeEmployee(Employee.employeeArray.get(Employee.employeeArray.size()-1));
        }
        else {
            System.out.println("Opcion inexistente");
        }
    }
    public static void createEmployeeAndAcount(){
        String name, lastName;
        long account;
        char type;
        try{
            System.out.print("Nombre: ");
            name = scanner.next();
            System.out.print("Apellido: ");
            lastName = scanner.next();
            System.out.print("Numero de cuenta: ");
            account = setNumberAccount();
            System.out.print("Tipo de cuenta: ");
            type = setType();
            Employee employee = new Employee(name, lastName, account, type);
            Employee.employeeArray.add(employee);
            System.out.println("Empleado agregado");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error en el ingreso de los datos");
        }
    }

    public static void seeEmployees(){
        int numId=1;
        Iterator<Employee> employeeIterator = Employee.employeeArray.iterator();
        System.out.println("Lista de empleados\n");
        while (employeeIterator.hasNext()){
            Employee employee = employeeIterator.next();
            if (employee.getAccountsArray().size() == 1) {
                System.out.println(numId+" - Empleado: "+employee.getName()+"\tNumero de cuenta: "+employee.getAccount().getAccountNumber()+"\tSaldo: "+employee.getAccount().getAmount()+"\tTipo de cuenta: "+employee.getAccount().getType());
            } else {
                System.out.println(numId+" - Empleado: "+employee.getName()+"\tCantidad de cuentas: "+employee.getAccountsArray().size());
            }
            numId++;
        }
        System.out.println("");
    }
    public static void seeEmployee(Employee employee){
        System.out.println("\nNombre: "+employee.getName());
        System.out.println("Apellido: "+employee.getLastName());
        seeEmployeeAcounts(employee);
    }
    private static void seeEmployeeAcounts(Employee employee){
        for (int i = 0; i<employee.getAccountsArray().size() ;i++){
            System.out.println("\nCuenta " + (i+1));
            System.out.println("Numero de cuenta: " + employee.getAccountsArray().get(i).getAccountNumber());
            System.out.println("Tipo de cuenta: "+ employee.getAccountsArray().get(i).getType());
            System.out.println("Saldo en cuenta: "+ employee.getAccountsArray().get(i).getAmount());
        }
    }

}

