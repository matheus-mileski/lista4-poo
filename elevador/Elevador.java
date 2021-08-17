package lista4ex1;

public class Elevador {

	private boolean movendo = false;
	private boolean chegou = false;
	private int andarAtual = 1;
	private int andarDestino = 2;
	private int capacidade = 1;
	private int tempoPorAndar = 5;
	
	public PortaElevador porta = new PortaElevador();
	public BotaoElevador botao = new BotaoElevador(); 
	public ElevadorUtilitarios util = new ElevadorUtilitarios();
	public Campainha c = new Campainha();
	
	public Elevador() {
	}

	public void setMovendo(boolean n) {
		movendo = n;
	}

	public boolean getMovendo() {
		return movendo;
	}

	public void setChegou(boolean n) {
		chegou = n;
	}

	public boolean getChegou() {
		return chegou;
	}

	public void setAndarAtual(int n) {
		andarAtual = n;
	}

	public int getAndarAtual() {
		return andarAtual;
	}

	public void setAndarDestino(int n) {
		andarDestino = n;
	}

	public int getAndarDestino() {
		return andarDestino;
	}

	public void setCapacidade(int n) {
		capacidade = n;
	}

	public int getCapacidade() {
		return capacidade;
	}

	public void setTempoPorAndar(int n) {
		tempoPorAndar = n;
	}

	public int getTempoPorAndar() {
		return tempoPorAndar;
	}

	public void mover() {
		this.setMovendo(true);
		
		int distancia = Math.abs(this.getAndarDestino() - this.getAndarAtual());
		
		for(int i = 0; i < distancia; i++) {
			try {
				Thread.sleep(this.getTempoPorAndar()*100); // sleep por 0.5 segundo por andar
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		
		this.setAndarAtual(this.getAndarDestino());		
		
	}

	public void requisitarElevador() {
	}

	public void entrarElevador() {
	}

	public void sairElevador() {
	}

	public void partidaElevador() {
	}

}
