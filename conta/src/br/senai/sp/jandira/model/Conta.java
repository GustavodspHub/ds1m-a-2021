package br.senai.sp.jandira.model;

public class Conta {
	
	public String tipo;
	private double saldo;
	public String numero;
	public String titular;
	public boolean ativa;
	
	public void depositar(double valorDeposito) {
		
		if (valorDeposito > 0) {
			saldo = saldo + valorDeposito;
		} else {
			System.out.println("ValorInvalido");
		}
		
		
	}
	
	public void mostrarSaldoDaConta() {
		System.out.println("Saldo: " + saldo);
	}
	
	public void sacar() {
		
	}
	
	public void transferir() {
		
	}

}
