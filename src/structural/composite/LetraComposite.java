package structural.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Contrato composite (leaf) do tipo classe abstrata.
 * @author <a href="mailto:jean.zanatta@unoesc.edu.br">Jean Luiz Zanatta</a>
 * @since 29/12/2021
 */
public abstract class LetraComposite {

	private final List<LetraComposite> filhos = new ArrayList<>();

	public void add(final LetraComposite letra) {
		this.filhos.add(letra);
	}

	public int count() {
		return this.filhos.size();
	}

	public void imprimir() {
		this.imprimirEsseValorAntes();
		this.filhos.stream().forEach(LetraComposite::imprimir);
		this.imprimirEsseValorDepois();
	}

	protected void imprimirEsseValorDepois() {

	}

	protected void imprimirEsseValorAntes() {

	}
}
