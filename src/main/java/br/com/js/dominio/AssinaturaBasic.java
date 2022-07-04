package br.com.js.dominio;

import java.util.List;

import br.com.js.enums.TaxaAssinatura;
import br.com.js.enums.TipoAssinatura;

public class AssinaturaBasic implements Assinatura {
	
	private TipoAssinatura tipoAssinatura = TipoAssinatura.BASIC;
	private Catalogo catalogo;
	
	public AssinaturaBasic (Catalogo catalogo) {
		this.catalogo = catalogo;
	}

	@Override
	public Double getPrecoDaAssinatura() {
		return TaxaAssinatura.BASIC.getValorTaxa();
	}

	@Override
	public List<Jogo> getJogosDoCatalogoDaAssinatura() {
		return catalogo.getJogosDoCatalogo(this);
	}

	@Override
	public TipoAssinatura getTipoAssinatura() {
		return tipoAssinatura;
	}

}
