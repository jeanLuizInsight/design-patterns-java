package creational.singleton;

/**
 * Classe Singleton
 * A instância estática inicializada rapidamente garante o
 * @author <a href="mailto:jean.zanatta@unoesc.edu.br">Jean Luiz Zanatta</a>
 * @since 02/12/2021
 */
public final class Singleton {

	/**
	 * Variável estática com instância da classe
	 */
	private static final Singleton INSTANCE = new Singleton();

	/**
	 * Construtor privado para que ninguem possa instanciá-la
	 */
	private Singleton() {}

	/**
	 * To be called by user to obtain instance of the class.
	 * @return instância de singleton.
	 */
	public static Singleton getInstance() {
		return Singleton.INSTANCE;
	}
}
