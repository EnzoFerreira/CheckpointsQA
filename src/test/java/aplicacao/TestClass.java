package aplicacao;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class TestClass {
	
	
	@Test
	public void TestEquilateros() {
		Assertions.assertEquals("Equilatero", Triangulacao.equilatero(1, 1, 1));
		Assertions.assertEquals("", Triangulacao.equilatero(1, 2, 3));
	}
	@Test
	public void TestIsosceles() {
		Assertions.assertEquals("Isosceles", Triangulacao.isosceles(2, 2, 1));
		Assertions.assertEquals("", Triangulacao.isosceles(2, 1, 3));
	}
	@Test
	public void TestEscaleno() {
		Assertions.assertEquals("Escaleno", Triangulacao.escaleno(1, 2, 3));
		Assertions.assertEquals("", Triangulacao.escaleno(1, 1, 2));
	}
}
