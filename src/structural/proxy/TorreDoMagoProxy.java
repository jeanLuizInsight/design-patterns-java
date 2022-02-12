package structural.proxy;

import java.util.logging.Logger;

/**
 * Proxy que controla o acesso à {@link TorreDeMarfim}
 *
 * @author <a href="mailto:jean.zanatta@unoesc.edu.br">Jean Luiz Zanatta</a>
 * @since 12/02/2022
 */
public class TorreDoMagoProxy implements TorreDoMago {

	private static final Logger LOGGER = Logger.getLogger(TorreDoMagoProxy.class.getName());
	private static final int NUM_MAGOS_PERMITIDOS = 3;

	private int numMagos;
	private final TorreDoMago torre;

	public TorreDoMagoProxy(TorreDoMago torre) {
		this.torre = torre;
	}

	@Override
	public void entrar(Mago mago) {
		if (numMagos < NUM_MAGOS_PERMITIDOS) {
			torre.entrar(mago);
			numMagos++;
		} else {
			LOGGER.info(mago + " não é permitido entrar!");
		}
	}

}
