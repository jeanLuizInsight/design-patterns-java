package creational.singleton;

/**
 * Classe Singleton
 * A inst�ncia est�tica inicializada rapidamente garante o
 * @author <a href="mailto:jean.zanatta@unoesc.edu.br">Jean Luiz Zanatta</a>
 * @since 02/12/2021
 */
public final class Singleton {

	/**
	 * Vari�vel est�tica com inst�ncia da classe
	 */
	private static final Singleton INSTANCE = new Singleton();

	/**
	 * Construtor privado para que ninguem possa instanci�-la
	 */
	private Singleton() {}

	/**
	 * To be called by user to obtain instance of the class.
	 * @return inst�ncia de singleton.
	 */
	public static Singleton getInstance() {
		return Singleton.INSTANCE;
	}
}
