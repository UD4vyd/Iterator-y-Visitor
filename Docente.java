import java.util.List;

public class Docente implements Persona {
    private final String codigo;
private final String nombre;
private final String direccion;
private final List<String> telefonos;

    public Docente(String codigo, String nombre, String direccion, List<String> telefonos) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefonos = telefonos;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public List<String> getTelefonos() {
        return telefonos;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String toString() {
        return "Docente{" +
                "codigo='" + codigo + '\'' +
                ", nombre='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                ", telefonos=" + telefonos +
                '}';
    }
}
