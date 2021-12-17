package creational.singleton;

import java.util.logging.Logger;

/**
 * Classe de execução das implementações do padrão Singleton.
 * @author <a href="mailto:jean.zanatta@unoesc.edu.br">Jean Luiz Zanatta</a>
 * @since 02/12/2021
 */
public class App {

	private static final Logger LOGGER = Logger.getLogger(App.class.getName());

	public static void main(final String[] args) {

		/**
		 * Singleton inicializado avidamente
		 * Inicializando a instância avidamente em {@link Singleton}. Inicialização rápida implica que é thread-safe. Se puder abrir mão do controle
		 * no momento da instanciação essa implementação servirá.
		 */
		final Singleton sg1 = Singleton.getInstance();
		final Singleton sg2 = Singleton.getInstance();
		LOGGER.info("sg1 = " + sg1);
		LOGGER.info("sg2 = " + sg2);

		/**
		 * Enum singleton
		 * Inicializando a instância avidamente com Enum em {@link EnumSingleton}. Simples, mas precisamos estar atentos as desvantagens, como
		 * desconpromisso
		 * com a estratégia de implementação estendendo a classe Enum, serialização erestrições à codificação.
		 */
		final EnumSingleton enumSg1 = EnumSingleton.INSTANCE;
		final EnumSingleton enumSg2 = EnumSingleton.INSTANCE;
		LOGGER.info("enumSg1 = " + enumSg1);
		LOGGER.info("enumSg2 = " + enumSg2);

		/**
		 * Singleton inicializado lentamente
		 * Implementação Singleton inicializada on demand. Desvantagem de ter o acesso muito lento, pois todo método de acesso é sincronizado.
		 */
		final ThreadSafeLazyLoadedSingleton threadSafeSg1 = ThreadSafeLazyLoadedSingleton.getInstance();
		final ThreadSafeLazyLoadedSingleton threadSafeSg2 = ThreadSafeLazyLoadedSingleton.getInstance();
		LOGGER.info("threadSafeSg1 = " + threadSafeSg1);
		LOGGER.info("threadSafeSg2 = " + threadSafeSg2);

		/**
		 * Singleton inicializado lentgamente com bloqueio duplamente verificado
		 * É um pouco mais rápido que {@link ThreadSafeLazyLoadedSingleton} uma vez que não sincroniza todo o método de acesso, mas apenas o método
		 * interno em condições específicas
		 */
		final ThreadSafeDoubleCheckLockingSingleton dcl1 = ThreadSafeDoubleCheckLockingSingleton.getInstance();
		final ThreadSafeDoubleCheckLockingSingleton dcl2 = ThreadSafeDoubleCheckLockingSingleton.getInstance();
		LOGGER.info("dcl1 = " + dcl1);
		LOGGER.info("dcl2 = " + dcl2);

		/**
		 * Inicializar no idioma Initialize-on-demand-holder
		 * Implementação Singleton com inicialização lenta e thread-safe {@link InitializingOnDemandHolderIdiomSingleton}
		 * Requer Java 8 para funcionar
		 */
		final InitializingOnDemandHolderIdiomSingleton demandHolderIdiom = InitializingOnDemandHolderIdiomSingleton.getInstance();
		InitializingOnDemandHolderIdiomSingleton.getInstance();
		LOGGER.info("demandHolderIdiom = " + demandHolderIdiom);
		LOGGER.info("demandHolderIdiom2 = " + demandHolderIdiom);

	}
}
