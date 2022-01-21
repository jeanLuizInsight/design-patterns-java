package structural.decorator;

import java.util.logging.Logger;

/**
 * O padr�o Decorator � uma alternativa mais flex�vel para subclasses.
 * A classe do decorador implementa a mesma interface que o alvo e usa composi��o para "decorar" chamadas
 * para o alvo.
 * Usando o padr�o Decorator � poss�vel mudar o comportamento da classe durante
 * tempo de execu��o.
 *
 * Neste exemplo, mostramos como o simples {@link TrollDesarmado} ataca primeiro e depois foge da
 * batalha.
 * Em seguida, decoramos o {@link TrollDesarmado} com um {@link TrollArmado} e realizamos o
 * ataque novamente. Voc� pode ver como o comportamento muda ap�s a decora��o.
 *
 * @author <a href="mailto:jean.zanatta@unoesc.edu.br">Jean Luiz Zanatta</a>
 * @since 21/01/2022
 */
public class App {

	private static final Logger LOGGER = Logger.getLogger(App.class.getName());

	public static void main(String[] args) {
		// troll desarmado
	    LOGGER.info("Um troll desarmado, de apar�ncia simples se aproxima.");
	    Troll troll = new TrollDesarmado();
	    troll.ataque();
	    troll.fugirDaBatalha();
	    LOGGER.info("Poder de um troll desarmado: " + troll.getPoderDeAtaque());

	    // alterar o comportamento do troll desarmado adicionando um decorator
	    LOGGER.info("Um troll com um enorme bast�o te surpreende.");
	    Troll trollArmado = new TrollArmado(troll);
	    trollArmado.ataque();
	    trollArmado.fugirDaBatalha();
	    LOGGER.info("Poder de um troll armado: " + trollArmado.getPoderDeAtaque());
	}

}
