package br.com.js.dominio;

import java.util.List;

import br.com.js.enums.TaxaAssinatura;
import br.com.js.enums.TipoAssinatura;

public class AssinaturaPremium implements Assinatura{
	
	private TipoAssinatura tipoAssinatura = TipoAssinatura.PLATINUM;
	private Catalogo catalogo;
	
	public AssinaturaPremium (Catalogo catalogo) {
		this.catalogo = catalogo;
	}
	
	@Override
	public Double getPrecoDaAssinatura() {

		return TaxaAssinatura.PREMIUM.getValorTaxa();		
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
