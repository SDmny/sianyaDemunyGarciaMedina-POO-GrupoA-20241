public class Persona {
    // atributos
    private String name;
    private int age;
    private String gender;
    // constructor
    public Persona(String name, int age, String gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
    // metodos
    public void Show(){
        System.out.println("Nombre: "+name);
        System.out.println("Edad: "+age);
        System.out.println("Genero: "+gender);
        System.out.println();
    }
}
