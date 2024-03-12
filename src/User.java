import java.util.ArrayList;

public class User {
    // Atributos
    public static ArrayList<Book> booksUser = new ArrayList<>();
    private int id=0, age=0;
    private String name="";

    // Constructor
    public User(String name, int age){
        this.id = id+1;
        this.name = name;
        this.age = age;
        id++;
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
}
