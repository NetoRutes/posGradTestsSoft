package exercicio6;

import static org.junit.Assert.*;

import org.junit.Test;

import br.ufsc.ine.leb.sistemaBancario.Agencia;
import br.ufsc.ine.leb.sistemaBancario.Banco;
import br.ufsc.ine.leb.sistemaBancario.Conta;
import br.ufsc.ine.leb.sistemaBancario.Dinheiro;
import br.ufsc.ine.leb.sistemaBancario.Moeda;
import br.ufsc.ine.leb.sistemaBancario.SistemaBancario;

public class SistemaBancarioTest {

	@Test
	public void shouldMakeADeposit(){
		SistemaBancario sistemaBancario = new SistemaBancario();
		Banco bancoItau = sistemaBancario.criarBanco("Itau", Moeda.BRL);
		Agencia itauCanasvieiras = bancoItau.criarAgencia("Canasvieiras");
		Conta contaWellington = itauCanasvieiras.criarConta("Wellington");
		Dinheiro valorMonetario = new Dinheiro(Moeda.BRL, 10, 00);
		sistemaBancario.depositar(contaWellington, valorMonetario);
		assertEquals(contaWellington.calcularSaldo().toString(),"+10,00 BRL");
	}
	
	@Test
	public void shouldMakeTwoDeposits(){
		SistemaBancario sistemaBancario = new SistemaBancario();
		Banco bancoItau = sistemaBancario.criarBanco("Itau", Moeda.BRL);
		Agencia itauCanasvieiras = bancoItau.criarAgencia("Centro");
		Conta contaWellington = itauCanasvieiras.criarConta("Mario");
		Dinheiro valorMonetario = new Dinheiro(Moeda.BRL, 12, 00);
		sistemaBancario.depositar(contaWellington, valorMonetario);
		sistemaBancario.depositar(contaWellington, valorMonetario);
		assertEquals(contaWellington.calcularSaldo().toString(),"+24,00 BRL");
	}
	
	@Test
	public void shouldMakeSack(){
		SistemaBancario sistemaBancario = new SistemaBancario();
		Banco bancoItau = sistemaBancario.criarBanco("Itau", Moeda.BRL);
		Agencia itauCanasvieiras = bancoItau.criarAgencia("Centro");
		Conta contaWellington = itauCanasvieiras.criarConta("Mario");
		Dinheiro doze = new Dinheiro(Moeda.BRL, 12, 00);
		Dinheiro dez = new Dinheiro(Moeda.BRL, 10, 00);
		sistemaBancario.depositar(contaWellington, doze);
		sistemaBancario.sacar(contaWellington, dez);
		assertEquals(contaWellington.calcularSaldo().toString(),"+2,00 BRL");
	}
}
