package creational.builder;

import java.util.logging.Logger;

/**
 * Classe de execu��oo das implementa��es do padr�o Builder.
 * @author <a href="mailto:jean.zanatta@unoesc.edu.br">Jean Luiz Zanatta</a>
 * @since 07/12/2021
 */
public class App {

	private static final Logger LOGGER = Logger.getLogger(App.class.getName());

	public static void main(final String[] args) {

		/**
		 * Instanciando tr�s tipos de her�is com suas caracter�sticas
		 */

		final Heroi mago = new Heroi.Builder("Nicholas Flamel", Profissao.MAGO)
				.comCorDoCabelo(CorDoCabelo.BRANCO)
				.comArma(Arma.ARCO)
				.build();
		LOGGER.info(mago.toString());

		final Heroi guerreiro = new Heroi.Builder("Leonidas", Profissao.GUERREIRO)
				.comCorDoCabelo(CorDoCabelo.MARROM)
				.comArmadura(Armadura.METAL)
				.comArma(Arma.ESPADA)
				.build();
		LOGGER.info(guerreiro.toString());

		final Heroi ladrao = new Heroi.Builder("Billy the Kid", Profissao.LADRAO)
				.comArma(Arma.PUNHAL)
				.build();
		LOGGER.info(ladrao.toString());
	}
}
