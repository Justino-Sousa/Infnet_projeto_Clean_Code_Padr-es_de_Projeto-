package br.com.js.dominio;

import java.util.List;

import br.com.js.enums.TaxaAssinatura;
import br.com.js.enums.TipoAssinatura;

public class AssinaturaDeluxe implements Assinatura {

	private TipoAssinatura tipoAssinatura = TipoAssinatura.DELUXE;
	private Catalogo catalogo;
	
	public AssinaturaDeluxe (Catalogo catalogo) {
		this.catalogo = catalogo;
	}
	
	@Override
	public Double getPrecoDaAssinatura() {		
		return TaxaAssinatura.DELUXE.getValorTaxa();
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
