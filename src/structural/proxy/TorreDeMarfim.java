package structural.proxy;

import java.util.logging.Logger;

/**
 * Classe que representa o objeto a ser proxyado.
 * @author <a href="mailto:jean.zanatta@unoesc.edu.br">Jean Luiz Zanatta</a>
 * @since 12/02/2022
 */
public class TorreDeMarfim implements TorreDoMago {

	private static final Logger LOGGER = Logger.getLogger(TorreDeMarfim.class.getName());

	@Override
	public void entrar(Mago mago) {
		LOGGER.info(mago + " entrou na torre.");
	}

}
