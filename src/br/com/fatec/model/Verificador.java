package br.com.fatec.model;

import br.com.fatec.control.CalculoValor;

public class Verificador {
	
	private double HORA = 3600000;
	private double DIA = 86400000;

	CalculoValor cv;
	
	public CalculoValor defineCalculo(double taxa, double tempo) {
		long periodo = (long) tempo;

		if(periodo < 12 * HORA) {
			cv = new ValorHora(taxa);
			return cv;
		}
		else if(periodo > 12 * HORA && periodo < 15 * DIA) {
			cv = new ValorDiaria((taxa*26)/2);
			return cv;
		}
		else {
			cv = new ValorMensal((taxa*300)/2);
			return cv;
		}
	}
}
