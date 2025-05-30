import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Persona> personas = new ArrayList<>();

        personas.add(new Estudiante("123", "Ana", "Calle 1", Arrays.asList("555-1234")));
        personas.add(new Docente("9876", "Profesor López", "Calle 2", Arrays.asList("555-4321")));
        personas.add(new Docente("123456", "Docente X", "Calle 3", Arrays.asList("555-0000"))); // código largo
        personas.add(new Estudiante("456", "Luis", null, Arrays.asList())); // incompleto

        Cliente cliente = new Cliente();
        cliente.procesarPersonas(personas);
    }
}
