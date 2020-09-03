package br.com.fatec.app;

import java.util.Date;

import br.com.fatec.control.*;
import br.com.fatec.model.*;

public class App {

public static void main(String[] args) {
		
		Menu menu = new Menu();
		Date data ;
		Tempo tempo;
		
		Verificador verifica;
		ContaEstacionamento conta;
		CalculoValor cv;
		Veiculo v;

		int opcao = 1;
		double tempoFinal;
		double tempoInicial;
		double tempoTotal;
		long tempoAgora;

		while(opcao != 0) {
			opcao = menu.selecionarTipoVeiculo();

			switch(opcao) {

				case 1:	// veiculo de passeio
					data = new Date();
					tempo = new Tempo();
					verifica = new Verificador();
					
          			tempoAgora = data.getTime();
					v = new Passeio(tempoAgora, "Passeio");
					cv = new ValorDiaria(2.0);

					// informando o tempo a hora/data de entrada do veiculo
					tempoFinal = tempo.anotarSaída(tempoAgora);
					tempoInicial = tempoAgora;
					tempoTotal = tempoFinal - tempoInicial;
					
					conta = new ContaEstacionamento();
					conta.veiculo = v;
					conta.setCalculo(verifica.defineCalculo(2.0, tempoTotal));
				
					v.valor = conta.valorConta(tempoTotal, v);
					
					conta.imprimeConta(v, tempoTotal);

					break;
					
				case 2:	// veiculo de carga
					data = new Date();
					tempo = new Tempo();
					verifica = new Verificador();
					
					tempoAgora = data.getTime();
					v = new Carga(tempoAgora, "Carga");
					cv = new ValorDiaria(4.0);
					
					// informando o tempo a hora/data de entrada do veiculo
					tempoFinal = tempo.anotarSaída(tempoAgora);
					tempoInicial = tempoAgora;
					tempoTotal = tempoFinal - tempoInicial;
					
					conta = new ContaEstacionamento();
					conta.veiculo = v;
					conta.setCalculo(verifica.defineCalculo(4.0, tempoTotal));
				
					v.valor = conta.valorConta(tempoTotal, v);
					
					conta.imprimeConta(v, tempoTotal);
					break;
					
				default:
					System.out.println("\nInforme uma opção válida!\n");
					continue;
			}
			opcao = menu.continuar();
		}	
	}

}
