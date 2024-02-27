public class Producto {
    // Atributos
    private String nombre;
    private double precio;
    private int stock;
    // Constructores
    public Producto(String nombre, double precio, int stock){
        setNombre(nombre);
        setPrecio(precio);
        setStock(stock);
    }
    public Producto(String nombre, double precio){
        setNombre(nombre);
        setPrecio(precio);
        setStock(0);
    }
    // Getters y Setters
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        if(nombre!=""){
            this.nombre = nombre;
        }

    }
    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        if(precio>=0){
            this.precio = precio;
        }
    }
    public int getStock() {
        return stock;
    }
    public void setStock(int stock) {
        if(stock>=0){
            this.stock = stock;
        }
    }
    // Metodos extras
    public void aumentarStock(int cant){
        if(cant>0){
            setStock(getStock()+cant);
        }
    }
    public void reducirStock(int cant){
        if(cant>0 && cant<=getStock()) {
            setStock(getStock() - cant);
        }
    }
    public static void mostrar(Producto producto){
        System.out.println(producto.getNombre() +", "+ producto.getPrecio() +", "+ producto.getStock());
    }
}
