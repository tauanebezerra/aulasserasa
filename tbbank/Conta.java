package tbbank;

public class Conta {
	
	//atributos
	private int agencia;
	private int numeroConta;
	private double saldo;
	private String titular;

	
	//construtores
	public Conta() { //default padrao
	
		
	}
	
	public Conta(int agencia, int numeroConta, String titular) { //sobrecarregado
		super();
		this.agencia = agencia;
		this.numeroConta = numeroConta;
		this.titular = titular;
		this.saldo = 0;
	}
	
	//metodos
	//refletir o que vai acontecer com determinada ação
	//Podem ter tipo (primitivo e retorna algo) ou não (void)
	
	public void depositar(double valor) {
		if (valor > 0) {
			saldo +=valor; // saldo = saldo + valor;
		}
	
	}
	
	public boolean sacar(double valor) { //para retornar verdadeiro ou falso
		if(valor > 0 && saldo >= valor) {
			saldo -= valor;
			return true; //sempre no final
		}
		
		return false;
		
	}
	
	public boolean transferir (double valor, Conta destinatario) { //parametros podem ser de qualquer tipo
		if(valor>0 && saldo>=valor) {
			saldo -= valor;
			destinatario.depositar(valor); //utilizo o método para depositar o valor que ja foi verficado
			return true;
		}
		
		return false;
	}
		
	//encapsulamentos
	public int getAgencia() {
		return agencia;
	}
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	public int getNumeroConta() {
		return numeroConta;
	}
	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}
	public double getSaldo() { //verificação é valida
		return saldo;
	}
	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;

		}
}
