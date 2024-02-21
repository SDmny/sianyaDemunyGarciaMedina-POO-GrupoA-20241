import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // variables locales
        Persona per1, per2, per3, per4;
        Libro li1, li2, li3, li4;
        Rectangulo r1, r2, r3, r4;
        Scanner leer = new Scanner(System.in);
        int act;

        // coordinando programas
        System.out.println("Menu");
        System.out.println("1 - Persona");
        System.out.println("2 - Libro");
        System.out.println("3 - Rectangulo");
        System.out.println("0 - Salir");
        System.out.print("Elegir accion: ");
        act = leer.nextInt();
        do{
            System.out.println();
            switch (act){
                case 1: // codigo Persona
                    per1 = new Persona("Juana", 17, "Femenino");
                    per2 = new Persona("Gerardo", 19, "Masculino");
                    per3 = new Persona("Luisa", 21, "Femenino");
                    per4 = new Persona("Jessica", 25, "Femenino");
                    per1.Mostrar();
                    per2.Mostrar();
                    per3.Mostrar();
                    per4.Mostrar();
                    break;
                case 2: // codigo Libro
                    li1 = new Libro();
                    li1.Mostrar();
                    // creando otros libros
                    li2 = new Libro();
                    li3 = new Libro();
                    li4 = new Libro();
                    // modificando atributos
                    li2.titulo = "Bajo la misma estrella";
                    li2.autor = "John Green";
                    li2.aPub = "2019";
                    li3.titulo = "La brujula dorada";
                    li3.autor = "Philip Pullman";
                    li3.aPub = "2007";
                    li4.titulo = "Guerra y Paz";
                    li4.autor = "León Tolstói";
                    li4.aPub = "1864";
                    // mostrar
                    li2.Mostrar();
                    li3.Mostrar();
                    li4.Mostrar();
                    break;
                case 3:
                    // codigo Rectangulo
                    r1 = new Rectangulo(15, 3);
                    r1.Area();
                    r1.Perimetro();
                    r2 = new Rectangulo(3, 7);
                    r2.Area();
                    r2.Perimetro();
                    r3 = new Rectangulo(2.5f, 11.3f);
                    r3.Area();
                    r3.Perimetro();
                    r4 = new Rectangulo(17.5f, 24);
                    r4.Area();
                    r4.Perimetro();
                    break;
                default:
            }
            System.out.println("Menu");
            System.out.println("1 - Persona");
            System.out.println("2 - Libro");
            System.out.println("3 - Rectangulo");
            System.out.println("0 - Salir");
            System.out.print("Elegir accion: ");
            act = leer.nextInt();
        }while(act != 0);
    }
}