package tbbank;

public class TesteBanco {

	public static void main(String[] args) {
		
//		Pessoas pessoasNumero1 = new Pessoas(); //criar uma instancia = copia
//		pessoasNumero1.nome = "Jose das Couves";
//		pessoasNumero1.profissao = "Agricultor";
//		pessoasNumero1.cpf= "643.829.641-48";
//		
//		System.out.println("Nome: " + pessoasNumero1.nome);
//		System.out.println("Profissão: " + pessoasNumero1.profissao);
//		System.out.println("CPF: " + pessoasNumero1.cpf);	//Lei LGPD não permite a exposição de dados pessoais
//		
//		Pessoas pessoasNumero2 = pessoasNumero1;
//		
//		System.out.println("=====================================");
//		
//		System.out.println("Nome: "+pessoasNumero2.nome);
//		System.out.println("Nome: "+pessoasNumero1.nome);
		
		
//		//método construtor sem passagem de valor - default - preciso do set pra armazenar a informação
//		Pessoas pessoasNova = new Pessoas(); //instanciar a classe Pessoas
//		pessoasNova.setNome("José das Couves");
//		System.out.println("Nome:" + pessoasNova.getNome());
//		
//		//exibe a informação na tela
//		Pessoas pessoasComConstrutor1 = new Pessoas("João dos Tomates", "259.800.966-55", "123.456-78");
//		System.out.println("Nome: " + pessoasComConstrutor1.getNome());
//		System.out.println("CPF: " + pessoasComConstrutor1.getCpf());
//		System.out.println("RG:" + pessoasComConstrutor1.getRg());
	
		
		Conta conta1 = new Conta();
		conta1.setAgencia(1234);
		conta1.setNumeroConta(7889);
		//conta1.setSaldo(1000000.50); >> não se deve operar diretamenn",conta1.getSaldo());te essa informação. 
		//Ela pode apenas ser exibida
		conta1.setTitular("Tauane Bezerra");
		
		conta1.depositar(100000.0);
		
		System.out.println("Agência: " + conta1.getAgencia());
		System.out.println("Conta: " + conta1.getNumeroConta());
		System.out.println("Titular: " + conta1.getTitular());
		System.out.printf("Saldo Atual: %.2f\n",conta1.getSaldo());//para formatar as casas decimais
		
		if (conta1.sacar(20.0)) {
			System.out.println("Saque efetuado com sucesso!");
		}else {
			System.out.println("Verifique valor do saque!");
		}
		
		
		System.out.println("Saldo Atual: " + conta1.getSaldo());
		
		
		Conta conta2 = new Conta();
			conta2.setAgencia(5582);
			conta2.setNumeroConta(2234);
			
			conta1.transferir(10000.0, conta2);
			System.out.printf("Saldo Atual Tauane: %.2f\n",conta1.getSaldo());
			System.out.printf("Saldo Atual Flavia: %.2f\n",conta2.getSaldo());
	
	}
		
}

