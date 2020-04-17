package br.com.javaexpert.solid.acoplamento;

public class EnviadorDeEmail implements AcoesAposGerarNota{
	
	public void executar(NotaFiscal nf) {
		System.out.println("envia email da nf " + nf.getId());
	}
}
