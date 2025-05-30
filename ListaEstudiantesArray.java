import java.util.ArrayList;

public class ListaEstudiantesArray implements ColeccionEstudiantes {
    private ArrayList<Estudiante> estudiantes = new ArrayList<>();

    public void addEstudiante(Estudiante e) {
        estudiantes.add(e);
    }

    public ArrayList<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    @Override
    public EstudianteIterator createIterator() {
        return new ArrayIteratorEstudiante(this);
    }
}
