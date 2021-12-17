package creational.factory_method;

import java.util.Arrays;
import java.util.EnumMap;
import java.util.Map;

/**
 * Subclasse concreta para a criação de novos objetos.
 * Ferreiro que deve fabricar armas para elfos.
 * @author <a href="mailto:jean.zanatta@unoesc.edu.br">Jean Luiz Zanatta</a>
 * @since 16/12/2021
 */
public class ElfFerreiro implements Ferreiro {

	private static final Map<TipoDeArma, ElfArma> ELFARSENAL;

	static {
	    ELFARSENAL = new EnumMap<>(TipoDeArma.class);
	    Arrays.stream(TipoDeArma.values()).forEach(tipo -> ELFARSENAL.put(tipo, new ElfArma(tipo)));
	}

	@Override
	public Arma fabricarArma(TipoDeArma tipoDeArma) {
		return ELFARSENAL.get(tipoDeArma);
	}

}
