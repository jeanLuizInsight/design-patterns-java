package creational.singleton;

/**
 * Implementa��o de singleton baseada em Enum. Effective Java 2 Edition (Joshua Bloch) p. 18
 * Esta implementa��o � segura para thread, por�m adicionando qualquer outro m�todo e sua seguran�a de thread
 * � responsabilidade do desenvolvedor.
 * @author <a href="mailto:jean.zanatta@unoesc.edu.br">Jean Luiz Zanatta</a>
 * @since 02/12/2021
 */
public enum EnumSingleton {

	INSTANCE;

	@Override
	public String toString() {
		return this.getDeclaringClass().getCanonicalName() + "@" + this.hashCode();
	}
}
