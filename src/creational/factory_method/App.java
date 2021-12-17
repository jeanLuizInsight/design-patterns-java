package creational.factory_method;

import java.util.logging.Logger;

/**
 * Classe de execução das implementações do padrão Factory Method.
 * @author <a href="mailto:jean.zanatta@unoesc.edu.br">Jean Luiz Zanatta</a>
 * @since 16/12/2021
 */
public class App {

	private static final Logger LOGGER = Logger.getLogger(App.class.getName());

	/**
	 * O factory method é um padrão de design criativo que usa métodos de fábrica para lidar com o
	 * problema de criar objetos sem especificar a classe exata de objeto que será criado.
	 * Isso é feito criando objetos por meio da chamada de um factory method especificado em uma interface
	 * e implementado por classes filhas, ou implementado em uma classe base e opcionalmente substituído por
	 * classes derivadas - em vez de chamar um construtor.
	 *
	 * Neste exemplo de factory method, temos uma interface ({ @link Ferreiro})
	 * com um método para criação de objetos ({ @link Ferreiro # fabricarArma}).
	 * As subclasses concretas ({ @link OrcFerreiro}, { @link ElfFerreiro}),
	 * que implementam o método para produzir objetos de seu critério.
	 * @param args
	 */
	public static void main(final String[] args) {

		Ferreiro ferreiro = new OrcFerreiro();
	    Arma arma = ferreiro.fabricarArma(TipoDeArma.ESPADA);
	    LOGGER.info(ferreiro + " fabricou " + arma);
	    arma = ferreiro.fabricarArma(TipoDeArma.MACHADO);
	    LOGGER.info(ferreiro + " fabricou " + arma);

	    ferreiro = new ElfFerreiro();
	    arma = ferreiro.fabricarArma(TipoDeArma.LANCA);
	    LOGGER.info(ferreiro + " fabricou " + arma);
	    arma = ferreiro.fabricarArma(TipoDeArma.INDEFINIDO);
	    LOGGER.info(ferreiro + " fabricou " + arma);
	}
}
