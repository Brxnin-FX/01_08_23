package Controller;

import Model.Usuario;

public class UsuarioController {
	
	public String ConsultarSaldo(Usuario usuario) {
		Double saldo = usuario.getSaldo();
		if(saldo <= 0) {
			return "Saldo Negativo" + saldo;
		}
		if(saldo > 0 ) {
			return "Saldo Positivo"+ saldo;
		}
		return null;
	}
	
	public void Sacar(Usuario usuario,Double dinheiroSacar) {
		Double saldo = usuario.getSaldo();
		if(dinheiroSacar > saldo) {
			System.err.println("Saldo Insuficiente!");
		}
		saldo = saldo - dinheiroSacar;
		usuario.setSaldo(saldo);
	}
	
	public void Depositar(Usuario usuario,Double dinheiroDepositar) {
		Double saldo = usuario.getSaldo();
		saldo = saldo + dinheiroDepositar;
		usuario.setSaldo(saldo);
	}
	
	
	
	
	

}
