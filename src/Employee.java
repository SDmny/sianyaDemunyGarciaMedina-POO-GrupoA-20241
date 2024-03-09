import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
public class Employee {
    // Array + Variables globales
    public static ArrayList<Employee> employeeArray = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);
    // Atributos
    private String name;
    private String lastName;
    private BankAccount account;
    private ArrayList<BankAccount> accountsArray = new ArrayList<>();

    // Constructores
    public Employee(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }
    public Employee(String name, String lastName, long accountNumber, char type) {
        this.name = name;
        this.lastName = lastName;
        this.account = new BankAccount(accountNumber, type);
        accountsArray.add(account);
        Bank.accounts.add(account);
    }

    // Getters y Setters
    public String getName() {
        return name;
    }
    public String getLastName() {
        return lastName;
    }
    public BankAccount getAccount() {
        return account;
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
            employeeArray.get(numEmployee).accountsArray.add(account);
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
            employeeArray.add(employee);
            System.out.println("Empleado agregado");
            seeEmployee(employeeArray.get(employeeArray.size()-1));
        }
        else if (aux == 1){
            createEmployeeAndAcount();
            seeEmployee(employeeArray.get(employeeArray.size()-1));
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
            employeeArray.add(employee);
            System.out.println("Empleado agregado");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error en el ingreso de los datos");
        }
    }

    public static void seeEmployees(){
        int numId=1;
        Iterator<Employee> employeeIterator = employeeArray.iterator();
        System.out.println("Lista de empleados\n");
        while (employeeIterator.hasNext()){
            Employee employee = employeeIterator.next();
            if (employee.accountsArray.size() == 1) {
                System.out.println(numId+" - Empleado: "+employee.getName()+"\tNumero de cuenta: "+employee.getAccount().getAccountNumber()+"\tSaldo: "+employee.getAccount().getAmount()+"\tTipo de cuenta: "+employee.getAccount().getType());
            } else {
                System.out.println(numId+" - Empleado: "+employee.getName()+"\tCantidad de cuentas: "+employee.accountsArray.size());
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
        for (int i = 0; i<employee.accountsArray.size() ;i++){
            System.out.println("\nCuenta " + (i+1));
            System.out.println("Numero de cuenta: " + employee.accountsArray.get(i).getAccountNumber());
            System.out.println("Tipo de cuenta: "+ employee.accountsArray.get(i).getType());
            System.out.println("Saldo en cuenta: "+ employee.accountsArray.get(i).getAmount());
        }
    }
}
