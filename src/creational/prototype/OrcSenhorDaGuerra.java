package creational.prototype;

/**
 * Classe orc do tipo SenhorDaGuerra
 * @author <a href="mailto:jean.zanatta@unoesc.edu.br">Jean Luiz Zanatta</a>
 * @since 14/12/2021
 */
public class OrcSenhorDaGuerra extends SenhorDaGuerra {

	private final String arma;

	public OrcSenhorDaGuerra(OrcSenhorDaGuerra orcSenhorDaGuerra) {
		super(orcSenhorDaGuerra);
		arma = orcSenhorDaGuerra.arma;
	}

	public OrcSenhorDaGuerra(String arma) {
		super();
		this.arma = arma;
	}

	@Override
	public OrcSenhorDaGuerra copy() {
		return new OrcSenhorDaGuerra(this);
	}

	@Override
	public String toString() {
		return "O orc senhor da guerra ataca com " + arma;
	}
}
