package creational.factory_method;

/**
 * Classe que representa um tipo de arma para orcs.
 * @author <a href="mailto:jean.zanatta@unoesc.edu.br">Jean Luiz Zanatta</a>
 * @since 16/12/2021
 */
public class OrcArma implements Arma {

	private TipoDeArma tipoDeArma;

	public OrcArma(TipoDeArma tipoDeArma) {
		super();
		this.tipoDeArma = tipoDeArma;
	}

	@Override
	public TipoDeArma getTipoDeArma() {
		return tipoDeArma;
	}

	@Override
	public String toString() {
		return "um(a) " + tipoDeArma + " orc";
	}

}
