import java.util.List;

public class Estudiante {
    private String codigo;
    private String nombre;
    private String direccion;
    private List<String> telefonos;

    public Estudiante(String codigo, String nombre, String direccion, List<String> telefonos) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefonos = telefonos;
    }

    public boolean tieneDatosCompletos() {
        return codigo != null && nombre != null && direccion != null && telefonos != null && !telefonos.isEmpty();
    }

   @Override
public String toString() {
    return "Estudiante{" +
           "codigo='" + codigo + '\'' +
           ", nombre='" + nombre + '\'' +
           ", direccion='" + direccion + '\'' +
           ", telefonos=" + telefonos +
           '}';
}
}