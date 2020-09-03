package br.com.fatec.model;

public abstract class Veiculo {
	
	public long tempo;
	public String tipo = "";
	public double valor;
	
	
	public Veiculo(long tempo, String tipoVeiculo) {
		this.tempo = tempo;
		this.tipo = tipoVeiculo;
	}	
}