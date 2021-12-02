package creational.singleton;

/**
 * O idioma singleton Initialize-on-demand-holder � uma maneira segura de criar um objeto singleton inicializado lazy em Java.
 * A t�cnica � a mais pregui�osa poss�vel e funciona em todas as vers�es conhecidas do Java. Leva
 * vantagem de garantia de linguagem sobre a inicializa��o de classe e, portanto, funcionar� corretamente
 * em todos os compiladores e m�quinas virtuais compat�veis com Java.
 * A classe interna n�o � referenciada anteriormente, portanto, n�o carregada anteriormente pelo class loader
 * do que no momento em que getInstance() � chamado. Assim, esta solu��o � thread-safe sem requerer constru��es de linguagem especiais (ou seja,
 * vol�til ou sincronizado).
 * @author <a href="mailto:jean.zanatta@unoesc.edu.br">Jean Luiz Zanatta</a>
 * @since 02/12/2021
 */
public final class InitializingOnDemandHolderIdiomSingleton {

	private InitializingOnDemandHolderIdiomSingleton() {}

	/**
	 * Inst�ncia Singleton.
	 * @return Singleton instance
	 */
	public static InitializingOnDemandHolderIdiomSingleton getInstance() {
		return HelperHolder.INSTANCE;
	}

	/**
	 * Fornece a inst�ncia Singleton lazy-loaded (carregada lentamente)
	 */
	private static class HelperHolder {
		private static final InitializingOnDemandHolderIdiomSingleton INSTANCE = new InitializingOnDemandHolderIdiomSingleton();
	}
}
