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
public class CatalogoTeste {

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
	public void getJogosDoCatalogoTeste() {

		AssinaturaDeluxe deluxeAssinatura = new AssinaturaDeluxe(catalogo);
		AssinaturaPremium premiumAssinatura = new AssinaturaPremium(catalogo);
		AssinaturaBasic basicAssinatura = new AssinaturaBasic(catalogo);

		List<Jogo> jogosDeluxe = new ArrayList<Jogo>();
		List<Jogo> jogosPremium = new ArrayList<Jogo>();
		List<Jogo> jogosBasic = new ArrayList<Jogo>();

		jogosDeluxe = catalogo.getJogosDoCatalogo(basicAssinatura);
		jogosPremium = catalogo.getJogosDoCatalogo(deluxeAssinatura);
		jogosBasic = catalogo.getJogosDoCatalogo(premiumAssinatura);

		boolean isDeluxe =  true;
		boolean isPremium =  true;
		boolean isBasic =  true;
		
		for (Jogo jogo : jogosDeluxe) {
			if(jogo.getTipoAssinatura().equals(jogosPremium) ||
					jogo.getTipoAssinatura().equals(jogosBasic)) {
				isDeluxe = false;
			}
		}

		for (Jogo jogo : jogosPremium) {
			if(jogo.getTipoAssinatura().equals(jogosDeluxe) ||
					jogo.getTipoAssinatura().equals(jogosBasic)) {
				isPremium = false;
			}
		}

		for (Jogo jogo : jogosBasic) {
			if(jogo.getTipoAssinatura().equals(jogosDeluxe) ||
					jogo.getTipoAssinatura().equals(jogosPremium)) {
				isBasic = false;
			}
		
		assertEquals(true, isDeluxe);
		assertEquals(true, isPremium);
		assertEquals(true, isBasic);

		}
	}

}
