package biestable;

import org.junit.jupiter.api.*;

class TestBiestable {
	private XEstable b;
	
	@BeforeEach
	void init() {
		b = new Biestable();
	}
	
	@Test
	void pruebaInicializacionCorrecta() {
		Assertions.assertEquals("Cerrado", b.estado());
	}
	
	@Test
	void pruebaCambioEstado() {
		b.abrir();
		Assertions.assertEquals("Abierto", b.estado());
	}
	
	@Test
	void pruebaCerrarEstadoEstandoCerrado() {
		b.cerrar();
		Assertions.assertEquals("Cerrado", b.estado());
		b.cerrar();
		b.cerrar();
		b.cerrar();
		Assertions.assertEquals("Cerrado", b.estado());
	}
	
	@Test
	void pruebaAbrirEstadoEstandoAbierto() {
		b.abrir();
		b.abrir();
		Assertions.assertEquals("Abierto", b.estado());
		b.abrir();
		b.abrir();
		b.abrir();
		Assertions.assertEquals("Abierto", b.estado());
	}
	
	@Test
	void pruebaCambiosMultiples() {
		b.abrir();
		b.cerrar();
		b.cerrar();
		b.abrir();
		b.abrir();
		b.cerrar();
		Assertions.assertEquals("Cerrado", b.estado());
	}
	
}
