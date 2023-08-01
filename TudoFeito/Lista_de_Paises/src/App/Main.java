package App;

import java.util.Scanner;

import Controller.PaisController;


public class Main {
	
	private static PaisController controller = new PaisController();
	
	
	public static void addPais() {
	    Scanner entrada = new Scanner(System.in);
		System.out.println("Nome do pais: ");
		String nome = entrada.next();
		System.out.println("Capital: ");
		String capital = entrada.next();
		controller.adicionarPais(nome, capital);
	
	}

	public static void main(String[] args) {
		int opcao;
		do {
		Scanner entrada = new Scanner(System.in);
		System.out.println("1 - Adicionar Pais");
		System.out.println("2 - Exibir Paises ");
		System.out.println("3 - Sair          ");
		opcao = entrada.nextInt();
		
		switch(opcao) {
		case 1:
			addPais();
			break;
		case 2: 
			controller.ExibirPaises();
			break;
			
		case 3:
			System.out.println("Até mais");
			break;
		}
		
		
		}while(opcao < 3);
		
		

	}

}
