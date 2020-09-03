package br.com.fatec.control;

import br.com.fatec.model.Veiculo;

public abstract class CalculoValor {
	
	protected double valorParaCalculo;
	public abstract double valorConta(double tempo, Veiculo veiculo);
}