package br.com.js.dominio;

import java.util.List;

import br.com.js.enums.TipoAssinatura;

public interface Assinatura {
	
	public Double getPrecoDaAssinatura();
	public List<Jogo> getJogosDoCatalogoDaAssinatura();
	public TipoAssinatura getTipoAssinatura();
	
}

