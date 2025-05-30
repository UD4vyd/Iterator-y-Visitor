public class Cliente {
    public void procesarEstudiantes(ColeccionEstudiantes coleccion) {
        EstudianteIterator iterator = coleccion.createIterator();

        while (iterator.hasNext()) {
            Estudiante e = iterator.next();
            if (!e.tieneDatosCompletos()) {
                System.out.println(" Datos incompletos para: " + e);
            } else {
                System.out.println(" Estudiante válido: " + e);
            }
        }
    }
}
