package creational.prototype;

/**
 * Classe orc do tipo Mago
 * @author <a href="mailto:jean.zanatta@unoesc.edu.br">Jean Luiz Zanatta</a>
 * @since 14/12/2021
 */
public class OrcMago extends Mago {

	private final String arma;

	public OrcMago(OrcMago orcMago) {
		super(orcMago);
		arma = orcMago.arma;
	}

	public OrcMago(String arma) {
		super();
		this.arma = arma;
	}

	@Override
	public OrcMago copy() {
		return new OrcMago(this);
	}

	@Override
	public String toString() {
		return "O orc mago ataca com " + arma;
	}
}
