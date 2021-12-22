package creational.abstract_factory;

/**
 * Classe concreta para produto Ex�rcito da fam�lia de Elfos.
 * @author <a href="mailto:jean.zanatta@unoesc.edu.br">Jean Luiz Zanatta</a>
 * @since 21/12/2021
 */
public class ElfExercito implements Exercito {

	private final String DESCRICAO = "Este � o ex�rcito �lfico.";

	@Override
	public String getDescricao() {
		return DESCRICAO;
	}

}
