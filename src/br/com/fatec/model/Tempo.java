package br.com.fatec.model;

import java.util.Date;

import br.com.fatec.control.Leitor;

import java.util.Date;
import java.time.LocalDateTime;

public class Tempo{

	  Date data;
	  Leitor leitor = new Leitor();

	  // informando a data/hora de saída do veículo no estacionamento
	public long anotarSaída(long tempo){
			data = new Date();
			
			long d = 0;
			
			do {

				System.out.print("\nInforme a data e a hora de saída...\nDia: ");
			  data.setDate(leitor.getValor()); // Informa o dia

				System.out.print("Mês: ");
				data.setMonth(leitor.getValor() - 1);// Informa o mês
	      // o setMouth() pega os valores de mês na variação de 0-11
				
				System.out.print("Hora: ");
				data.setHours(leitor.getValor());

				System.out.print("Minutos: ");
				data.setMinutes(leitor.getValor());

				d = data.getTime();  

				if(d < tempo)  {
					System.out.println("Data e/ou horário inválido");
				}

			}while(d < tempo);
			
			return d;
	} 
	}