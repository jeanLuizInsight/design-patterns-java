package creational.abstract_factory;

/**
 * Classe concreta para fábrica do reino de orcs.
 * @author <a href="mailto:jean.zanatta@unoesc.edu.br">Jean Luiz Zanatta</a>
 * @since 21/12/2021
 */
public class OrcReinoFactory implements ReinoFactory {

	@Override
	public Exercito createExercito() {
		return new OrcExercito();
	}

	@Override
	public Castelo createCastelo() {
		return new OrcCastelo();
	}

	@Override
	public Rei createRei() {
		return new OrcRei();
	}

}
