package structural.facade;

import java.util.Collection;
import java.util.List;

/**
 * Facade que fornece uma interface única através da qual os clientes podem operar os subsistemas.
 *
 * Isso torna a mina de ouro mais fácil de operar e corta as dependências do cliente da mina de ouro para
 * os subsistemas.
 * @author <a href="mailto:jean.zanatta@unoesc.edu.br">Jean Luiz Zanatta</a>
 * @since 28/01/2022
 */
public class MinaDeOuroFacade {

	private final List<Minerador> trabalhadores;

	public MinaDeOuroFacade() {
		trabalhadores = List.of(new EscavadorDeOuro(), new OperadorDeCarrinho(), new EscavadorDeTunel());
	}

	private static void fazerAcoes(Collection<Minerador> trabalhadores, Minerador.Acao... acoes) {
		trabalhadores.forEach(trab -> trab.acao(acoes));
	}

	public void cavarOuro() {
		fazerAcoes(trabalhadores, Minerador.Acao.TRABALHAR);
	}

	public void finalizarDia() {
		fazerAcoes(trabalhadores, Minerador.Acao.IR_PARA_CASA, Minerador.Acao.IR_DORMIR);
	}

	public void iniciarNovoDia() {
		fazerAcoes(trabalhadores, Minerador.Acao.ACORDAR, Minerador.Acao.IR_PARA_MINA);
	}
}
