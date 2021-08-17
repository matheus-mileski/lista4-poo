package lista4ex1;

public class BotaoElevador {

	private boolean pressionado = false;

	public BotaoElevador() {

	}

	public void setPressionado(boolean n) {
		pressionado = n;
	}

	public boolean getPressionado() {
		return pressionado;
	}

	public void liberarBotao() {
		this.setPressionado(false);
	}

	public void pressionarBotao() {
	}

}
