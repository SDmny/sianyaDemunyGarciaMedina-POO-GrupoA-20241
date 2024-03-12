public class Book {
    // Atributos
    private int id=0;
    private String name, autor;
    private boolean inRent=false;
    // Constructor

    public Book(String name, String autor){
        this.id = id+1;
        this.name = name;
        this.autor = autor;
        id++;
    }

    // Getters y Setters
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAutor() {
        return autor;
    }
    public void setAutor(String lastName) {
        this.autor = lastName;
    }
    public boolean isInRent() {
        return inRent;
    }
    public void setInRent(boolean inRent) {
        this.inRent = inRent;
    }

    // Metodos

}
