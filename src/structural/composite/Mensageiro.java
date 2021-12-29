package structural.composite;

import java.util.Arrays;
import java.util.List;

/**
 * Classe mensageira para montar as frases utilizando os objetos composite.
 * @author <a href="mailto:jean.zanatta@unoesc.edu.br">Jean Luiz Zanatta</a>
 * @since 29/12/2021
 */
public class Mensageiro {

	LetraComposite mensagemParaElfos() {
		final List<Palavra> palavras = Arrays.asList(
				new Palavra('o', 'n', 'd', 'e'),
				new Palavra('h', 'á'),
				new Palavra('u', 'm'),
				new Palavra('c', 'h', 'i', 'c', 'o', 't', 'e'),
				new Palavra('h', 'á'),
				new Palavra('u', 'm', 'a'),
				new Palavra('c', 'o', 'n', 'd', 'u', 't', 'a'));
		return new Frase(palavras);

	}

	LetraComposite mensagemParaOrcs() {
		final List<Palavra> palavras = Arrays.asList(
				new Palavra('m', 'u', 'i', 't', 'o'),
				new Palavra('v', 'e', 'n', 't', 'o'),
				new Palavra('s', 'o', 'p', 'r', 'a'),
				new Palavra('d', 'a'),
				new Palavra('s', 'u', 'a'),
				new Palavra('b', 'o', 'c', 'a'));
		return new Frase(palavras);
	}
}
