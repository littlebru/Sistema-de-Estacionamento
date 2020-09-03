package br.com.fatec.model;

import br.com.fatec.control.CalculoValor;

public class ContaEstacionamento {

	private CalculoValor calculo; 

	public Veiculo veiculo;

  public double valorConta(double tempo, Veiculo veiculo) {
		return calculo.valorConta(tempo, veiculo);
	}

	public void setCalculo(CalculoValor calculo) {
		this.calculo = calculo;
	}
	

	public void imprimeConta(Veiculo veiculo, double tempoTotal) {
    
	  long ms = (long) tempoTotal;
  	String tempo = String.format("%2d", (ms / 3600000) + 4);

	  double valor = veiculo.valor;

		System.out.println("\n\n_________________________________________");
		System.out.println("           TICKET DE PAGAMENTO           \n");
		System.out.println("Serviço utilizado: Estacionamento");
		System.out.println("Tipo: Veiculo de " + veiculo.tipo);
		System.out.println("\nTempo de Permanência:    " + tempo + " horas");
		System.out.println("TOTAL                   R$ " + valor);
		System.out.println("-----------------------------------------");
	}
}
