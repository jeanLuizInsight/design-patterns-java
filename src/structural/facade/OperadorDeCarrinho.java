package structural.facade;

import java.util.logging.Logger;

/**
 * Classe que representa um operador de carrinho. É um dos subsistemas da mina de ouro.
 *
 * @author <a href="mailto:jean.zanatta@unoesc.edu.br">Jean Luiz Zanatta</a>
 * @since 28/01/2022
 */
public class OperadorDeCarrinho extends Minerador {

	private static final Logger LOGGER = Logger.getLogger(OperadorDeCarrinho.class.getName());

	@Override
	public void trabalhar() {
		LOGGER.info(getNome() + " move o ouro encontrado para fora da mina.");
	}

	@Override
	public String getNome() {
		return "Operador de carrinho";
	}

}
