package tbbank;

public class Pessoas {
	
	private String nome;
	private String cpf;
	private String profissao;
	private String rg;
	private String telefone;
	private String email;
	
	//atributos privados e metodos de leitura e escrita public
	//métodos tem o ()
	
	public Pessoas() {
		//metodo construtor default = preenchimento dos atributos é opcional
	}
	
	public Pessoas(String nome, String cpf, String rg) {//parâmetros armazenados
		//informações que são obrigatórias
		//this siginifica atributo da classe
		this.nome = nome;
		this.cpf = cpf;
		this.rg = rg;
		
	}
	
	//clique com o lado direito > source > generation constructor fields
	public Pessoas(String nome, String cpf, String profissao, String telefone, String rg, String email) {
		super(); //faz referencia a classe que esta superior
		this.nome = nome;
		this.cpf = cpf;
		this.profissao = profissao;
		this.telefone = telefone;
		this.rg = rg;
		this.email = email;
	}
	
	
	//ASSINATURA DE METODO - ENCAPSULAMENTOS
	//clicar com o botão direito > source > generetion geters and seters
	
	public String getNome() { //GET exibe os objetos
		return nome;
	}
	
	public void setNome(String nome) { //SET grava os objetos nos atributos
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getProfissao() {
		return profissao;
	}
	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
