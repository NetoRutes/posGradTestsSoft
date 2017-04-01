package test;

import static org.junit.Assert.*;
import org.junit.Test;
import logic.Triangulo;

public class TrianguloTest {

	@Test
	public void meuTeste() throws Exception{
		String name = "João";
		assertEquals("João", name);
	}
	
	@Test(expected = ArithmeticException.class)
	public void meuTeste2() throws Exception{
		//new File("naoExiste").setExecutable(true);
		Integer a = 10 / 0;
	}
	
	@Test
	public void testTrianguloValid() throws Exception{
		Triangulo triangulo = new Triangulo(true);
		assertEquals(true, triangulo.getValido());
	}
	
	@Test
	public void testTrianguloInvalid() throws Exception{
		Triangulo triangulo = new Triangulo(false);
		assertNotEquals(true, triangulo.getValido());
	}
}
