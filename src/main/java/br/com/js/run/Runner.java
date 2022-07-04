package br.com.js.run;

import java.util.Arrays;
import java.util.List;

import br.com.js.dominio.AssinaturaBasic;
import br.com.js.dominio.AssinaturaDeluxe;
import br.com.js.dominio.AssinaturaPremium;
import br.com.js.dominio.Catalogo;
import br.com.js.dominio.Cliente;
import br.com.js.dominio.Jogo;
import br.com.js.enums.TipoAssinatura;

public class Runner {

	public static void main(String[] args) {
		
		Jogo j1 = new Jogo("The last of us", TipoAssinatura.DELUXE);
		Jogo j2 = new Jogo("God of War", TipoAssinatura.DELUXE);
		Jogo j3 = new Jogo("Mortal kombat XL", TipoAssinatura.PLATINUM);
		Jogo j4 = new Jogo("FIFA 22", TipoAssinatura.PLATINUM);
		Jogo j5 = new Jogo("Guardiões da Galáxia", TipoAssinatura.BASIC);
		Jogo j6 = new Jogo("Assassin's creed Valhalla", TipoAssinatura.BASIC);
		
		List<Jogo> listadeJogos = Arrays.asList(j1,j2,j3,j4,j5,j6);
		
		Catalogo catalogo = new Catalogo();
		catalogo.setJogosDoCatalogo(listadeJogos);
		
		AssinaturaBasic assinaturaBasic = new AssinaturaBasic(catalogo);
		Cliente cli1 = new Cliente("Justino","The_hunter", assinaturaBasic);
		
		AssinaturaPremium assinaturaPremium = new AssinaturaPremium(catalogo);
		Cliente cli2= new Cliente("Ragnar","lothbrok", assinaturaPremium);
		
		AssinaturaDeluxe assinaturaDeluxe = new AssinaturaDeluxe(catalogo);
		Cliente cli3 = new Cliente("Goku","Kakaroto", assinaturaDeluxe);
		
		List<Cliente> listaDeClientes = Arrays.asList(cli1,cli2,cli3);
			
		for (Cliente cliente : listaDeClientes) {
			System.out.println("Jogos disponiveis para "+cliente.getNome()+":\r\n");
			List<Jogo> listajogosDoCliente = cliente.getAssinatura().getJogosDoCatalogoDaAssinatura();
			for (Jogo jogo : listajogosDoCliente) {
				System.out.println(jogo.getNome());
			}
			System.out.println("");
			System.out.println("Valor da assinatura:"+ cliente.getAssinatura().getPrecoDaAssinatura());
			System.out.println("********************************");
			System.out.println("");
		}
		
	}
}
