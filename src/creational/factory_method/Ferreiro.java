package creational.factory_method;

/**
 * Interface ferreiro com métodos para produzir os objetos.
 * Ferreiro deve fabricar armas
 * @author <a href="mailto:jean.zanatta@unoesc.edu.br">Jean Luiz Zanatta</a>
 * @since 16/12/2021
 */
public interface Ferreiro {

	Arma fabricarArma(TipoDeArma tipoDeArma);
}
