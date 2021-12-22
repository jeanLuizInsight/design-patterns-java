package creational.abstract_factory;

/**
 * Classe concreta para produto Exército da família de Elfos.
 * @author <a href="mailto:jean.zanatta@unoesc.edu.br">Jean Luiz Zanatta</a>
 * @since 21/12/2021
 */
public class ElfExercito implements Exercito {

	private final String DESCRICAO = "Este é o exército élfico.";

	@Override
	public String getDescricao() {
		return DESCRICAO;
	}

}
