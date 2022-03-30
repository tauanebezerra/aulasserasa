package tbbank;

public class PessoaJuridica extends PessoaHeranca {
	
	private String cnpj;
	private String segmento;
	private String responsavel;
	
	//ctrl+3 > gcfs (from super class)
	
	public PessoaJuridica() {
		super();
	}
	
	
	//ctrl+3 > gcuf (..users and fields)
	
	public PessoaJuridica(String cnpj, String segmento, String responsavel) {
		super();
		this.cnpj = cnpj;
		this.segmento = segmento;
		this.responsavel = responsavel;
	}

	//ctlr+3 > ggas (getters and setters)

	public String getCnpj() {
		return cnpj;
	}


	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}


	public String getSegmento() {
		return segmento;
	}


	public void setSegmento(String segmento) {
		this.segmento = segmento;
	}


	public String getResponsavel() {
		return responsavel;
	}


	public void setResponsavel(String responsavel) {
		this.responsavel = responsavel;
	}

}