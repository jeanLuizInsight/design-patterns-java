package structural.bridge;

import java.util.logging.Logger;

/**
 * Implementação EncantamentoVoador da abstração de composição Encantamento
 * @author <a href="mailto:jean.zanatta@unoesc.edu.br">Jean Luiz Zanatta</a>
 * @since 14/01/2022
 */
public class EncantamentoVoador implements Encantamento {

	private static final Logger LOGGER = Logger.getLogger(EncantamentoVoador.class.getName());

	@Override
	public void aplicar() {
		EncantamentoVoador.LOGGER.info("O item voa e atinge os inimigos finalmente retornando a mão de seu dono.");
	}

	@Override
	public void emAtivacao() {
		EncantamentoVoador.LOGGER.info("O item começa a brilhar levemente.");
	}

	@Override
	public void emDesativacao() {
		EncantamentoVoador.LOGGER.info("O brilho do item desaparece.");
	}

}
