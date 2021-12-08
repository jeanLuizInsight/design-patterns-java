package creational.builder;

/**
 * Enum para Armadura
 * @author <a href="mailto:jean.zanatta@unoesc.edu.br">Jean Luiz Zanatta</a>
 * @since 08/12/2021
 */
public enum Armadura {

	TECIDO("Tecido"),
	COURO("Couro"),
	METAL("Metal");

	private final String titulo;

	Armadura(final String titulo) {
		this.titulo = titulo;
	}

	@Override
	public String toString() {
		return this.titulo;
	}
}
