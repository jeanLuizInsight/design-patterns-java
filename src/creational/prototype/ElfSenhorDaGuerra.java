package creational.prototype;

/**
 * Classe elfo do tipo ElfSenhorDaGuerra
 * @author <a href="mailto:jean.zanatta@unoesc.edu.br">Jean Luiz Zanatta</a>
 * @since 14/12/2021
 */
public class ElfSenhorDaGuerra extends SenhorDaGuerra {

	private final String tipoDeAjuda;

	public ElfSenhorDaGuerra(ElfSenhorDaGuerra elfSenhorDaGuerra) {
		super(elfSenhorDaGuerra);
		tipoDeAjuda = elfSenhorDaGuerra.tipoDeAjuda;
	}

	public ElfSenhorDaGuerra(String tipoDeAjuda) {
		super();
		this.tipoDeAjuda = tipoDeAjuda;
	}

	@Override
	public ElfSenhorDaGuerra copy() {
		return new ElfSenhorDaGuerra(this);
	}

	@Override
	public String toString() {
		return "O senhor da guerra élfico ajuda em " + tipoDeAjuda;
	}
}
