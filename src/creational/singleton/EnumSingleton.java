package creational.singleton;

/**
 * Implementação de singleton baseada em Enum. Effective Java 2 Edition (Joshua Bloch) p. 18
 * Esta implementação é segura para thread, porém adicionando qualquer outro método e sua segurança de thread
 * é responsabilidade do desenvolvedor.
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
