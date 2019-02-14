package ecuaciones;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import ecuaciones.EcuacionLineal;

public class EcuacionLinealTest {
	private EcuacionLineal ecuacionLineal;

	@Test
	public void terminoIndependienteCeroTest() {
		ecuacionLineal = new EcuacionLineal(1, 0); // x + 0 = 0
		// A partir de aquí, el código que comprueba que la solución es correcta
        assertEquals(0, ecuacionLineal.resolverEcuacion(1, 0), 0);
	}

	@Test
	public void distintosDeCeroTest() {
		ecuacionLineal = new EcuacionLineal(1, 1); // x + 1 = 0
		// A partir de aquí, el código que comprueba que la solución es correcta
		assertEquals(-1, ecuacionLineal.resolverEcuacion(1,1), 0);
		ecuacionLineal = new EcuacionLineal(2, 1); // 2x + 1 = 0
		// A partir de aquí, el código que comprueba que la solución es correcta
		assertEquals(-1/2, ecuacionLineal.resolverEcuacion(2, 1), 0);
	}
}
