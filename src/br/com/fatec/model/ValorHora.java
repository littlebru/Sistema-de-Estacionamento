package br.com.fatec.model;

import br.com.fatec.control.CalculoValor;

public class ValorHora extends CalculoValor {

	private final double HORA = 3600000;

	public ValorHora(double valorHora) {
		this.valorParaCalculo = valorHora;
	}

	@Override
	public double valorConta(double tempo, Veiculo veiculo) {
		return valorParaCalculo * (tempo + HORA) + veiculo.valor;
	}
}