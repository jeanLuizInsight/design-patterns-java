package creational.prototype;

/**
 * Classe concreta factory.
 *
 * @author <a href="mailto:jean.zanatta@unoesc.edu.br">Jean Luiz Zanatta</a>
 * @since 14/12/2021
 */
public class CriaturaFactoryImpl implements CriaturaFactory {

	private final Mago mago;
	private final SenhorDaGuerra senhorDaGuerra;
	private final Fera fera;

	public CriaturaFactoryImpl(final Mago mago, final SenhorDaGuerra senhorDaGuerra, final Fera fera) {
		super();
		this.mago = mago;
		this.senhorDaGuerra = senhorDaGuerra;
		this.fera = fera;
	}

	@Override
	public Mago createMago() {
		return mago.copy();
	}

	@Override
	public SenhorDaGuerra createSenhorDaGuerra() {
		return senhorDaGuerra.copy();
	}

	@Override
	public Fera createFera() {
		return fera.copy();
	}

}
