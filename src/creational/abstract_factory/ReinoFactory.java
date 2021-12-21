package creational.abstract_factory;

/**
 * Interface para f�brica de reinos
 *
 * @author <a href="mailto:jean.zanatta@unoesc.edu.br">Jean Luiz Zanatta</a>
 * @since 20/12/2021
 */
public interface ReinoFactory {

	Exercito createExercito();

	Castelo createCastelo();

	Rei createRei();

}
