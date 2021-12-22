package creational.abstract_factory;

/**
 * Classe concreta para fábrica do reino de elfos.
 * @author <a href="mailto:jean.zanatta@unoesc.edu.br">Jean Luiz Zanatta</a>
 * @since 21/12/2021
 */
public class ElfReinoFactory implements ReinoFactory {

	@Override
	public Exercito createExercito() {
		return new ElfExercito();
	}

	@Override
	public Castelo createCastelo() {
		return new ElfCastelo();
	}

	@Override
	public Rei createRei() {
		return new ElfRei();
	}

}
