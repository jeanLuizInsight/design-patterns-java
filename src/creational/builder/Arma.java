package creational.builder;

/**
 * Enum para Arma
 * @author <a href="mailto:jean.zanatta@unoesc.edu.br">Jean Luiz Zanatta</a>
 * @since 08/12/2021
 */
public enum Arma {

	MACHADO,
	ARCO,
	PUNHAL,
	ESPADA;

	@Override
	public String toString() {
		return this.name().toLowerCase();
	}
}
