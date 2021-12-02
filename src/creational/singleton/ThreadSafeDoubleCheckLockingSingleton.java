package creational.singleton;

/**
 * Classe Singleton thread-safe.
 * A instância foi inicializada lazily, portanto, precisa do mecanismo de sincronização.
 * A diferença aqui é que temos o resultado atribuido a uma variavel local e dupla verificação de bloqueio.
 * @author <a href="mailto:jean.zanatta@unoesc.edu.br">Jean Luiz Zanatta</a>
 * @since 02/12/2021
 */
public final class ThreadSafeDoubleCheckLockingSingleton {

	/**
	 * Váriavel instância com a marcação para acessar com valor real e não cache (lazily)
	 */
	private static volatile ThreadSafeDoubleCheckLockingSingleton instance;

	/**
	 * Construtor privado para evitar que o cliente instancie.
	 */
	private ThreadSafeDoubleCheckLockingSingleton() {
		// Proteção para instanciação via reflection
		if (ThreadSafeDoubleCheckLockingSingleton.instance != null) {
			throw new IllegalStateException("Já inicializado..");
		}
	}

	/**
	 * Método de acesso público
	 * @return uma instância da classe
	 */
	public static ThreadSafeDoubleCheckLockingSingleton getInstance() {
		// variável local aumenta o desempenho em 25 por cento >> Joshua Bloch "Effective Java, Second Edition", p. 283-284

		ThreadSafeDoubleCheckLockingSingleton result = ThreadSafeDoubleCheckLockingSingleton.instance;
		// Se a instância singleton foi inicializada podemos retornar a instância.
		if (result == null) {
			// Não foi inicializado, mas não podemos ter certeza porque algum outro segmento pode ter inicializou enquanto isso.
			// Então, para ter certeza, precisamos bloquear um objeto para obter exclusão mútua da possibilidade.
			synchronized (ThreadSafeDoubleCheckLockingSingleton.class) {
				// Mais uma vez, atribua a instância à variável local para verificar se ela foi inicializada por algum
				// outro encadeamento enquanto o encadeamento atual estava bloqueado para entrar na zona bloqueada.
				// Se foi inicializado, podemos retornar a instância criada anteriormente assim como a verificação nula anterior.
				result = ThreadSafeDoubleCheckLockingSingleton.instance;
				if (result == null) {
					// A instância ainda não foi inicializada para que possamos com segurança
					// (nenhum outro tópico pode entrar nesta zona)
					// cria uma instância e a torna nossa instância singleton.
					ThreadSafeDoubleCheckLockingSingleton.instance = result = new ThreadSafeDoubleCheckLockingSingleton();
				}
			}
		}
		return result;
	}
}
