package pac;

public class Modulo {
    //Atributos
    private Long id;
    private String nombre;
    private String código;

    //Constructor vacío
    public Modulo(){
    }

    //Constructor con todos los parámetros
    public Modulo (Long id, String nombre, String código){
        this.id=id;
        this.nombre=nombre;
        this.código=código;
    }

    //Getters & setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCódigo() {
        return código;
    }

    public void setCódigo(String código) {
        this.código = código;
    }

    //ToString
    @Override
    public String toString() {
        return "Modulo{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", código='" + código + '\'' +
                '}';
    }
}
