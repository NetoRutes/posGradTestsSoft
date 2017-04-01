package test;

import static org.junit.Assert.*;

import java.io.File;

import org.junit.Test;

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
}
