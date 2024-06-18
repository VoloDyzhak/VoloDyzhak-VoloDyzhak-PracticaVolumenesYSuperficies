package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import Clases.Cubo;

class TestCubo {
	
	static private Cubo cubo;
	

@BeforeAll
	static void init() {
	cubo = new Cubo(2);
}   


@Test
/**
 * Test de Superficie
 */
void testSUPERFICIE() {
	int Esparado = 24;
	int Obtenido = cubo.superficie();
	assertEquals(Esparado, Obtenido);
}
/**
 * test de Volumen
 */
@Test
void testVOLUMEN() {
	int Esparado = 8;
	int Obtenido = cubo.Volumen();
	assertEquals(Esparado, Obtenido);
}

/**
 * tes de exepcion
 */

@Test
void tesCUBOExeption1() {
	Exception exception = assertThrows(IllegalArgumentException.class,
			() -> new Cubo(-1));
	String mensajeEsperado = "no puede ser menpor a 0" ;
	String mensajeObtenido = exception.getMessage();
	assertEquals(mensajeEsperado, mensajeObtenido);
	
		
		
	
}

}
