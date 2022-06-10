package creational.abstract_factory;

import java.util.logging.Logger;

import creational.abstract_factory.Reino.CriadorDeFactory.TipoDeReino;

/**
 * Classe cliente de execução
 *
 * O padrão Abstract Factory fornece uma maneira de encapsular um grupo de fábricas individuais que
 * têm um tema comum sem especificar suas classes concretas.
 * Em uso normal, o cliente software cria uma implementação concreta da fábrica abstrata e, em seguida,
 * usa a interface genérica da fábrica para criar os objetos concretos que fazem parte do tema.
 * O cliente não sabe (ou se importa) com quais objetos concretos obtém de cada uma dessas fábricas internas,
 * já que usa apenas as interfaces genéricas de seus produtos.
 * Este padrão separa os detalhes da implementação de um conjunto de objetos a partir de seu uso geral
 * e depende da composição do objeto, como a criação de objeto é implementada em métodos expostos na interface
 * de fábrica.
 *
 * A essência do padrão Abstract Factory é uma interface de fábrica ({ @link ReinoFactory})
 * e suas implementações ({ @link ElfReinoFactory}, { @link OrcReinoFactory}).
 * O exemplo usa ambas as implementações concretas para criar um rei, um castelo e um exército.
 *
 * 
 * @author <a href="mailto:jean.zanatta@unoesc.edu.br">Jean Luiz Zanatta</a>
 * @since 21/12/2021
 */
public class App implements Runnable {

	private static final Logger LOGGER = Logger.getLogger(App.class.getName());

	private final Reino reino = new Reino();

	/**
	 * Método responsável por criar um reino de acordo com seu tipo.
	 * @param factory
	 */
	public void createReino(final TipoDeReino factory) {
		final ReinoFactory reinoFactory = Reino.CriadorDeFactory.createFactory(factory);
		reino.setCastelo(reinoFactory.createCastelo());
		reino.setRei(reinoFactory.createRei());
		reino.setExercito(reinoFactory.createExercito());
	}

	/**
	 * Ponto de entrada do programa.
	 * @param args
	 */
	public static void main(String[] args) {
		App app = new App();
		app.run();
	}

	@Override
	public void run() {
		LOGGER.info("Reino élfico.");
		createReino(TipoDeReino.ELF);
		LOGGER.info(reino.getCastelo().getDescricao());
		LOGGER.info(reino.getRei().getDescricao());
		LOGGER.info(reino.getRei().getDescricao());

		LOGGER.info("Reino orc.");
		createReino(TipoDeReino.ORC);
		LOGGER.info(reino.getCastelo().getDescricao());
		LOGGER.info(reino.getRei().getDescricao());
		LOGGER.info(reino.getRei().getDescricao());
	}

}
