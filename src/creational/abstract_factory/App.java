package creational.abstract_factory;

import java.util.logging.Logger;

import creational.abstract_factory.Reino.CriadorDeFactory.TipoDeReino;

/**
 * Classe cliente de execu��o
 *
 * O padr�o Abstract Factory fornece uma maneira de encapsular um grupo de f�bricas individuais que
 * t�m um tema comum sem especificar suas classes concretas.
 * Em uso normal, o cliente software cria uma implementa��o concreta da f�brica abstrata e, em seguida,
 * usa a interface gen�rica da f�brica para criar os objetos concretos que fazem parte do tema.
 * O cliente n�o sabe (ou se importa) com quais objetos concretos obt�m de cada uma dessas f�bricas internas,
 * j� que usa apenas as interfaces gen�ricas de seus produtos.
 * Este padr�o separa os detalhes da implementa��o de um conjunto de objetos a partir de seu uso geral
 * e depende da composi��o do objeto, como a cria��o de objeto � implementada em m�todos expostos na interface
 * de f�brica.
 *
 * A ess�ncia do padr�o Abstract Factory � uma interface de f�brica ({ @link ReinoFactory})
 * e suas implementa��es ({ @link ElfReinoFactory}, { @link OrcReinoFactory}).
 * O exemplo usa ambas as implementa��es concretas para criar um rei, um castelo e um ex�rcito.
 *
 * 
 * @author <a href="mailto:jean.zanatta@unoesc.edu.br">Jean Luiz Zanatta</a>
 * @since 21/12/2021
 */
public class App implements Runnable {

	private static final Logger LOGGER = Logger.getLogger(App.class.getName());

	private final Reino reino = new Reino();

	/**
	 * M�todo respons�vel por criar um reino de acordo com seu tipo.
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
		LOGGER.info("Reino �lfico.");
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
