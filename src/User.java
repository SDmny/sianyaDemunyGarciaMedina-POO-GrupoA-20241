import java.util.ArrayList;
import java.util.Scanner;
public class User {
    // Variables globales
    static Scanner scanner = new Scanner(System.in);
    // Atributos
    private ArrayList<Book> booksUser = new ArrayList<>();
    private int id, age;
    private String name;

    // Constructor
    public User(String name, int age){
        this.name = name;
        this.age = age;
        id = Library.users.size()+1;
    }
    // Getters y Setters
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getId() {
        return id;
    }
    public ArrayList<Book> getBooksUser() {
        return booksUser;
    }

    // Metodos
    public static void createUser(){
        String name;
        int age;
        System.out.println("\nRegistrar usuario");
        System.out.print("Nombre: ");
        name = scanner.next();
        System.out.print("Edad: ");
        age = scanner.nextInt();
        User user = new User(name, age);
        Library.addUser(user);
    }

    public static void rentBook(){

    }
}
