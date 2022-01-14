package structural.bridge;

import java.util.logging.Logger;

/**
 * Classe Espada implementação da abstração Arma.
 * @author <a href="mailto:jean.zanatta@unoesc.edu.br">Jean Luiz Zanatta</a>
 * @since 14/01/2022
 */
public class Espada implements Arma {

	private static final Logger LOGGER = Logger.getLogger(Espada.class.getName());

	private final Encantamento encantamento;

	public Espada(final Encantamento encantamento) {
		this.encantamento = encantamento;
	}

	@Override
	public Encantamento getEncantamento() {
		return this.encantamento;
	}

	@Override
	public void balancar() {
		Espada.LOGGER.info("A espada está balançando.");
		this.encantamento.aplicar();
	}

	@Override
	public void manejar() {
		Espada.LOGGER.info("A espada está sendo manejada.");
		this.encantamento.emAtivacao();
	}

	@Override
	public void desarmar() {
		Espada.LOGGER.info("A espada está sendo desativada.");
		this.encantamento.emDesativacao();
	}

}
