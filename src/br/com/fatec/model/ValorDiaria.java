package br.com.fatec.model;

import br.com.fatec.control.CalculoValor;

public class ValorDiaria extends CalculoValor {

	private final double DIA = 86400000;

	public ValorDiaria(double valorDiaria) {
		this.valorParaCalculo = valorDiaria;
	}

	@Override
	public double valorConta(double tempo, Veiculo veiculo) {
		return valorParaCalculo * Math.ceil(tempo / DIA) + veiculo.valor;
    // Math.ceil --> arredondamento para cima dos valores
	}
}