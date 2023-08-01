package View;

import java.util.Scanner;

public class ViewOpçoes {
	
	public void Menu() {
		Scanner entrada = new Scanner(System.in);
		int opcao;
		opcoesP();
		opcao=entrada.nextInt();
	}
	
	public void opcoesP() {
		System.out.println("---------------");
		System.out.println("Escolha a Opção");
		System.out.println("Consultar Saldo");
		System.out.println("      Sacar    ");
		System.out.println("    Depositar  ");
		System.out.println("Sair do Sistema");
		System.out.println("---------------");
	}
	
	
	
	

}
