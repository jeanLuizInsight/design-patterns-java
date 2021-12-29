package structural.composite;

import java.util.logging.Logger;

/**
 * O padr�o Composite � um padr�o de design de particionamento. O padr�o Composite descreve que um
 * grupo de objetos deve ser tratado da mesma maneira que uma �nica inst�ncia de um objeto. A inten��o
 * de um composite � "compor" objetos em estruturas de �rvore para representar hierarquias parte-todo.
 * Implementar o padr�o Composite permite que os clientes tratem objetos e composi��es individuais
 * uniformemente.
 * Neste exemplo, temos frases compostas por palavras compostas por letras. Todos os objetos
 * podem ser tratados pela mesma interface ({ @link LetraComposite}).
 * @author <a href="mailto:jean.zanatta@unoesc.edu.br">Jean Luiz Zanatta</a>
 * @since 29/12/2021
 */
public class App {

	private static final Logger LOGGER = Logger.getLogger(App.class.getName());

	public static void main(final String[] args) {

		final Mensageiro mensageiro = new Mensageiro();
		App.LOGGER.info("Mensagem para os orcs: ");
		mensageiro.mensagemParaOrcs().imprimir();
		App.LOGGER.info("Mensagem para os elfos: ");
		mensageiro.mensagemParaElfos().imprimir();

	}
}
