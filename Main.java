import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Creamos una colección tipo ArrayList
        ListaEstudiantesArray listaArray = new ListaEstudiantesArray();
        listaArray.addEstudiante(new Estudiante("001", "Ana", "Calle 1", Arrays.asList("123")));
        listaArray.addEstudiante(new Estudiante("002", "Luis", null, Arrays.asList("456"))); // Dirección faltante

        // Creamos una colección tipo TreeSet
        ListaEstudiantesTree listaTree = new ListaEstudiantesTree();
        listaTree.addEstudiante(new Estudiante("003", "Carlos", "Calle 3", Arrays.asList("789")));
        listaTree.addEstudiante(new Estudiante("004", "Laura", "Calle 4", Arrays.asList())); // Sin teléfono

        Cliente cliente = new Cliente();

        System.out.println(" Procesando estudiantes en lista Array:");
        cliente.procesarEstudiantes(listaArray);

        System.out.println("\n Procesando estudiantes en conjunto Tree:");
        cliente.procesarEstudiantes(listaTree);
    }
}
