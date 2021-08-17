package lista4ex1;

public class Pessoa {

	private int ID;
	private boolean movendo = true;
	private int andar;

	public Pessoa() {
	}

	public void setID(int n) {
		ID = n;
	}
	
	public void setAndar(int n) {
		andar = n;
	}

	public int getID() {
		return ID;
	}
	
	public int getAndar() {
		return andar;
	}

	public void setMovendo(boolean n) {
		movendo = n;
	}

	public boolean getMovendo() {
		return movendo;
	}

	public void portaAberta() {
		
	}

}
