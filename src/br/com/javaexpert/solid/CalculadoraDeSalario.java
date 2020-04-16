package br.com.javaexpert.solid;

import br.com.javaexpert.solid.domains.Funcionario;
import static br.com.javaexpert.solid.domains.Cargo.DBA;
import static br.com.javaexpert.solid.domains.Cargo.DESENVOLVEDOR;
import static br.com.javaexpert.solid.domains.Cargo.TESTER;

public class CalculadoraDeSalario {
	
    public double calcula(Funcionario funcionario) {
        if(DESENVOLVEDOR.equals(funcionario.getCargo())) {
            return dezOuVintePorcento(funcionario);
        }

        if(DBA.equals(funcionario.getCargo()) || TESTER.equals(funcionario.getCargo())) {
            return quinzeOuVinteCincoPorcento(funcionario);
        }

        throw new RuntimeException("funcionario invalido");
    }



    private double quinzeOuVinteCincoPorcento(Funcionario funcionario) {
        if(funcionario.getSalarioBase() > 2000.0) {
            return funcionario.getSalarioBase() * 0.75;
        }
        else {
            return funcionario.getSalarioBase() * 0.85;
        }
    }
}