package creational.factory_method;

import java.util.Arrays;
import java.util.EnumMap;
import java.util.Map;

/**
 * Subclasse concreta para a criação de novos objetos.
 * Ferreiro que deve fabricar armas para orcs.
 * @author <a href="mailto:jean.zanatta@unoesc.edu.br">Jean Luiz Zanatta</a>
 * @since 16/12/2021
 */
public class OrcFerreiro implements Ferreiro {

	private static final Map<TipoDeArma, OrcArma> ORCARSENAL;

	static {
	    ORCARSENAL = new EnumMap<>(TipoDeArma.class);
	    Arrays.stream(TipoDeArma.values()).forEach(tipo -> ORCARSENAL.put(tipo, new OrcArma(tipo)));
	}

	@Override
	public Arma fabricarArma(TipoDeArma tipoDeArma) {
		return ORCARSENAL.get(tipoDeArma);
	}

}
