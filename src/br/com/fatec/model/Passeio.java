package br.com.fatec.model;

public class Passeio extends Veiculo {

	public Passeio(long tempo, String tipoVeiculo) {
		super(tempo, tipoVeiculo);
		this.tempo = tempo;
		this.tipo = tipoVeiculo;
		this.valor = 2.0;
		
	}


}