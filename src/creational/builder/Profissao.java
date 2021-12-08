package creational.builder;

/**
 * Enum para Profissão
 * @author <a href="mailto:jean.zanatta@unoesc.edu.br">Jean Luiz Zanatta</a>
 * @since 08/12/2021
 */
public enum Profissao {

	MAGO,
	SACERDOTE,
	LADRAO,
	GUERREIRO;

	@Override
	public String toString() {
		return this.name().toLowerCase();
	}
}
