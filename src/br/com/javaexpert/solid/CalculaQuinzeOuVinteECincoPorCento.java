package br.com.javaexpert.solid;

import br.com.javaexpert.solid.domains.Funcionario;

public class CalculaQuinzeOuVinteECincoPorCento implements RegrasECalculos{
	
    public double calcula(Funcionario funcionario) {
        if(funcionario.getSalarioBase() > 2000.0) {
            return funcionario.getSalarioBase() * 0.75;
        }
        else {
            return funcionario.getSalarioBase() * 0.85;
        }
    }
}
