package structural.proxy;

/**
 * Classe que representa um Mago.
 * @author <a href="mailto:jean.zanatta@unoesc.edu.br">Jean Luiz Zanatta</a>
 * @since 12/02/2022
 */
public class Mago {

	private final String nome;

	public Mago(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return nome;
	}
}
