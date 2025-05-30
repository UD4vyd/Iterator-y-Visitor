public class ArrayIteratorEstudiante implements EstudianteIterator {
    private ListaEstudiantesArray lista;
    private int posicion = 0;

    public ArrayIteratorEstudiante(ListaEstudiantesArray lista) {
        this.lista = lista;
    }

    @Override
    public boolean hasNext() {
        return posicion < lista.getEstudiantes().size();
    }

    @Override
    public Estudiante next() {
        return lista.getEstudiantes().get(posicion++);
    }
}
