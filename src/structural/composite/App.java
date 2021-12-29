package structural.composite;

import java.util.logging.Logger;

/**
 * @author <a href="mailto:jean.zanatta@unoesc.edu.br">Jean Luiz Zanatta</a>
 * @since 29/12/2021
 */
public class App {

	private static final Logger LOGGER = Logger.getLogger(App.class.getName());

	public static void main(final String[] args) {

		final Mensageiro mensageiro = new Mensageiro();
		App.LOGGER.info("Mensagem para os orcs: ");
		mensageiro.mensagemParaOrcs().imprimir();
		App.LOGGER.info("Mensagem para os elfos: ");
		mensageiro.mensagemParaElfos().imprimir();

	}
}
