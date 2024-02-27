import java.util.Scanner;
public class Rectangulo {
    // Metodos
    public static void areaPerimeter(int width, int height){
        System.out.println("Area: "+(width*height));
        System.out.println("Perimetro: "+(width*2 + height*2));
    }
    public static void areaPerimeter(double width, double height){
        System.out.printf("\nArea: %.2f", (width*height));
        System.out.printf("\nPerimetro: %.2f", (width*2 + height*2));
        System.out.println();
    }
    public static void askNumber(){
        Scanner scanner = new Scanner(System.in);
        String nSW,nSH;
        boolean numDou=false;
        // Codigo
        System.out.print("Ancho: ");
        nSW = scanner.next();
        System.out.print("Altura: ");
        nSH = scanner.next();
        for (int i = 0; i < nSW.length(); i++) {
            if (nSW.charAt(i)=='.'){
                numDou = true;
            }
        }
        for (int i = 0; i < nSH.length(); i++) {
            if (nSH.charAt(i)=='.'){
                numDou = true;
            }
        }
        if(numDou==true){
            areaPerimeter(Double.parseDouble(nSW), Double.parseDouble(nSH));
        }
        else{
            areaPerimeter(Integer.parseInt(nSW), Integer.parseInt(nSH));
        }
    }
}
