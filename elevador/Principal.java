package lista4ex1;

import java.util.ArrayList;

public class Principal {
	
	public static void main(String[] args) {
		ModeloElevador usuarios = new ModeloElevador(10);
		Elevador e = new Elevador();
		ArrayList<Andar>listaAndares = new ArrayList<Andar>(); 
		for(int i=0; i < 5; i++) {
			Andar a = new Andar();
			a.setNumeroAndar(i);
			listaAndares.add(a);
		}
		
		System.out.println(e.getAndarAtual());
		
		// ex2) diagrama atividade Elevador
		e.setChegou(false);
		e.porta.fecharPorta();
		e.mover();
		e.botao.liberarBotao();
		e.c.tocarCampainha();
		e.porta.abrirPorta();
		
		System.out.println(e.getAndarAtual());
		
		// ex3) diagrama atividade Pessoa
		Pessoa p = usuarios.getPessoa(1);
		
		p.setMovendo(true);
		
		if(e.porta.getAberta() == true) {
			
		}else {
			
			p.setMovendo(false);
		}
			
		
	}
}
