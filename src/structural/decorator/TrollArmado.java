package structural.decorator;

import java.util.logging.Logger;

import structural.bridge.App;

/**
 * Decorator que adiciona uma arma bast�o/porrete para um trol
 * @author <a href="mailto:jean.zanatta@unoesc.edu.br">Jean Luiz Zanatta</a>
 * @since 21/01/2022
 */
public class TrollArmado implements Troll {

	private static final Logger LOGGER = Logger.getLogger(App.class.getName());

	private final Troll decorated;

	public TrollArmado(Troll decorated) {
		super();
		this.decorated = decorated;
	}

	@Override
	public void ataque() {
		decorated.ataque();
		LOGGER.info("O troll balan�a perto de voc� com um bast�o!");
	}

	@Override
	public void fugirDaBatalha() {
		decorated.fugirDaBatalha();
	}

	@Override
	public int getPoderDeAtaque() {
		return decorated.getPoderDeAtaque() + 40;
	}

}
