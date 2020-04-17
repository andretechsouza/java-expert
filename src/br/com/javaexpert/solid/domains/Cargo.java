package br.com.javaexpert.solid.domains;

import br.com.javaexpert.solid.coesao.CalculaDezOuVintePorCento;
import br.com.javaexpert.solid.coesao.CalculaQuinzeOuVinteECincoPorCento;
import br.com.javaexpert.solid.coesao.RegrasECalculos;

public enum Cargo {
    DESENVOLVEDOR(new CalculaDezOuVintePorCento()),
    DBA(new CalculaQuinzeOuVinteECincoPorCento()),
    TESTER(new CalculaQuinzeOuVinteECincoPorCento());

	private RegrasECalculos regras;
	
	Cargo(RegrasECalculos regras) {
		this.regras = regras;
	}
	
	public RegrasECalculos getRegras() {
		return regras;
	}
}
