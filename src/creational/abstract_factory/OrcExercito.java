package creational.abstract_factory;

/**
 * Classe concreta para produto Exército da família de Orcs.
 * @author <a href="mailto:jean.zanatta@unoesc.edu.br">Jean Luiz Zanatta</a>
 * @since 21/12/2021
 */
public class OrcExercito implements Exercito {

	private final String DESCRICAO = "Este é o exército orc.";

	@Override
	public String getDescricao() {
		return DESCRICAO;
	}

}
