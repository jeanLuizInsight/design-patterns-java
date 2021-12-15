package creational.prototype;

/**
 * Classe abstrata base que representa um SenhorDaGuerra implementando Prototype
 * @author <a href="mailto:jean.zanatta@unoesc.edu.br">Jean Luiz Zanatta</a>
 * @since 14/12/2021
 */
public abstract class SenhorDaGuerra implements Prototype {

	public SenhorDaGuerra() {
	}

	public SenhorDaGuerra(SenhorDaGuerra source) {
	}

	@Override
	public abstract SenhorDaGuerra copy();
}
