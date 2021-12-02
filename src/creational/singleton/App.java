package creational.singleton;

/**
 * Classe de execução das implementações do padrão Singleton.
 * @author <a href="mailto:jean.zanatta@unoesc.edu.br">Jean Luiz Zanatta</a>
 * @since 02/12/2021
 */
public class App {

	public static void main(final String[] args) {

		/**
		 * Singleton inicializado avidamente
		 * Inicializando a instância avidamente em {@link Singleton}. Inicialização rápida implica que é thread-safe. Se puder abrir mão do controle
		 * no momento da instanciação essa implementação servirá.
		 */
		final Singleton sg1 = Singleton.getInstance();
		final Singleton sg2 = Singleton.getInstance();
		System.out.println("sg1 = " + sg1);
		System.out.println("sg2 = " + sg2);

		/**
		 * Enum singleton
		 * Inicializando a instância avidamente com Enum em {@link EnumSingleton}. Simples, mas precisamos estar atentos as desvantagens, como
		 * desconpromisso
		 * com a estratégia de implementação estendendo a classe Enum, serialização erestrições à codificação.
		 */
		final EnumSingleton enumSg1 = EnumSingleton.INSTANCE;
		final EnumSingleton enumSg2 = EnumSingleton.INSTANCE;
		System.out.println("enumSg1 = " + enumSg1);
		System.out.println("enumSg2 = " + enumSg2);

		/**
		 * Singleton inicializado lentamente
		 * Implementação Singleton inicializada on demand. Desvantagem de ter o acesso muito lento, pois todo método de acesso é sincronizado.
		 */
		final ThreadSafeLazyLoadedSingleton threadSafeSg1 = ThreadSafeLazyLoadedSingleton.getInstance();
		final ThreadSafeLazyLoadedSingleton threadSafeSg2 = ThreadSafeLazyLoadedSingleton.getInstance();
		System.out.println("threadSafeSg1 = " + threadSafeSg1);
		System.out.println("threadSafeSg2 = " + threadSafeSg2);

		/**
		 * Singleton inicializado lentgamente com bloqueio duplamente verificado
		 * É um pouco mais rápido que {@link ThreadSafeLazyLoadedSingleton} uma vez que não sincroniza todo o método de acesso, mas apenas o método
		 * interno em condições específicas
		 */
		final ThreadSafeDoubleCheckLockingSingleton dcl1 = ThreadSafeDoubleCheckLockingSingleton.getInstance();
		final ThreadSafeDoubleCheckLockingSingleton dcl2 = ThreadSafeDoubleCheckLockingSingleton.getInstance();
		System.out.println("dcl1 = " + dcl1);
		System.out.println("dcl2 = " + dcl2);

		/**
		 * Inicializar no idioma Initialize-on-demand-holder
		 * Implementação Singleton com inicialização lenta e thread-safe {@link InitializingOnDemandHolderIdiomSingleton}
		 * Requer Java 8 para funcionar
		 */
		final InitializingOnDemandHolderIdiomSingleton demandHolderIdiom = InitializingOnDemandHolderIdiomSingleton.getInstance();
		final InitializingOnDemandHolderIdiomSingleton demandHolderIdiom2 = InitializingOnDemandHolderIdiomSingleton.getInstance();
		System.out.println("demandHolderIdiom = " + demandHolderIdiom);
		System.out.println("demandHolderIdiom2 = " + demandHolderIdiom);

	}
}
