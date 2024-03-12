import java.util.ArrayList;
public class Library {
    // Arrays
    public static ArrayList<User> users = new ArrayList<>();
    public static ArrayList<Book> books = new ArrayList<>();

    // Metodos
    private void addUser(User user){
        users.add(user);
    }
    private void addBook(Book book){
        books.add(book);
    }
    private void showUsers(){
        System.out.println("Usuarios");
        for (int i=0; i<users.size(); i++){
            System.out.println("Nombre: "+users.get(i).getName()+"\tEdad: "+users.get(i).getAge());
        }
        System.out.println("");
    }
    private void showBooks(){
        System.out.println("Libros");
        for (int i=0; i<users.size(); i++){
            System.out.println("Titulo: "+books.get(i).getName()+"\tAutor: "+books.get(i).getAutor());
        }
        System.out.println("");
    }
}
