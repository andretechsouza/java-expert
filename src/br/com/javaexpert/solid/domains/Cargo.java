package br.com.javaexpert.solid.domains;

import br.com.javaexpert.solid.CalculaDezOuVintePorCento;
import br.com.javaexpert.solid.CalculaQuinzeOuVinteECincoPorCento;
import br.com.javaexpert.solid.RegrasECalculos;

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
