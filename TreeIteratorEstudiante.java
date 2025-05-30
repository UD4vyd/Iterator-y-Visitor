import java.util.Iterator;

public class TreeIteratorEstudiante implements EstudianteIterator {
    private Iterator<Estudiante> iterador;

    public TreeIteratorEstudiante(ListaEstudiantesTree tree) {
        this.iterador = tree.getEstudiantes().iterator();
    }

    @Override
    public boolean hasNext() {
        return iterador.hasNext();
    }

    @Override
    public Estudiante next() {
        return iterador.next();
    }
}
