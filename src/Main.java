import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Variables
        Scanner scanner = new Scanner(System.in);
        int action;

        // Acciones
        menu();
        action = scanner.nextInt();
        while (action != 0){
            switch (action){
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                default:
            }
            menu();
            action = scanner.nextInt();
        }
    }
    // Metodos
    private static void menu(){
        System.out.println("Menu ------------------------------------------");
        System.out.println("1 - ");
    }
}