package br.com.fatec.control;

import br.com.fatec.control.*;
import br.com.fatec.model.*;

public class Menu {
	
	Leitor leitor;

	public int selecionarTipoVeiculo(){
		System.out.println("\n-------- CATEGORIA --------");
		System.out.println("[1] Veículo de Passeio");
		System.out.println("[2] Veículo de Carga");
		System.out.println("[0] Sair\n");
    System.out.print("Opção: ");
		
		leitor = new Leitor();
		int opcao = leitor.getValor();
		
		if(opcao == 0) {
			fecharPrograma();
		}
		
		return opcao;
	}
	
	public int continuar() {
		System.out.println("\nCalcular valor de outro veículo?");
		System.out.println("[1] Sim");
		System.out.println("[2] Não");
    System.out.print("Opção: ");
		
		leitor = new Leitor();
		int opcao = leitor.getValor();
		
		if(opcao == 2) {
			fecharPrograma();
		}
		
		return opcao;
	}
	
	public void fecharPrograma() {
		System.out.println("\nDeseja fechar o programa?");
		System.out.println("[1] Sim");
		System.out.println("[2] Não");
    System.out.print("Opção: ");
		
		leitor = new Leitor();
		int opcao = leitor.getValor();
		
		if(opcao == 1) {
			System.out.println("\nO programa foi encerrado..");
			System.out.println("----------------------------");
			System.exit(0);
		}
	}
}