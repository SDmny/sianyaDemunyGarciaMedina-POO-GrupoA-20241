public class Main {
    public static void main(String[] args) {
        // crear
        Producto num1 = new Producto("Casa de juguete", 39.5, 20);
        Producto num2 = new Producto("Globos", 1.2);
        // mostrar
        Producto.mostrar(num1);
        Producto.mostrar(num2);
        // modificar
        num1.reducirStock(5);
        Producto.mostrar(num1);
        num1.aumentarStock(15);
        Producto.mostrar(num1);
    }
}