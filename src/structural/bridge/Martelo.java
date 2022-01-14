package structural.bridge;

import java.util.logging.Logger;

/**
 * Classe Martelo implementa��o da abstra��o Arma.
 * @author <a href="mailto:jean.zanatta@unoesc.edu.br">Jean Luiz Zanatta</a>
 * @since 14/01/2022
 */
public class Martelo implements Arma {

	private static final Logger LOGGER = Logger.getLogger(Martelo.class.getName());

	private final Encantamento encantamento;

	public Martelo(final Encantamento encantamento) {
		this.encantamento = encantamento;
	}

	@Override
	public Encantamento getEncantamento() {
		return this.encantamento;
	}

	@Override
	public void balancar() {
		Martelo.LOGGER.info("O martelo est� balan�ando.");
		this.encantamento.aplicar();
	}

	@Override
	public void manejar() {
		Martelo.LOGGER.info("O martelo est� sendo manejado.");
		this.encantamento.emAtivacao();
	}

	@Override
	public void desarmar() {
		Martelo.LOGGER.info("O martelo est� sendo desativado.");
		this.encantamento.emDesativacao();
	}

}
