import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.n1ex1.NoGenericMethods;
import org.n1ex1.Persona;

public class NoGenericMethodsTest {

    @Test
    void noGenericMethodsTest() {

        NoGenericMethods noGenericMethods = new NoGenericMethods(new Persona("A", 10), new Persona("B", 20), new Persona("C", 30));

        assertThat(noGenericMethods.getP1()).isInstanceOf(Persona.class);
        assertThat(noGenericMethods.getP2()).isInstanceOf(Persona.class);
        assertThat(noGenericMethods.getP3()).isInstanceOf(Persona.class);

    }

}
