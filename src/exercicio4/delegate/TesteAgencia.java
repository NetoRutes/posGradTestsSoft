package exercicio4.delegate;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import br.ufsc.ine.leb.sistemaBancario.Agencia;
import br.ufsc.ine.leb.sistemaBancario.Banco;
import br.ufsc.ine.leb.sistemaBancario.Conta;

public class TesteAgencia {

	
	@Test
	public void caixaEconomicaTrindade() throws Exception {
		Banco caixaEconomica = Auxiliar.criarBanco();
		Agencia caixaEconomicaTrindade = Auxiliar.criarAgencia(caixaEconomica);
		
		assertEquals("001", caixaEconomicaTrindade.obterIdentificador());
		assertEquals("Trindade", caixaEconomicaTrindade.obterNome());
		assertEquals(caixaEconomica, caixaEconomicaTrindade.obterBanco());
	}

}