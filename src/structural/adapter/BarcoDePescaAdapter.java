package structural.adapter;

/**
 * Classe adapter. Adapta a interface do device {@link BarcoDePesca} para {@link BarcoDeRemo}, que é a interface esperada pelo cliente {@link Capitao}
 * @author <a href="mailto:jean.zanatta@unoesc.edu.br">Jean Luiz Zanatta</a>
 * @since 07/01/2022
 */
public class BarcoDePescaAdapter implements BarcoDeRemo {

	private final BarcoDePesca barco = new BarcoDePesca();

	@Override
	public final void remar() {
		this.barco.navegar();
	}
}
