package creational.prototype;

/**
 * Classe elfo do tipo Mago
 * @author <a href="mailto:jean.zanatta@unoesc.edu.br">Jean Luiz Zanatta</a>
 * @since 14/12/2021
 */
public class ElfMago extends Mago {

	private final String tipoDeAjuda;

	public ElfMago(ElfMago elfMago) {
		super(elfMago);
		tipoDeAjuda = elfMago.tipoDeAjuda;
	}

	@Override
	public ElfMago copy() {
		return new ElfMago(this);
	}

	@Override
	public String toString() {
		return "O mago élfico ajuda em " + tipoDeAjuda;
	}
}
