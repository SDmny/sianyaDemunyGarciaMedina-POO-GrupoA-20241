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
    public ArrayList<BankAccount> getAccountsArray() {
        return accountsArray;
    }
}
