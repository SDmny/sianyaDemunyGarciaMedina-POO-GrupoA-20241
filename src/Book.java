import java.util.Scanner;

public class Book {
    // Variables locales
    static Scanner scanner = new Scanner(System.in);
    // Atributos
    private int id;
    private String name, autor;
    private boolean available=true;
    // Constructor

    public Book(String name, String autor){
        this.name = name;
        this.autor = autor;
        id = Library.books.size()+1;
    }

    // Getters y Setters
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAutor() {
        return autor;
    }
    public void setAutor(String lastName) {
        this.autor = lastName;
    }
    public int getId() {
        return id;
    }
    public boolean isAvailable() {
        return available;
    }
    public void setAvailable(boolean available) {
        this.available = available;
    }

    // Metodos
    public static void createBook(){
        String name, autor;
        System.out.println("\nRegistrar libro");
        System.out.print("Titulo: ");
        name = scanner.next();
        System.out.print("Autor: ");
        autor = scanner.next();
        Book book = new Book(name, autor);
        Library.addBook(book);
    }
}
