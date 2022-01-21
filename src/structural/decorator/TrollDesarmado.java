package structural.decorator;

import java.util.logging.Logger;

/**
 * A classe TrollDesarmado implementa a interface {@link Troll} diretamente
 * @author <a href="mailto:jean.zanatta@unoesc.edu.br">Jean Luiz Zanatta</a>
 * @since 21/01/2022
 */
public class TrollDesarmado implements Troll {

	private static final Logger LOGGER = Logger.getLogger(TrollDesarmado.class.getName());

	@Override
	public void ataque() {
		LOGGER.info("O troll tenta agarrar quem vê pela frente!");
	}

	@Override
	public void fugirDaBatalha() {
		LOGGER.info("O troll grita de horror e foge!");
	}

	@Override
	public int getPoderDeAtaque() {
		return 15;
	}

}
