package tbbank;

public class PessoaFisica extends PessoaHeranca {

	private String cpf;
	private String rg;
	private String profissao;
	
	
	//ctrl+3 > gcfs (from super class)
	
	public PessoaFisica() {
		super();
	}
	
	//ctrl+3 > gcuf (..users and fields)
	
		public PessoaFisica(String cpf, String rg, String profissao) {
			super();
			this.cpf = cpf;
			this.rg = rg;
			this.profissao = profissao;
		}
	

	//ctlr+3 > ggas (getters and setters)
	
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public String getProfissao() {
		return profissao;
	}
	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}
	
	
}
