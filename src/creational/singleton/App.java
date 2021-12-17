package creational.singleton;

import java.util.logging.Logger;

/**
 * Classe de execu��o das implementa��es do padr�o Singleton.
 * @author <a href="mailto:jean.zanatta@unoesc.edu.br">Jean Luiz Zanatta</a>
 * @since 02/12/2021
 */
public class App {

	private static final Logger LOGGER = Logger.getLogger(App.class.getName());

	public static void main(final String[] args) {

		/**
		 * Singleton inicializado avidamente
		 * Inicializando a inst�ncia avidamente em {@link Singleton}. Inicializa��o r�pida implica que � thread-safe. Se puder abrir m�o do controle
		 * no momento da instancia��o essa implementa��o servir�.
		 */
		final Singleton sg1 = Singleton.getInstance();
		final Singleton sg2 = Singleton.getInstance();
		LOGGER.info("sg1 = " + sg1);
		LOGGER.info("sg2 = " + sg2);

		/**
		 * Enum singleton
		 * Inicializando a inst�ncia avidamente com Enum em {@link EnumSingleton}. Simples, mas precisamos estar atentos as desvantagens, como
		 * desconpromisso
		 * com a estrat�gia de implementa��o estendendo a classe Enum, serializa��o erestri��es � codifica��o.
		 */
		final EnumSingleton enumSg1 = EnumSingleton.INSTANCE;
		final EnumSingleton enumSg2 = EnumSingleton.INSTANCE;
		LOGGER.info("enumSg1 = " + enumSg1);
		LOGGER.info("enumSg2 = " + enumSg2);

		/**
		 * Singleton inicializado lentamente
		 * Implementa��o Singleton inicializada on demand. Desvantagem de ter o acesso muito lento, pois todo m�todo de acesso � sincronizado.
		 */
		final ThreadSafeLazyLoadedSingleton threadSafeSg1 = ThreadSafeLazyLoadedSingleton.getInstance();
		final ThreadSafeLazyLoadedSingleton threadSafeSg2 = ThreadSafeLazyLoadedSingleton.getInstance();
		LOGGER.info("threadSafeSg1 = " + threadSafeSg1);
		LOGGER.info("threadSafeSg2 = " + threadSafeSg2);

		/**
		 * Singleton inicializado lentgamente com bloqueio duplamente verificado
		 * � um pouco mais r�pido que {@link ThreadSafeLazyLoadedSingleton} uma vez que n�o sincroniza todo o m�todo de acesso, mas apenas o m�todo
		 * interno em condi��es espec�ficas
		 */
		final ThreadSafeDoubleCheckLockingSingleton dcl1 = ThreadSafeDoubleCheckLockingSingleton.getInstance();
		final ThreadSafeDoubleCheckLockingSingleton dcl2 = ThreadSafeDoubleCheckLockingSingleton.getInstance();
		LOGGER.info("dcl1 = " + dcl1);
		LOGGER.info("dcl2 = " + dcl2);

		/**
		 * Inicializar no idioma Initialize-on-demand-holder
		 * Implementa��o Singleton com inicializa��o lenta e thread-safe {@link InitializingOnDemandHolderIdiomSingleton}
		 * Requer Java 8 para funcionar
		 */
		final InitializingOnDemandHolderIdiomSingleton demandHolderIdiom = InitializingOnDemandHolderIdiomSingleton.getInstance();
		InitializingOnDemandHolderIdiomSingleton.getInstance();
		LOGGER.info("demandHolderIdiom = " + demandHolderIdiom);
		LOGGER.info("demandHolderIdiom2 = " + demandHolderIdiom);

	}
}
