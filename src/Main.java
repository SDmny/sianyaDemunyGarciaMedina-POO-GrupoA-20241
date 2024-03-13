import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Variables
        Scanner scanner = new Scanner(System.in);
        int action;

        // Acciones
        menu();
        action = scanner.nextInt();
        System.out.println("");
        while (action != 0){
            switch (action){
                case 1: User.createUser();
                    break;
                case 2: Book.createBook();
                    break;
                case 3: Library.rentBook();
                    break;
                case 4: Library.showUsers();
                    break;
                case 5: Library.showBooks();
                    break;
                case 6: Library.showUserWithRent();
                    break;
                case 7: Library.showBookAvailability(true);
                    break;
                case 8: Library.showBookAvailability(false);
                    break;
                default:
            }
            menu();
            action = scanner.nextInt();
            System.out.println("");
        }
    }
    // Metodos
    private static void menu(){
        System.out.println("Menu ------------------------------------------");
        System.out.println("1 - Registrar usuario\n2 - Registrar libro\n3 - Rentar libro\n4 - Listar usuarios\n5 - Listar libros\n6 - Listar usuarios con rentas\n7 - Listar libros disponibles\n8 - Listar libros rentados");
        System.out.println("0 - Salir");
    }
}