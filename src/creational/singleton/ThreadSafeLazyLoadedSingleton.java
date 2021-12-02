package creational.singleton;

/**
 * Classe Singleton thread-safe.
 * A instância foi inicializada lazily, portanto, precisa do mecanismo de sincronização.
 * @author <a href="mailto:jean.zanatta@unoesc.edu.br">Jean Luiz Zanatta</a>
 * @since 02/12/2021
 */
public class ThreadSafeLazyLoadedSingleton {

	/**
	 * Váriavel instância com a marcação para acessar com valor real e não cache (lazily)
	 */
	private static volatile ThreadSafeLazyLoadedSingleton instance;

	/**
	 * Construtor privado para evitar que o cliente instancie.
	 */
	private ThreadSafeLazyLoadedSingleton() {
		// Proteção para instanciação via reflection
		if (ThreadSafeLazyLoadedSingleton.instance != null) {
			throw new IllegalStateException("Já inicializado..");
		}
	}

	/**
	 * A instância não é criada até que o método seja chamado pela primeira vez.
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
