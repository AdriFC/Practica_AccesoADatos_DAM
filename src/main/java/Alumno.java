import java.util.Set;

public class Alumno {
    //Atributos
    private Long id;
    private String nombre;
    private String nacionalidad;
    private int edad;
    private String sexo;
    private Set Módulos;

    //Constructor vacío
    public Alumno(){
    }

    //Constructor con todos los parámetros
    public Alumno (Long id, String nombre, String nacionalidad, int edad, String sexo, Set Módulos){
        this.id=id;
        this.nombre=nombre;
        this.nacionalidad=nacionalidad;
        this.edad=edad;
        this.sexo=sexo;
        this.Módulos=Módulos;
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

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Set getMódulos() {
        return Módulos;
    }

    public void setMódulos(Set módulos) {
        Módulos = módulos;
    }

    //ToString
    @Override
    public String toString() {
        return "Alumno{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", nacionalidad='" + nacionalidad + '\'' +
                ", edad=" + edad +
                ", sexo='" + sexo + '\'' +
                ", Módulos=" + Módulos +
                '}';
    }
}