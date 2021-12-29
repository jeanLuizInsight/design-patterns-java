package structural.composite;

import java.util.List;

/**
 * Classe Palavra, representa um objeto composto por outro do tipo composto (Composite)
 * @author <a href="mailto:jean.zanatta@unoesc.edu.br">Jean Luiz Zanatta</a>
 * @since 29/12/2021
 */
public class Palavra extends LetraComposite {

	public Palavra(final List<Letra> letras) {
		super();
		letras.stream().forEach(this::add);
	}

	public Palavra(final char... letras) {
		super();
		for (final char letra : letras) {
			this.add(new Letra(letra));
		}
	}

	@Override
	protected void imprimirEsseValorAntes() {
		System.out.print(" ");
	}

}
