package creational.abstract_factory;

/**
 * Classe de representação do Reino.
 * @author <a href="mailto:jean.zanatta@unoesc.edu.br">Jean Luiz Zanatta</a>
 * @since 21/12/2021
 */
public class Reino {

	private Castelo castelo;
	private Rei rei;
	private Exercito exercito;

	public Castelo getCastelo() {
		return castelo;
	}

	public void setCastelo(Castelo castelo) {
		this.castelo = castelo;
	}

	public Rei getRei() {
		return rei;
	}

	public void setRei(Rei rei) {
		this.rei = rei;
	}

	public Exercito getExercito() {
		return exercito;
	}

	public void setExercito(Exercito exercito) {
		this.exercito = exercito;
	}

	/**
	 * Classe criadora de fábricas do Reino.
	 */
	public static class CriadorDeFactory {

		public enum TipoDeReino {
			ELF,
			ORC
		}

		/**
		 * Método de fábrica para criar objetos concretos ReinoFactory.
		 * @param tipo
		 * @return
		 */
		public static ReinoFactory createFactory(TipoDeReino tipo) {
			switch (tipo) {
			case ELF:
				return new ElfReinoFactory();
			case ORC:
				return new OrcReinoFactory();
			default:
				throw new IllegalArgumentException("Tipo de reino não suportado.");
			}
		}
	}
}
