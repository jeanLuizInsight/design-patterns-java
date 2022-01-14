package structural.bridge;

import java.util.logging.Logger;

/**
 * Implementação EncantamentoEngolidorDeAlmas da abstração de composição Encantamento
 * @author <a href="mailto:jean.zanatta@unoesc.edu.br">Jean Luiz Zanatta</a>
 * @since 14/01/2022
 */
public class EncantamentoEngolidorDeAlmas implements Encantamento {

	private static final Logger LOGGER = Logger.getLogger(EncantamentoEngolidorDeAlmas.class.getName());

	@Override
	public void aplicar() {
		EncantamentoEngolidorDeAlmas.LOGGER.info("O item come a alma dos inimigos.");
	}

	@Override
	public void emAtivacao() {
		EncantamentoEngolidorDeAlmas.LOGGER.info("O item espalha sede de sangue.");
	}

	@Override
	public void emDesativacao() {
		EncantamentoEngolidorDeAlmas.LOGGER.info("A sede de sangue desaparece lentamente.");
	}

}
