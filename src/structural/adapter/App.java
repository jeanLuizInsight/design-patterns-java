package structural.adapter;

/**
 * @author <a href="mailto:jean.zanatta@unoesc.edu.br">Jean Luiz Zanatta</a>
 * @since 07/01/2022
 */
public class App {

	public static void main(final String[] args) {
		final Capitao capitao = new Capitao(new BarcoDePescaAdapter());
		capitao.remar();
	}
}
