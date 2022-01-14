package structural.bridge;

import java.util.logging.Logger;

/**
 * Composi��o sobre heran�a.
 * O padr�o Bridge tamb�m pode ser pensado como duas camadas de abstra��o.
 * Com o Bridge, voc� pode desacoplar uma abstra��o de sua implementa��o para que os dois
 * possam variar de forma independente.
 * No padr�o Bridge tanto a abstra��o ({@link Arma}) quanto a implementa��o ({@link Encantamento})
 * t�m suas pr�prias hierarquias de classe.
 * A interface das implementa��es pode ser alterada sem afetar os clientes.
 * Neste exemplo temos duas hierarquias de classes.
 * Uma de armas e outra de encantamentos.
 * Podemos facilmente combinar qualquer arma com qualquer encantamento usando composi��o em vez de
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

		App.LOGGER.info("A valqu�ria recebe um martelo encantado.");
		final Arma marteloEncantado = new Martelo(new EncantamentoVoador());
		marteloEncantado.manejar();
		marteloEncantado.balancar();
		marteloEncantado.desarmar();
	}
}
