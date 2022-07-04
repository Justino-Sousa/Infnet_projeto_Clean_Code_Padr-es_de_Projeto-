package br.com.js.dominio;

import br.com.js.enums.TipoAssinatura;

public class Jogo {
	
	public Jogo(String nome, TipoAssinatura tipoAssinatura) {
		
		this.nome = nome;
		this.tipoAssinatura = tipoAssinatura;
	}
	
	public Jogo() {}
	
	private String nome;
	private TipoAssinatura tipoAssinatura;
	
	public String getNome() {
		return nome;
	}
	
	public TipoAssinatura getTipoAssinatura() {
		return tipoAssinatura;
	}
	
}
