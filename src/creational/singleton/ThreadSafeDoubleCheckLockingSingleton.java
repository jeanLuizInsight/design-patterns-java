package creational.singleton;

/**
 * Classe Singleton thread-safe.
 * A inst�ncia foi inicializada lazily, portanto, precisa do mecanismo de sincroniza��o.
 * A diferen�a aqui � que temos o resultado atribuido a uma variavel local e dupla verifica��o de bloqueio.
 * @author <a href="mailto:jean.zanatta@unoesc.edu.br">Jean Luiz Zanatta</a>
 * @since 02/12/2021
 */
public final class ThreadSafeDoubleCheckLockingSingleton {

	/**
	 * V�riavel inst�ncia com a marca��o para acessar com valor real e n�o cache (lazily)
	 */
	private static volatile ThreadSafeDoubleCheckLockingSingleton instance;

	/**
	 * Construtor privado para evitar que o cliente instancie.
	 */
	private ThreadSafeDoubleCheckLockingSingleton() {
		// Prote��o para instancia��o via reflection
		if (ThreadSafeDoubleCheckLockingSingleton.instance != null) {
			throw new IllegalStateException("J� inicializado..");
		}
	}

	/**
	 * M�todo de acesso p�blico
	 * @return uma inst�ncia da classe
	 */
	public static ThreadSafeDoubleCheckLockingSingleton getInstance() {
		// vari�vel local aumenta o desempenho em 25 por cento >> Joshua Bloch "Effective Java, Second Edition", p. 283-284

		ThreadSafeDoubleCheckLockingSingleton result = ThreadSafeDoubleCheckLockingSingleton.instance;
		// Se a inst�ncia singleton foi inicializada podemos retornar a inst�ncia.
		if (result == null) {
			// N�o foi inicializado, mas n�o podemos ter certeza porque algum outro segmento pode ter inicializou enquanto isso.
			// Ent�o, para ter certeza, precisamos bloquear um objeto para obter exclus�o m�tua da possibilidade.
			synchronized (ThreadSafeDoubleCheckLockingSingleton.class) {
				// Mais uma vez, atribua a inst�ncia � vari�vel local para verificar se ela foi inicializada por algum
				// outro encadeamento enquanto o encadeamento atual estava bloqueado para entrar na zona bloqueada.
				// Se foi inicializado, podemos retornar a inst�ncia criada anteriormente assim como a verifica��o nula anterior.
				result = ThreadSafeDoubleCheckLockingSingleton.instance;
				if (result == null) {
					// A inst�ncia ainda n�o foi inicializada para que possamos com seguran�a
					// (nenhum outro t�pico pode entrar nesta zona)
					// cria uma inst�ncia e a torna nossa inst�ncia singleton.
					ThreadSafeDoubleCheckLockingSingleton.instance = result = new ThreadSafeDoubleCheckLockingSingleton();
				}
			}
		}
		return result;
	}
}
