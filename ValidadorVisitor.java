public class ValidadorVisitor implements Visitor {

    @Override
    public void visit(Estudiante estudiante) {
        System.out.println("🔹 Estudiante:");
        imprimirDatos(estudiante.getCodigo(), estudiante.getNombre(), estudiante.getDireccion(), estudiante.getTelefonos());

        if (estudiante.getCodigo() == null || estudiante.getNombre() == null ||
            estudiante.getDireccion() == null || estudiante.getTelefonos() == null ||
            estudiante.getTelefonos().isEmpty()) {
            System.out.println("    Datos incompletos.");
        } else {
            System.out.println("   Datos completos.");
        }

        System.out.println("────────────────────────────");
    }

    @Override
    public void visit(Docente docente) {
        System.out.println("🔸 Docente:");
        imprimirDatos(docente.getCodigo(), docente.getNombre(), docente.getDireccion(), docente.getTelefonos());

        boolean datosCompletos = docente.getCodigo() != null && docente.getNombre() != null &&
                                 docente.getDireccion() != null && docente.getTelefonos() != null &&
                                 !docente.getTelefonos().isEmpty();

        boolean codigoValido = docente.getCodigo() != null && docente.getCodigo().length() <= 4;

        if (!datosCompletos) {
            System.out.println("    Datos incompletos.");
        } else if (!codigoValido) {
            System.out.println("    Código inválido (>4 dígitos).");
        } else {
            System.out.println("   Datos completos y código válido.");
        }

        System.out.println("────────────────────────────");
    }

    private void imprimirDatos(String codigo, String nombre, String direccion, java.util.List<String> telefonos) {
        System.out.println("  Código   : " + codigo);
        System.out.println("  Nombre   : " + nombre);
        System.out.println("  Dirección: " + direccion);
        System.out.println("  Teléfonos: " + (telefonos != null ? telefonos : "[]"));
    }
}
