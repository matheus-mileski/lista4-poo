package lista4ex1;

public class PortaElevador {

	private boolean aberta = false;

	public PortaElevador() {
	}

	public void setAberta(boolean n) {
		aberta = n;
	}

	public boolean getAberta() {
		return aberta;
	}

	public void adicionarPessoa() {
	}

	public void abrirPorta() {
	}

	public void fecharPorta() {
		this.setAberta(false);
	}

}
