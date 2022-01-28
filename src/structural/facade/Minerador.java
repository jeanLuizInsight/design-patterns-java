package structural.facade;

import java.util.Arrays;
import java.util.logging.Logger;

/**
 * Minerador é a interface que representa um trabalhador, é um dos subsistemas
 * da mina de ouro.
 *
 * @author <a href="mailto:jean.zanatta@unoesc.edu.br">Jean Luiz Zanatta</a>
 * @since 28/01/2022
 */
public abstract class Minerador {

	private static final Logger LOGGER = Logger.getLogger(Minerador.class.getName());

	private void acao(Acao acao) {
		switch (acao) {
		case IR_DORMIR:
			irDormir();;
			break;
		case ACORDAR:
			acordar();
			break;
		case IR_PARA_CASA:
			irParaCasa();;
			break;
		case IR_PARA_MINA:
			irParaMina();;
			break;
		case TRABALHAR:
			trabalhar();;
			break;
		default:
			LOGGER.info("Ação indefinida.");
			break;
		}
	}

	public void acao(Acao... acoes) {
		Arrays.stream(acoes).forEach(this::acao);
	}

	public void irParaCasa() {
		LOGGER.info(getNome() + " vai para casa.");
	}

	public void irParaMina() {
		LOGGER.info(getNome() + " vai para a mina.");
	}

	public void irDormir() {
		LOGGER.info(getNome() + " vai dormir.");
	}

	public void acordar() {
		LOGGER.info(getNome() + " vai acordar.");
	}

	public abstract void trabalhar();

	public abstract String getNome();

	enum Acao {
		IR_PARA_CASA, IR_PARA_MINA, IR_DORMIR, ACORDAR, TRABALHAR
	}
}
