package tbbank;

public class ContaCorrente extends Conta {

	private double limite; 
	private double saldoComLimite;
	
	public ContaCorrente() {
		this.limite = 500.0; //this para dizer que é o atributo da classe
	}

	
	@Override
	public boolean sacar(double valor){//sobreescrever com o override
		if(valor > 0 && saldo >= valor) {
			saldo -= valor;
			return true; 
		}else if (valor <= saldoComLimite){
			saldo -= valor;
			return true;
		}
		return false;
		
	}
	@Override
	public boolean transferir (double valor, Conta destinatario) {
		double saldoTotal = saldo + limite;
		if(valor>0 && saldoTotal>=valor) {
			saldoTotal -= valor;
			destinatario.depositar(valor); 
			return true;
		}
		
		return false;
	}
	
	public double getLimite() { //para mostrar, ja que o set ele nao pode ter
		return this.limite;
	}
	
	public double getSaldoComLimite() {
		this.saldoComLimite = this.limite + super.saldo;
		return this.saldoComLimite;
	}
}
