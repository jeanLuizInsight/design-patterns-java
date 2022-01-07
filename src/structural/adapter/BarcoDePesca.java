package structural.adapter;

import java.util.logging.Logger;

/**
 * Classe device. A mesma será reutilizada, adaptada.
 * @author <a href="mailto:jean.zanatta@unoesc.edu.br">Jean Luiz Zanatta</a>
 * @since 07/01/2022
 */
public final class BarcoDePesca {

	private static final Logger LOGGER = Logger.getLogger(BarcoDePesca.class.getName());

	void navegar() {
		BarcoDePesca.LOGGER.info("O barco pesqueiro está navegando...");
	}
}
