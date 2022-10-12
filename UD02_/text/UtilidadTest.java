import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class UtilidadTest {

	@Test
	final void testIntervalo() {
		assertTrue(Utilidad.intervalo(1, 10, 0));
	}

	@Test
	final void testIntervalo1() {
		assertFalse(Utilidad.intervalo(21, 10, 0));
	}

}
