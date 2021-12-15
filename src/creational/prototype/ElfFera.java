package creational.prototype;

/**
 * Classe elfo do tipo Fera
 * @author <a href="mailto:jean.zanatta@unoesc.edu.br">Jean Luiz Zanatta</a>
 * @since 14/12/2021
 */
public class ElfFera extends Fera {

	private final String tipoDeAjuda;

	public ElfFera(ElfFera elfFera) {
		super(elfFera);
		tipoDeAjuda = elfFera.tipoDeAjuda;
	}

	@Override
	public ElfFera copy() {
		return new ElfFera(this);
	}

	@Override
	public String toString() {
		return "A fera élfica ajuda em " + tipoDeAjuda;
	}
}
