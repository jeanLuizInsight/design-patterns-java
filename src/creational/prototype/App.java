package creational.prototype;

/**
 * Classe de execu��oo das implementa��es do padr�o Prototype.
 *
 * @author <a href="mailto:jean.zanatta@unoesc.edu.br">Jean Luiz Zanatta</a>
 * @since 14/12/2021
 */
public class App {

	public static void main(final String[] args) {

		/**
		 * O padr�o Prototype � um padr�o de design criativo no desenvolvimento de
		 * software. � usado quando o tipo de objeto a ser criado � determinado por uma
		 * inst�ncia prototype, que � clonada para produzir novos objetos. Este padr�o �
		 * usado para: - evitar subclasses de um criador de objeto na aplica��o cliente,
		 * como o padr�o de factory abstrato. - evitar o custo inerente de criar um novo
		 * objeto da forma padr�o (por exemplo, usando a palavra chave 'new')
		 *
		 * Neste exemplo, temos uma classe de factory ({ @link CriaturaFactoryImpl})
		 * produzindo objetos por clonagem dos existentes. Os objetos de prot�tipo de
		 * factory s�o fornecidos como par�metros do construtor.
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
				new OrcMago("varinha m�gica"),
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
