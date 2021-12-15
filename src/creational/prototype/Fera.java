package creational.prototype;

/**
 * Classe abstrata base que representa uma Fera implementando Prototype
 *
 * @author <a href="mailto:jean.zanatta@unoesc.edu.br">Jean Luiz Zanatta</a>
 * @since 14/12/2021
 */
public abstract class Fera implements Prototype {

	public Fera(Fera source) {
	}

	@Override
	public abstract Fera copy();
}
