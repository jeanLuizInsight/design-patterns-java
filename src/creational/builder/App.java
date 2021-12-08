package creational.builder;

/**
 * Classe de execuçãoo das implementações do padrão Builder.
 * @author <a href="mailto:jean.zanatta@unoesc.edu.br">Jean Luiz Zanatta</a>
 * @since 07/12/2021
 */
public class App {

	public static void main(final String[] args) {

		/**
		 * Instanciando três tipos de heróis com suas características
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
