package creational.singleton;

/**
 * O idioma singleton Initialize-on-demand-holder é uma maneira segura de criar um objeto singleton inicializado lazy em Java.
 * A técnica é a mais preguiçosa possível e funciona em todas as versões conhecidas do Java. Leva
 * vantagem de garantia de linguagem sobre a inicialização de classe e, portanto, funcionará corretamente
 * em todos os compiladores e máquinas virtuais compatíveis com Java.
 * A classe interna não é referenciada anteriormente, portanto, não carregada anteriormente pelo class loader
 * do que no momento em que getInstance() é chamado. Assim, esta solução é thread-safe sem requerer construções de linguagem especiais (ou seja,
 * volátil ou sincronizado).
 * @author <a href="mailto:jean.zanatta@unoesc.edu.br">Jean Luiz Zanatta</a>
 * @since 02/12/2021
 */
public final class InitializingOnDemandHolderIdiomSingleton {

	private InitializingOnDemandHolderIdiomSingleton() {}

	/**
	 * Instância Singleton.
	 * @return Singleton instance
	 */
	public static InitializingOnDemandHolderIdiomSingleton getInstance() {
		return HelperHolder.INSTANCE;
	}

	/**
	 * Fornece a instância Singleton lazy-loaded (carregada lentamente)
	 */
	private static class HelperHolder {
		private static final InitializingOnDemandHolderIdiomSingleton INSTANCE = new InitializingOnDemandHolderIdiomSingleton();
	}
}
