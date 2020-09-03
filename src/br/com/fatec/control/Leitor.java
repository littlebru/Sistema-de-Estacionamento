package br.com.fatec.control;

import java.util.Scanner;

public class Leitor {
	
	public Scanner scanner;
	
	// Construtor da Classe Controle
	public Leitor() {
		scanner = new Scanner(System.in);
	}
	
	// Função: lê e retorna a entrada do usuario (numeral inteiro)
	public int getValor() {
		int op = scanner.nextInt();
		return op;
	}

	// Função: lê e retorna a entrada do usuario (caractere)
	public String getTexto() {
		String t = scanner.nextLine();
		return t;
	}
	
	public String next() {
		String t = scanner.next();
		return t;
	}
	
	// Sobrescrevendo o método da Classe Throwable
	@Override
	protected void finalize() throws Throwable {
		scanner.close();
	}
}
