package creational.singleton;

/**
 * Classe Singleton thread-safe.
 * A inst�ncia foi inicializada lazily, portanto, precisa do mecanismo de sincroniza��o.
 * @author <a href="mailto:jean.zanatta@unoesc.edu.br">Jean Luiz Zanatta</a>
 * @since 02/12/2021
 */
public class ThreadSafeLazyLoadedSingleton {

	/**
	 * V�riavel inst�ncia com a marca��o para acessar com valor real e n�o cache (lazily)
	 */
	private static volatile ThreadSafeLazyLoadedSingleton instance;

	/**
	 * Construtor privado para evitar que o cliente instancie.
	 */
	private ThreadSafeLazyLoadedSingleton() {
		// Prote��o para instancia��o via reflection
		if (ThreadSafeLazyLoadedSingleton.instance != null) {
			throw new IllegalStateException("J� inicializado..");
		}
	}

	/**
	 * A inst�ncia n�o � criada at� que o m�todo seja chamado pela primeira vez.
	 */
	public static synchronized ThreadSafeLazyLoadedSingleton getInstance() {
		if (ThreadSafeLazyLoadedSingleton.instance == null) {
			synchronized (ThreadSafeLazyLoadedSingleton.class) {
				if (ThreadSafeLazyLoadedSingleton.instance == null) {
					ThreadSafeLazyLoadedSingleton.instance = new ThreadSafeLazyLoadedSingleton();
				}
			}
		}
		return ThreadSafeLazyLoadedSingleton.instance;
	}
}
