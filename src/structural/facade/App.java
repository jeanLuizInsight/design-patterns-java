package structural.facade;

/**
 * O padrão de projeto Facade é frequentemente usado quando um sistema é muito complexo ou difícil de entender
 * porque o sistema possui um grande número de classes interdependentes ou seu código fonte é
 * indisponível.
 * Esse padrão oculta as complexidades do sistema maior e fornece uma interface com o cliente.
 * Normalmente envolve uma única classe wrapper que contém um conjunto de métodos exigidos pelo cliente.
 * Esses membros(métodos) acessam o sistema em nome do cliente de fachada e oculta os detalhes de implementação.
 *
 * Neste exemplo, a Facade é ({@link MinaDeOuroFacade}) e fornece uma interface para o subsistema mina de ouro.
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
