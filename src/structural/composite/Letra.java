package structural.composite;

/**
 * Classe Letra, representa um objeto composto por outro do tipo folha (Leaf)
 * @author <a href="mailto:jean.zanatta@unoesc.edu.br">Jean Luiz Zanatta</a>
 * @since 29/12/2021
 */
public class Letra extends LetraComposite {

	private final char caracter;

	public Letra(final char caracter) {
		super();
		this.caracter = caracter;
	}

	@Override
	protected void imprimirEsseValorDepois() {
		System.out.println(this.caracter);
	}

}
