package creational.prototype;

/**
 * Classe de execuçãoo das implementações do padrão Prototype.
 *
 * @author <a href="mailto:jean.zanatta@unoesc.edu.br">Jean Luiz Zanatta</a>
 * @since 14/12/2021
 */
public class App {

	public static void main(final String[] args) {

		/**
		 * O padrão Prototype é um padrão de design criativo no desenvolvimento de
		 * software. É usado quando o tipo de objeto a ser criado é determinado por uma
		 * instância prototype, que é clonada para produzir novos objetos. Este padrão é
		 * usado para: - evitar subclasses de um criador de objeto na aplicação cliente,
		 * como o padrão de factory abstrato. - evitar o custo inerente de criar um novo
		 * objeto da forma padrão (por exemplo, usando a palavra chave 'new')
		 *
		 * Neste exemplo, temos uma classe de factory ({ @link CriaturaFactoryImpl})
		 * produzindo objetos por clonagem dos existentes. Os objetos de protótipo de
		 * factory são fornecidos como parâmetros do construtor.
		 */

		CriaturaFactory factory = new CriaturaFactoryImpl(
				new ElfMago("cozinhar"),
				new ElfSenhorDaGuerra("limpar"),
				new ElfFera("proteger"));
		Mago mago = factory.createMago();
		SenhorDaGuerra senhorDaGuerra = factory.createSenhorDaGuerra();
		Fera fera = factory.createFera();
		System.out.println(mago);
		System.out.println(senhorDaGuerra);
		System.out.println(fera);

		factory = new CriaturaFactoryImpl(
				new OrcMago("varinha mágica"),
				new OrcSenhorDaGuerra("espada"),
				new OrcFera("machado"));
		mago = factory.createMago();
		senhorDaGuerra = factory.createSenhorDaGuerra();
		fera = factory.createFera();
		System.out.println(mago);
		System.out.println(senhorDaGuerra);
		System.out.println(fera);

	}
}
