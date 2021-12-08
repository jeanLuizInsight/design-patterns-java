package creational.builder;

/**
 * Classe de execu��oo das implementa��es do padr�o Builder.
 * @author <a href="mailto:jean.zanatta@unoesc.edu.br">Jean Luiz Zanatta</a>
 * @since 07/12/2021
 */
public class App {

	public static void main(final String[] args) {

		/**
		 * Instanciando tr�s tipos de her�is com suas caracter�sticas
		 */

		final Heroi mago = new Heroi.Builder("Nicholas Flamel", Profissao.MAGO)
				.comCorDoCabelo(CorDoCabelo.BRANCO)
				.comArma(Arma.ARCO)
				.build();
		System.out.println(mago);

		final Heroi guerreiro = new Heroi.Builder("Leonidas", Profissao.GUERREIRO)
				.comCorDoCabelo(CorDoCabelo.MARROM)
				.comArmadura(Armadura.METAL)
				.comArma(Arma.ESPADA)
				.build();
		System.out.println(guerreiro);

		final Heroi ladrao = new Heroi.Builder("Billy the Kid", Profissao.LADRAO)
				.comArma(Arma.PUNHAL)
				.build();
		System.out.println(ladrao);
	}
}
