package structural.composite;

import java.util.List;

/**
 * Classe Frase, representa um objeto composto por outro do tipo composto (Composite)
 * @author <a href="mailto:jean.zanatta@unoesc.edu.br">Jean Luiz Zanatta</a>
 * @since 29/12/2021
 */
public class Frase extends LetraComposite {

	public Frase(final List<Palavra> palavras) {
		super();
		palavras.stream().forEach(this::add);
	}

	@Override
	protected void imprimirEsseValorDepois() {
		System.out.println(".\n");
	}

}
