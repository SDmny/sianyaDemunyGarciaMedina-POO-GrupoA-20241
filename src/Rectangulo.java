public class Rectangulo {
    // atributos
    private float ancho;
    private float altura;
    // constructor
    public Rectangulo(float ancho, float altura){
        this.ancho = ancho;
        this.altura = altura;
    }
    // metodos
    public void Area(){
        float area = ancho*altura;
        System.out.println("Area: "+area);
    }
    public void Perimetro(){
        float perimetro = (ancho*2)+(altura*2);
        System.out.println("Perimetro: "+perimetro);
        System.out.println();
    }
}
