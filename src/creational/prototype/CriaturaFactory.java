package creational.prototype;

/**
 * Interface factory para produzir diferentes tipos de criaturas a partir de protótipos.
 *
 * @author <a href="mailto:jean.zanatta@unoesc.edu.br">Jean Luiz Zanatta</a>
 * @since 14/12/2021
 */
public interface CriaturaFactory {

	Mago createMago();

	SenhorDaGuerra createSenhorDaGuerra();

	Fera createFera();
}
