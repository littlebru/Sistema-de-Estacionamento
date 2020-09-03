package br.com.fatec.model;

import br.com.fatec.control.CalculoValor;

public class ValorMensal extends CalculoValor {

	private final double MES = 2592E6;

	public ValorMensal(double valorHora) {
		this.valorParaCalculo = valorHora;
	}

	@Override
	public double valorConta(double tempo, Veiculo veiculo) {
		return valorParaCalculo * Math.ceil(tempo / MES) + veiculo.valor;
	}
}
