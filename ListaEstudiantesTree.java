import java.util.TreeSet;

public class ListaEstudiantesTree implements ColeccionEstudiantes {
    private TreeSet<Estudiante> estudiantes = new TreeSet<>((a, b) -> a.toString().compareTo(b.toString()));

    public void addEstudiante(Estudiante e) {
        estudiantes.add(e);
    }

    public TreeSet<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    @Override
    public EstudianteIterator createIterator() {
        return new TreeIteratorEstudiante(this);
    }
}
