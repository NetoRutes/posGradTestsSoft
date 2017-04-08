package exercicio4.delegate;

import br.ufsc.ine.leb.sistemaBancario.Agencia;
import br.ufsc.ine.leb.sistemaBancario.Banco;
import br.ufsc.ine.leb.sistemaBancario.Conta;
import br.ufsc.ine.leb.sistemaBancario.Moeda;
import br.ufsc.ine.leb.sistemaBancario.SistemaBancario;

public class Auxiliar {
	
	public static Banco criarBanco(){
		SistemaBancario sistemaBancario = new SistemaBancario();
		Banco caixaEconomica = sistemaBancario.criarBanco("Caixa Econômica", Moeda.BRL);
		return caixaEconomica;
	}
	
	public static Agencia criarAgencia(Banco banco){
		Agencia caixaEconomicaTrindade = banco.criarAgencia("Trindade");
		return caixaEconomicaTrindade;
	}
	
	public static Conta criarConta(Agencia agencia, String nomeTitular){
		Conta conta = agencia.criarConta(nomeTitular);
		return conta;
	}
	
}
