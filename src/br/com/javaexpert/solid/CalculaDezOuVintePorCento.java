package br.com.javaexpert.solid;

import br.com.javaexpert.solid.domains.Funcionario;

public class CalculaDezOuVintePorCento {
	
    private double dezOuVintePorcento(Funcionario funcionario) {
        if(funcionario.getSalarioBase() > 3000.0) {
            return funcionario.getSalarioBase() * 0.8;
        }
        else {
            return funcionario.getSalarioBase() * 0.9;
        }
    }

}
