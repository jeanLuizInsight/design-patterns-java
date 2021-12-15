package creational.prototype;

/**
 * Classe abstrata base que representa um Mago implementando Prototype
 * @author <a href="mailto:jean.zanatta@unoesc.edu.br">Jean Luiz Zanatta</a>
 * @since 14/12/2021
 */
public abstract class Mago implements Prototype {

	public Mago() {
	}

	public Mago(Mago source) {
	}

	@Override
	public abstract Mago copy();
}
