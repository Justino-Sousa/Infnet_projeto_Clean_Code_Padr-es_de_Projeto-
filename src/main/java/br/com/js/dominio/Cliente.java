package br.com.js.dominio;

public class Cliente {

	private String nome;
	private String apelido;
	private Assinatura assinatura;

	public Cliente(String nome, String apelido, Assinatura assinatura) {
		this.nome = nome;
		this.apelido = apelido;
		this.assinatura= assinatura;
	}

	public String getNome() {
		return nome;
	}

	public String getApelido() {
		return apelido;
	}

	public Assinatura getAssinatura() {
		return assinatura;
	}
	
}
