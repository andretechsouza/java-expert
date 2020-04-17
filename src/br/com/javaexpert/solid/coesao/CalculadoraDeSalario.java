package br.com.javaexpert.solid.coesao;

import br.com.javaexpert.solid.domains.Funcionario;

public class CalculadoraDeSalario {
	
    public double calcula(Funcionario funcionario) {
    	return funcionario.calcularSalario();
    }
}