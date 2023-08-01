package View;

import java.util.ArrayList;
import java.util.Scanner;

import Controller.PaisController;
import Model.Paises;

public class PaisView {
	
	
	
	public void AicionarPais() {
		PaisController controller = new PaisController();
		Scanner entrada = new Scanner(System.in);
		System.out.println("Informe o nome do Pais");
		String nomePais = entrada.next();
		System.out.println("Informe a capital desse Pais");
		String capital = entrada.next();
		controller.adicionarPais(nomePais, capital);
		entrada.close();
	}
	
	public void ExibirPais(ArrayList<Paises> listaPaises) {
		System.out.println("---------------");
		System.out.println("Lista de Paises");
		for(Paises paises: listaPaises) {
			System.out.println("Nome:" + paises.getNome() + "| Capital : " + paises.getCapital());
		}
		System.out.println("---------------");
	}

	public void AddPais() {
		// TODO Auto-generated method stub
		
	}

}
