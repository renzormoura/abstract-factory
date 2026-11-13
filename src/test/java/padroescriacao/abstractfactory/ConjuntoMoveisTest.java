package padroescriacao.abstractfactory;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConjuntoMoveisTest {

    @Test
    void deveCriarCadeiraModerna() {
        ConjuntoMoveis conjunto = new ConjuntoMoveis(new FabricaModerna());
        assertEquals("Cadeira Moderna", conjunto.descreverCadeira());
    }

    @Test
    void deveCriarMesaModerna() {
        ConjuntoMoveis conjunto = new ConjuntoMoveis(new FabricaModerna());
        assertEquals("Mesa Moderna", conjunto.descreverMesa());
    }

    @Test
    void deveCriarCadeiraClassica() {
        ConjuntoMoveis conjunto = new ConjuntoMoveis(new FabricaClassica());
        assertEquals("Cadeira Clássica", conjunto.descreverCadeira());
    }

    @Test
    void deveCriarMesaClassica() {
        ConjuntoMoveis conjunto = new ConjuntoMoveis(new FabricaClassica());
        assertEquals("Mesa Clássica", conjunto.descreverMesa());
    }
}
