public class Rectangulo {
    // atributos
    private float width;
    private float height;
    // constructor
    public Rectangulo(float width, float height){
        this.width = width;
        this.height = height;
    }
    // metodos
    public void Area(){
        float area = width*height;
        System.out.println("Area: "+area);
    }
    public void Perimeter(){
        float perimetro = (width*2)+(height*2);
        System.out.println("Perimetro: "+perimetro);
        System.out.println();
    }
}
