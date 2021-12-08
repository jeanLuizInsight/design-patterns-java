package creational.builder;

/**
 * Enum para cor do cabelo
 * @author <a href="mailto:jean.zanatta@unoesc.edu.br">Jean Luiz Zanatta</a>
 * @since 08/12/2021
 */
public enum CorDoCabelo {

	PRETO,
	MARROM,
	VERMELHO,
	BRANCO;

	@Override
	public String toString() {
		return this.name().toLowerCase();
	}
}
