package br.com.fatec.model;

public class Carga extends Veiculo {

	public Carga(long tempo, String tipoVeiculo) {
		super(tempo, tipoVeiculo);
		this.tempo = tempo;
		this.tipo = tipoVeiculo;
		this.valor = 4.0;
	}
}