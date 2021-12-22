package creational.abstract_factory;

/**
 * Classe concreta para produto Castelo da família de Orcs.
 * @author <a href="mailto:jean.zanatta@unoesc.edu.br">Jean Luiz Zanatta</a>
 * @since 21/12/2021
 */
public class OrcCastelo implements Castelo {

	private final String DESCRICAO = "Este é o castelo orc.";

	@Override
	public String getDescricao() {
		return DESCRICAO;
	}

}
