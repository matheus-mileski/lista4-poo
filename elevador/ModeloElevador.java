package lista4ex1;

import java.util.ArrayList;

public class ModeloElevador {

	private int pessoas = 0;
	private ArrayList<Pessoa>lista = new ArrayList<Pessoa>(); 

	public ModeloElevador() {
	}
	
	public ModeloElevador(int n) {
		// cria n pessoas
		for(int i = 0; i < n; i++) {
			adicionarPessoa();
		}
	}

	public void setPessoas(int n) {
		pessoas = n;
	}

	public int getPessoas() {
		return pessoas;
	}

	public void adicionarPessoa() {
		Pessoa p = new Pessoa();
		p.setID(this.lista.size());
		this.lista.add(p);
		this.setPessoas(this.getPessoas()+1);
	}
	
	public void removerPessoa(int i) {
		this.lista.remove(i);
		this.setPessoas(this.getPessoas()-1);

	}
	
	public Pessoa getPessoa(int i) {
		return this.lista.get(i);
	}
	

}
