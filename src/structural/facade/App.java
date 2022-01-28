package structural.facade;

/**
 * O padr�o de projeto Facade � frequentemente usado quando um sistema � muito complexo ou dif�cil de entender
 * porque o sistema possui um grande n�mero de classes interdependentes ou seu c�digo fonte �
 * indispon�vel.
 * Esse padr�o oculta as complexidades do sistema maior e fornece uma interface com o cliente.
 * Normalmente envolve uma �nica classe wrapper que cont�m um conjunto de m�todos exigidos pelo cliente.
 * Esses membros(m�todos) acessam o sistema em nome do cliente de fachada e oculta os detalhes de implementa��o.
 *
 * Neste exemplo, a Facade � ({@link MinaDeOuroFacade}) e fornece uma interface para o subsistema mina de ouro.
 *
 * @author <a href="mailto:jean.zanatta@unoesc.edu.br">Jean Luiz Zanatta</a>
 * @since 28/01/2022
 */
public class App {

	public static void main(String[] args) {

		MinaDeOuroFacade facade = new MinaDeOuroFacade();
		facade.iniciarNovoDia();
		facade.cavarOuro();
		facade.finalizarDia();
	}
}
