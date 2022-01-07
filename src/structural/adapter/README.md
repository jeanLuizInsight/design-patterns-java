# Adapter - Structural (Estrutural)

## Inten��o

*Converter a interface de uma classe em outra interface esperada pelos clientes. O Adapter permite que certas classes trabalhem em conjunto, pois de outra forma seria imposs�vel por causa de suas interfaces incompat�veis.*

---

## Sobre o Adapter

O `Adapter` � um padr�o de projeto muito usado para adaptar interfaces de c�digo de terceiros (como frameworks ou libs) ou c�digo legado (antigo) para o nosso c�digo atual. Com ele � poss�vel n�o depender diretamente de c�digo que n�o est� no dom�nio da nossa aplica��o.

Atualmente usamos muitos frameworks ou libs externas para tarefas simples, como valida��o de dados, logging, ORM e assim por diante. Geralmente usamos esses c�digos diretamente na nossa aplica��o, o que faz o nosso c�digo depender de c�digo externo.

Um c�digo que depende de algo externo parece inofensivo, por�m se isso ocorrer em muitos locais da minha aplica��o e, por algum motivo, eu precisar trocar de biblioteca, agora eu terei um problema em m�os. Testes precisar�o ser refeitos, partes que n�o deveriam quebrar com altera��es quebram... Enfim, v�rios problemas poder�o ocorrer.

O padr�o `Adapter` ajuda a resolver este problema (dentre v�rios outros) adicionando um adaptador sob meu dom�nio dentro na aplica��o. A fun��o do objeto `Adapter` � adaptar chamadas de dentro da minha aplica��o para o framework ou lib externos.

Isso tamb�m pode ser usado para outros fins, como adaptar c�digo legado, adicionar funcionalidades a classes ou fazer qualquer tipo de adapta��o necess�ria para sua aplica��o.

---

## Estrutura

Veja a pasta diagramas.

## Aplicabilidade

Use o padr�o Adapter quando:

- voc� n�o quiser que seu c�digo dependa diretamente de c�digo de terceiros ou legado 
- voc� quiser usar um classe existente mas sua interface for incompat�vel com a interface que seu c�digo ou dom�nio precisam
- voc� quiser reutilizar v�rias subclasses que n�o possuam determinada funcionalidade mas for impratic�vel estender o c�digo de cada uma apenas para adicionar a funcionalidade desejada 

## Implementa��o - Teoria

Considere uma capit�o que s� pode usar barcos de remo e n�o pode velejar.
O capit�o sempre espera uma implementa��o da interface `BarcoDeRemo` seja capaz de o mover.
Agora, digamos que os piratas est�o chegando e nosso capit�o precisa escapar, mas h� apenas um barco de pesca dispon�vel. Precisamos criar um adaptador que permita ao capit�o operar o barco de pesca com suas habilidades de barco de remo.
Dessa forma o capit�o pode utilizar o `BarcoDePesca` para escapar dos piratas.
1. **Declare a interface do `Adapter`:** essa � a interface (`BarcoDeRemo`) que seu c�digo cliente usa e todos os `Adapters` concretos implementam. Ela deve ter os m�todos que ser�o encaminhados para o c�digo que est� sendo adaptado (`BarcoDePesca` no diagrama e `Adaptee` no padr�o)
2. **Crie adaptadores concretos que implementam a interface do `Adapter` (`BarcoDePescaAdapter` no diagrama):** voc� pode criar quantas classes adaptadoras precisar para seu c�digo. Essa classe dever� encaminhar chamadas de m�todos para o c�digo que est� sendo adaptado (`BarcoDePesca` no diagrama)
3. **Encaminhe as chamadas de m�todo do `Adapter` para o `Adaptee`:** agora voc� s� precisar� encaminhar as chamadas de m�todos do seu `Adapter` concreto para o c�digo que est� sendo adaptado (`Adaptee` no diagrama)

## Consequ�ncias

O que � bom ou ruim no Adapter:

**Bom:**
- Desacopla o c�digo da aplica��o de c�digos de terceiros
- Aplica o SRP ao separar a convers�o de interfaces da l�gica da aplica��o
- Aplica o OCP ao permitir introduzir novos Adapters para c�digo existente

**Ruim:**
- Aumenta a complexidade da aplica��o (Por outro lado, qual outra solu��o deveria ser aplicada?)