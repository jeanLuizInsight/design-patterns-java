package creational.prototype;

/**
 * Classe orc do tipo Fera
 * @author <a href="mailto:jean.zanatta@unoesc.edu.br">Jean Luiz Zanatta</a>
 * @since 14/12/2021
 */
public class OrcFera extends Fera {

	private final String arma;

	public OrcFera(OrcFera orcFera) {
		super(orcFera);
		arma = orcFera.arma;
	}

	@Override
	public OrcFera copy() {
		return new OrcFera(this);
	}

	@Override
	public String toString() {
		return "A orc fera ataca com " + arma;
	}
}
