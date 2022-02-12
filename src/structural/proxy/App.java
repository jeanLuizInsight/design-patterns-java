package structural.proxy;

/**
 * Um proxy, em sua forma mais geral, é uma classe que funciona como uma interface para outra coisa.
 * O proxy pode fazer interface com qualquer coisa: uma conexão de rede, um objeto grande na memória, um arquivo ou
 * algum outro recurso caro ou impossível de duplicar.
 * Em suma, um proxy é um wrapper ou objeto agente que está sendo chamado pelo cliente para acessar o objeto serviço real
 * por trás da cena.
 *
 * O padrão de design Proxy permite que você forneça uma interface para outros objetos criando uma
 * classe wrapper como proxy. A classe wrapper, que é o proxy, pode adicionar
 * funcionalidade ao objeto de interesse sem alterar o código do objeto.
 *
 * Neste exemplo, o proxy ({@link TorreDoMagoProxy}) controla o acesso ao objeto real ({@link TorreDeMarfim}).

 * @author <a href="mailto:jean.zanatta@unoesc.edu.br">Jean Luiz Zanatta</a>
 * @since 12/02/2022
 */
public class App {

	public static void main(String[] args) {
		TorreDoMagoProxy proxy = new TorreDoMagoProxy(new TorreDeMarfim());
	    proxy.entrar(new Mago("Mago vermelho"));
	    proxy.entrar(new Mago("Mago branco"));
	    proxy.entrar(new Mago("Mago preto"));
	    proxy.entrar(new Mago("Mago verde"));
	    proxy.entrar(new Mago("Mago roxo"));
	}
}
