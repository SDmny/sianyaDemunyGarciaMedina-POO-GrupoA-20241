import java.util.ArrayList;
import java.util.Scanner;

public class Library {
    // Variables globales
    static Scanner scanner = new Scanner(System.in);

    // Arrays
    public static ArrayList<User> users = new ArrayList<>();
    public static ArrayList<Book> books = new ArrayList<>();

    // Metodos
    public static void addUser(User user){
        users.add(user);
    }

    public static void addBook(Book book){
        books.add(book);
    }

    public static void showUsers(){
        System.out.println("Usuarios");
        for (int i=0; i<users.size(); i++){
            System.out.println(users.get(i).getId()+" - Nombre: "+users.get(i).getName()+"\tEdad: "+users.get(i).getAge());
        }
        System.out.println("");
    }

    public static void showUserWithRent(){
        System.out.println("Usuarios con libros en renta");
        for (int i=0; i<users.size(); i++){
            if (users.get(i).getBooksUser().size() > 0){
                System.out.println(users.get(i).getId()+" - Nombre: "+users.get(i).getName()+"\tEdad: "+users.get(i).getAge()+"\tCantidad de libros en renta: "+users.get(i).getBooksUser().size());
            }
        }
        System.out.println("");
    }

    public static void showBooks(){
        System.out.println("Libros");
        for (int i=0; i<books.size(); i++){
            System.out.println(books.get(i).getId()+" - Titulo: "+books.get(i).getName()+"\tAutor: "+books.get(i).getAutor());
        }
        System.out.println("");
    }

    public static void showBookAvailability(boolean available){
        if (available == true){
            System.out.println("Libros disponibles");
        }
        else {
            System.out.println("Libros rentados");
        }

        for (int i=0; i<books.size(); i++){
            if (available==true && books.get(i).isAvailable()==true){
                System.out.println(books.get(i).getId()+" - Titulo: "+books.get(i).getName()+"\tAutor: "+books.get(i).getAutor());
            }
            else if (available==false && books.get(i).isAvailable()==false) {
                System.out.println(books.get(i).getId()+" - Titulo: "+books.get(i).getName()+"\tAutor: "+books.get(i).getAutor());
            }
        }
    }

    public static void rentBook(){
        int idUser, idBook, act;
        System.out.println("ID del usuario: (0 - Cancelar/Ver usuarios");
        act = scanner.nextInt();
        if (act>0){
            idUser = act-1;
            System.out.println("ID del libro (0 - Cancelar/Ver libros disponibles");
            act = scanner.nextInt();
            if (act>0){
                idBook = act-1;
                if (books.get(idBook).isAvailable()==true){
                    users.get(idUser).getBooksUser().add(books.get(idBook));
                    books.get(idBook).setAvailable(false);
                }
                else {
                    System.out.println("Libro no disponible");
                }


            }
            else {
                System.out.println("1 - Ver libros\n0 - Regresar al menu");
                act = scanner.nextInt();
                if (act == 1){
                    showBookAvailability(true);
                    rentBook();
                }
            }
        }
        else {
            System.out.println("1 - Ver usuarios\n0 - Regresar al menu");
            act = scanner.nextInt();
            if (act == 1){
                showUsers();
                rentBook();
            }
        }
    }

}
