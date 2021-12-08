package creational.builder;

/**
 * Classe Heroi com muitos parametros com utilização de Builder.
 * @author <a href="mailto:jean.zanatta@unoesc.edu.br">Jean Luiz Zanatta</a>
 * @since 08/12/2021
 */
public final class Heroi {

	private final Armadura armadura;
	private final CorDoCabelo corDoCabelo;
	private final String nome;
	private final Profissao profissao;
	private final Arma arma;

	public Heroi(final Builder builder) {
		super();
		this.armadura = builder.armadura;
		this.corDoCabelo = builder.corDoCabelo;
		this.nome = builder.nome;
		this.profissao = builder.profissao;
		this.arma = builder.arma;
	}

	public Armadura getArmadura() {
		return this.armadura;
	}

	public CorDoCabelo getCorDoCabelo() {
		return this.corDoCabelo;
	}

	public String getNome() {
		return this.nome;
	}

	public Profissao getProfissao() {
		return this.profissao;
	}

	public Arma getArma() {
		return this.arma;
	}

	@Override
	public String toString() {
		return "Heroi [armadura=" + this.armadura + ", corDoCabelo=" + this.corDoCabelo + ", nome=" + this.nome + ", profissao=" + this.profissao
				+ ", arma=" + this.arma
				+ "]";
	}

	/**
	 * Classe Builder estática para Heroi
	 */
	public static class Builder {

		private Armadura armadura;
		private CorDoCabelo corDoCabelo;
		private final String nome;
		private final Profissao profissao;
		private Arma arma;

		/**
		 * Construtor garantindo que o nome e profissão devem ser obrigatórios.
		 * @param nome
		 * @param profissao
		 */
		public Builder(final String nome, final Profissao profissao) {
			super();
			if (nome == null || profissao == null) {
				throw new IllegalArgumentException("Nome e profissão do Herói não podem ser nulos.");
			}
			this.nome = nome;
			this.profissao = profissao;
		}

		public Heroi build() {
			return new Heroi(this);
		}

		public Builder comArmadura(final Armadura armadura) {
			this.armadura = armadura;
			return this;
		}

		public Builder comCorDoCabelo(final CorDoCabelo corDoCabelo) {
			this.corDoCabelo = corDoCabelo;
			return this;
		}

		public Builder comArma(final Arma arma) {
			this.arma = arma;
			return this;
		}

	}
}
