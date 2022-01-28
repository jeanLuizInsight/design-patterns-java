package structural.facade;

import java.util.logging.Logger;

/**
 * Classe que representa um trabalhador com a função escavador de tuneis. É um dos subsistemas da mina de ouro.
 *
 * @author <a href="mailto:jean.zanatta@unoesc.edu.br">Jean Luiz Zanatta</a>
 * @since 28/01/2022
 */
public class EscavadorDeTunel extends Minerador {

	private static final Logger LOGGER = Logger.getLogger(EscavadorDeOuro.class.getName());

	@Override
	public void trabalhar() {
		LOGGER.info(getNome() + " escava para criar ou ampliar um túnel promissor.");
	}

	@Override
	public String getNome() {
		return "Escavador de tuneis";
	}

}
