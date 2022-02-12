package structural.proxy;

/**
 * Um proxy, em sua forma mais geral, � uma classe que funciona como uma interface para outra coisa.
 * O proxy pode fazer interface com qualquer coisa: uma conex�o de rede, um objeto grande na mem�ria, um arquivo ou
 * algum outro recurso caro ou imposs�vel de duplicar.
 * Em suma, um proxy � um wrapper ou objeto agente que est� sendo chamado pelo cliente para acessar o objeto servi�o real
 * por tr�s da cena.
 *
 * O padr�o de design Proxy permite que voc� forne�a uma interface para outros objetos criando uma
 * classe wrapper como proxy. A classe wrapper, que � o proxy, pode adicionar
 * funcionalidade ao objeto de interesse sem alterar o c�digo do objeto.
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
