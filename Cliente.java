
import java.util.Collection;

public class Cliente {
    public void procesarPersonas(Collection<Persona> personas) {
        Visitor validador = new ValidadorVisitor();

        for (Persona persona : personas) {
            persona.accept(validador);
        }
    }
}
