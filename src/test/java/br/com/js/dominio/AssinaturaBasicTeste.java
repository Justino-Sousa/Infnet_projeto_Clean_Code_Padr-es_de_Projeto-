package br.com.js.dominio;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

import br.com.js.enums.TipoAssinatura;

@TestInstance(Lifecycle.PER_CLASS)
class AssinaturaBasicTeste {

	private Catalogo catalogo = new Catalogo();
	AssinaturaBasic assinaturaBasic = new AssinaturaBasic(catalogo);

	@BeforeAll
	public void before() {

		Jogo j1 = new Jogo("The last of us", TipoAssinatura.DELUXE);
		Jogo j2 = new Jogo("God of War", TipoAssinatura.DELUXE);
		Jogo j3 = new Jogo("Mortal kombat XL", TipoAssinatura.PLATINUM);
		Jogo j4 = new Jogo("FIFA 22", TipoAssinatura.PLATINUM);
		Jogo j5 = new Jogo("Guardiões da Galáxia", TipoAssinatura.BASIC);
		Jogo j6 = new Jogo("Assassin's creed Valhalla", TipoAssinatura.BASIC);

		List<Jogo> listadeJogos = new ArrayList<Jogo>();
		listadeJogos = Arrays.asList(j1, j2, j3, j4, j5, j6);

		catalogo.setJogosDoCatalogo(listadeJogos);
	}

	@Test
	void getPrecoDaAssinaturaTeste() {
		assertEquals(Double.valueOf("150.2"), assinaturaBasic.getPrecoDaAssinatura());

	}

	@Test
	void getJogosDoCatalogoDaAssinaturaTeste() {
		List<Jogo> jogos = new ArrayList<Jogo>();
		jogos = assinaturaBasic.getJogosDoCatalogoDaAssinatura();
		boolean jogosTipoBasic = true;

		for (Jogo jogo : jogos) {
			if (jogo.getTipoAssinatura().equals(TipoAssinatura.DELUXE)
					|| jogo.getTipoAssinatura().equals(TipoAssinatura.PLATINUM)) {
				jogosTipoBasic = false;
			}

			assertEquals(true, jogosTipoBasic);
		}

	}
	
	@Test
	void getTipoAssinaturaTeste() {
		
		assertEquals(TipoAssinatura.BASIC, assinaturaBasic.getTipoAssinatura());
	}
	

}
