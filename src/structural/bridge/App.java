package structural.bridge;

import java.util.logging.Logger;

/**
 * Composição sobre herança.
 * O padrão Bridge também pode ser pensado como duas camadas de abstração.
 * Com o Bridge, você pode desacoplar uma abstração de sua implementação para que os dois
 * possam variar de forma independente.
 * No padrão Bridge tanto a abstração ({@link Arma}) quanto a implementação ({@link Encantamento})
 * têm suas próprias hierarquias de classe.
 * A interface das implementações pode ser alterada sem afetar os clientes.
 * Neste exemplo temos duas hierarquias de classes.
 * Uma de armas e outra de encantamentos.
 * Podemos facilmente combinar qualquer arma com qualquer encantamento usando composição em vez de
 * criar hierarquia de classe profunda.
 * @author <a href="mailto:jean.zanatta@unoesc.edu.br">Jean Luiz Zanatta</a>
 * @since 14/01/2022
 */
public class App {

	private static final Logger LOGGER = Logger.getLogger(App.class.getName());

	public static void main(final String[] args) {

		App.LOGGER.info("O cavaleiro recebe uma espada encantada.");
		final Arma espadaEncantada = new Espada(new EncantamentoEngolidorDeAlmas());
		espadaEncantada.manejar();
		espadaEncantada.balancar();
		espadaEncantada.desarmar();

		App.LOGGER.info("A valquíria recebe um martelo encantado.");
		final Arma marteloEncantado = new Martelo(new EncantamentoVoador());
		marteloEncantado.manejar();
		marteloEncantado.balancar();
		marteloEncantado.desarmar();
	}
}
