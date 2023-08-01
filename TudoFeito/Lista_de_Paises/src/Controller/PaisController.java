package Controller;

import java.util.ArrayList;
import java.util.Scanner;

import Model.Paises;
import View.PaisView;

public class PaisController {
	private static PaisView paisView;
	private static ArrayList<Paises> listaPaises;
	
	
	
	public PaisController() {
		paisView = new PaisView();
		listaPaises = new ArrayList<>();
	}
	
	public static void adicionarPais(String nomePais,String capital) {
		paisView.AddPais();
		Paises novoPais = new Paises(nomePais,capital);
		listaPaises.add(novoPais);
	}
	
	@SuppressWarnings("unused")
	public void ExibirPaises() {
		if(!listaPaises.isEmpty()) {
			for(Paises pais:listaPaises) {
				paisView.ExibirPais(listaPaises);
			}
		}
	}

}
