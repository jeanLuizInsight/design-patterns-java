package structural.adapter;

/**
 * O capit�o usa {@link BarcoDeRemo} para navegar. Essa � a classe cliente do padr�o.
 * @author <a href="mailto:jean.zanatta@unoesc.edu.br">Jean Luiz Zanatta</a>
 * @since 07/01/2022
 */
public class Capitao {

	private BarcoDeRemo barcoDeRemo;

	public Capitao() {}

	public Capitao(final BarcoDeRemo barcoDeRemo) {
		super();
		this.barcoDeRemo = barcoDeRemo;
	}

	public void setBarcoDeRemo(final BarcoDeRemo barcoDeRemo) {
		this.barcoDeRemo = barcoDeRemo;
	}

	void remar() {
		this.barcoDeRemo.remar();
	}

}
