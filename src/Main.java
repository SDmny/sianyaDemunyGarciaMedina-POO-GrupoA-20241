import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // variables locales
        Persona per1, per2, per3, per4;
        Libro b1, b2, b3, b4;
        Rectangulo r1, r2, r3, r4;
        Scanner read = new Scanner(System.in);
        int act;

        // coordinando programas
        System.out.println("Menu");
        System.out.println("1 - Persona");
        System.out.println("2 - Libro");
        System.out.println("3 - Rectangulo");
        System.out.println("0 - Salir");
        System.out.print("Elegir accion: ");
        act = read.nextInt();
        do{
            System.out.println();
            switch (act){
                case 1: // codigo Persona
                    per1 = new Persona("Juana", 17, "Femenino");
                    per2 = new Persona("Gerardo", 19, "Masculino");
                    per3 = new Persona("Luisa", 21, "Femenino");
                    per4 = new Persona("Jessica", 25, "Femenino");
                    per1.Show();
                    per2.Show();
                    per3.Show();
                    per4.Show();
                    break;
                case 2: // codigo Libro
                    b1 = new Libro();
                    b1.Show();
                    // creando otros libros
                    b2 = new Libro();
                    b3 = new Libro();
                    b4 = new Libro();
                    // modificando atributos
                    b2.title = "Bajo la misma estrella";
                    b2.author = "John Green";
                    b2.yearPub = "2019";
                    b3.title = "La brujula dorada";
                    b3.author = "Philip Pullman";
                    b3.yearPub = "2007";
                    b4.title = "Guerra y Paz";
                    b4.author = "León Tolstói";
                    b4.yearPub = "1864";
                    // mostrar
                    b2.Show();
                    b3.Show();
                    b4.Show();
                    break;
                case 3:
                    // codigo Rectangulo
                    r1 = new Rectangulo(15, 3);
                    r1.Area();
                    r1.Perimeter();
                    r2 = new Rectangulo(3, 7);
                    r2.Area();
                    r2.Perimeter();
                    r3 = new Rectangulo(2.5f, 11.3f);
                    r3.Area();
                    r3.Perimeter();
                    r4 = new Rectangulo(17.5f, 24);
                    r4.Area();
                    r4.Perimeter();
                    break;
                default:
            }
            System.out.println("Menu");
            System.out.println("1 - Persona");
            System.out.println("2 - Libro");
            System.out.println("3 - Rectangulo");
            System.out.println("0 - Salir");
            System.out.print("Elegir accion: ");
            act = read.nextInt();
        }while(act != 0);
    }
}