package br.com.sistema.cidade;

public class Cidade {

	private String estado;
	private String nomeCidade;
	
	public Cidade(String nomeCidade){
		this.nomeCidade = nomeCidade;
	}

	public Cidade(String estado, String cidade) {
		this.estado = estado;
		this.nomeCidade = nomeCidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getCidade() {
		return nomeCidade;
	}

	public void setCidade(String cidade) {
		this.nomeCidade = nomeCidade;
	}

	@Override
	public String toString() {
		return "\nCidade [cidade=" + nomeCidade + ", \nestado="+ estado + "]\n\n";
	}
	
	
}
