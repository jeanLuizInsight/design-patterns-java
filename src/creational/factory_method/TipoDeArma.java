package creational.factory_method;

/**
 * Enum para tipo de arma
 * @author <a href="mailto:jean.zanatta@unoesc.edu.br">Jean Luiz Zanatta</a>
 * @since 16/12/2021
 */
public enum TipoDeArma {

	MACHADO("machado"),
	ESPADA("espada"),
	LANCA("lança"),
	INDEFINIDO("tipo indefinido");

	private final String titulo;

	private TipoDeArma(String titulo) {
		this.titulo = titulo;
	}

	@Override
	public String toString() {
		return titulo;
	}

}
