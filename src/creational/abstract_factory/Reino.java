package creational.abstract_factory;

/**
 * Classe de representa��o do Reino.
 * @author <a href="mailto:jean.zanatta@unoesc.edu.br">Jean Luiz Zanatta</a>
 * @since 21/12/2021
 */
public class Reino {

	/**
	 * Classe criadora de f�bricas do Reino.
	 */
	public static class CriadorDeFactory {

		public enum TipoDeReino {
			ELF,
			ORC
		}

		/**
		 * M�todo de f�brica para criar objetos concretos ReinoFactory.
		 * @param tipo
		 * @return
		 */
		public ReinoFactory createFactory(TipoDeReino tipo) {
			switch (tipo) {
			case ELF:
				return new ElfReinoFactory();
			case ORC:
				return new OrcReinoFactory();
			default:
				throw new IllegalArgumentException("Tipo de reino n�o suportado.");
			}
		}
	}
}
