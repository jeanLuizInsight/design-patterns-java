package structural.bridge;

/**
 * Interface da abstração de arma a ser utilizada pelo cliente.
 * @author <a href="mailto:jean.zanatta@unoesc.edu.br">Jean Luiz Zanatta</a>
 * @since 14/01/2022
 */
public interface Arma {

	Encantamento getEncantamento();

	void balancar();

	void manejar();

	void desarmar();
}
