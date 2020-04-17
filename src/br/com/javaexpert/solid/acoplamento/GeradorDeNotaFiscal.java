package br.com.javaexpert.solid.acoplamento;

import java.util.List;

public class GeradorDeNotaFiscal {

    private List<AcoesAposGerarNota> acoes;

    public GeradorDeNotaFiscal(List<AcoesAposGerarNota> acoes) {
        this.acoes = acoes;
    }

    public NotaFiscal gera(Fatura fatura) {

        double valor = fatura.getValorMensal();

        NotaFiscal nf = new NotaFiscal(valor, impostoSimplesSobreO(valor));

        for(AcoesAposGerarNota acao : acoes) {
        	acao.executar(nf);
        }

        return nf;
    }

    private double impostoSimplesSobreO(double valor) {
        return valor * 0.06;
    }
}