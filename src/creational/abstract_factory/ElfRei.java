package creational.abstract_factory;

/**
 * Classe concreta para produto Rei da família de Elfos.
 * @author <a href="mailto:jean.zanatta@unoesc.edu.br">Jean Luiz Zanatta</a>
 * @since 21/12/2021
 */
public class ElfRei implements Rei {

	private final String DESCRICAO = "Este é o rei élfico.";

	@Override
	public String getDescricao() {
		return DESCRICAO;
	}

}
