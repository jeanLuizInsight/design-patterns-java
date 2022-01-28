package structural.facade;

import java.util.logging.Logger;

/**
 * Classe que representa um trabalhador com a função escavador de ouro. É um dos subsistemas da mina de ouro.
 *
 * @author <a href="mailto:jean.zanatta@unoesc.edu.br">Jean Luiz Zanatta</a>
 * @since 28/01/2022
 */
public class EscavadorDeOuro extends Minerador {

	private static final Logger LOGGER = Logger.getLogger(EscavadorDeOuro.class.getName());

	@Override
	public void trabalhar() {
		LOGGER.info(getNome() + " escava em busca de ouro.");
	}

	@Override
	public String getNome() {
		return "Escavador de ouro";
	}

}
