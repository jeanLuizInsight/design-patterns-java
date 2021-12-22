package creational.abstract_factory;

/**
 * Classe concreta para produto Castelo da fam�lia de Elfos.
 * @author <a href="mailto:jean.zanatta@unoesc.edu.br">Jean Luiz Zanatta</a>
 * @since 21/12/2021
 */
public class ElfCastelo implements Castelo {

	private final String DESCRICAO = "Este � o castelo �lfico.";

	@Override
	public String getDescricao() {
		return DESCRICAO;
	}
}
