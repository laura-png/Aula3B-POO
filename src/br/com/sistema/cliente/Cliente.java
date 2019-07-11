package br.com.sistema.cliente;

import br.com.sistema.cidade.Cidade;

public class Cliente {

	private String nome;
	private String email;
	private String telefone;
	private Cidade cidade;
	
	public Cliente(String nome){
		this.nome = nome;
	}

	public Cliente(String nome, String email, String telefone) {
		this.nome = nome;
		this.email = email;
		this.telefone = telefone;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	public Cidade getCidade() {
		return cidade;
	}

	public void setCidade(Cidade cidade) {
		this.cidade = cidade;
	}

	@Override
	public String toString() {
		return "Cliente [nome=" + nome + ", \nemail=" + email + ", telefone="+ telefone + "]"+ ", \n" + cidade ;
	}
	
	
	
	
}
