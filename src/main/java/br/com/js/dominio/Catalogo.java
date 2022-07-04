package br.com.js.dominio;

import java.util.ArrayList;
import java.util.List;

import br.com.js.Exception.TipoDeAssinaturaInvalidaException;
import br.com.js.enums.TipoAssinatura;

public class Catalogo {
	
	private List<Jogo> jogosDoCatalogo;

	@SuppressWarnings("unchecked")
	public List<Jogo> getJogosDoCatalogo(Assinatura assinatura) throws TipoDeAssinaturaInvalidaException {
		
		if(assinatura.getTipoAssinatura().equals(TipoAssinatura.BASIC)) {
			List<Jogo> listaJogosBasic = new ArrayList<Jogo>();
			
			for (Jogo jogo : jogosDoCatalogo) {
				if(jogo.getTipoAssinatura().equals(TipoAssinatura.BASIC)) {
					listaJogosBasic.add(jogo);
				}
			}
			
			return listaJogosBasic;
		}
		
		if(assinatura.getTipoAssinatura().equals(TipoAssinatura.PLATINUM)) {
			List<Jogo> listaJogosPlatinum = new ArrayList<Jogo>();
			
			for (Jogo jogo : jogosDoCatalogo) {
				if(jogo.getTipoAssinatura().equals(TipoAssinatura.PLATINUM)) {
					listaJogosPlatinum.add(jogo);
				}
			}
			
			return listaJogosPlatinum;
		}
		
		if(assinatura.getTipoAssinatura().equals(TipoAssinatura.DELUXE)) {
			List<Jogo> listaJogosDeluxe = new ArrayList<Jogo>();
			
			for (Jogo jogo : jogosDoCatalogo) {
				if(jogo.getTipoAssinatura().equals(TipoAssinatura.DELUXE)) {
					listaJogosDeluxe.add(jogo);
				}
			}
			
			return listaJogosDeluxe;
		}
		
		return (List<Jogo>) new TipoDeAssinaturaInvalidaException();
	
	}

	public void setJogosDoCatalogo(List<Jogo> jogosDoCatalogo) {
		this.jogosDoCatalogo = jogosDoCatalogo;
	}
		
}
