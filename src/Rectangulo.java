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
}
