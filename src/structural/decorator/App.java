package structural.decorator;

import java.util.logging.Logger;

/**
 * O padrão Decorator é uma alternativa mais flexível para subclasses.
 * A classe do decorador implementa a mesma interface que o alvo e usa composição para "decorar" chamadas
 * para o alvo.
 * Usando o padrão Decorator é possível mudar o comportamento da classe durante
 * tempo de execução.
 *
 * Neste exemplo, mostramos como o simples {@link TrollDesarmado} ataca primeiro e depois foge da
 * batalha.
 * Em seguida, decoramos o {@link TrollDesarmado} com um {@link TrollArmado} e realizamos o
 * ataque novamente. Você pode ver como o comportamento muda após a decoração.
 *
 * @author <a href="mailto:jean.zanatta@unoesc.edu.br">Jean Luiz Zanatta</a>
 * @since 21/01/2022
 */
public class App {

	private static final Logger LOGGER = Logger.getLogger(App.class.getName());

	public static void main(String[] args) {
		// troll desarmado
	    LOGGER.info("Um troll desarmado, de aparência simples se aproxima.");
	    Troll troll = new TrollDesarmado();
	    troll.ataque();
	    troll.fugirDaBatalha();
	    LOGGER.info("Poder de um troll desarmado: " + troll.getPoderDeAtaque());

	    // alterar o comportamento do troll desarmado adicionando um decorator
	    LOGGER.info("Um troll com um enorme bastão te surpreende.");
	    Troll trollArmado = new TrollArmado(troll);
	    trollArmado.ataque();
	    trollArmado.fugirDaBatalha();
	    LOGGER.info("Poder de um troll armado: " + trollArmado.getPoderDeAtaque());
	}

}
