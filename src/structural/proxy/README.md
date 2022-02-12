# Proxy - Structural (Estrutural)

## Inten��o

*Proxy � um padr�o de projeto que tem a inten��o de fornecer um substituto (surrogate) ou marcador de localiza��o para outro objeto para controlar o acesso a esse objeto.*

---

## Sobre o Proxy

Proxy � um padr�o de projeto muito similar a outros padr�es que usam composi��o, como *Composite* e *Decorator*. Apesar disso, as inten��es dos tr�s padr�es s�o diferentes. 

A inten��o do proxy � ter um objeto (o proxy) que fingir� ser o objeto real para controle de acesso. O objeto Proxy receber� as solicita��es que seriam enviadas ao objeto real e ter� controle sobre como e quando encaminha-las (ou n�o) para objeto real. O objeto proxy atinge seu objetivo se posicionando entre o c�digo cliente e o objeto real.

Isso � interessante em v�rios cen�rios. Por exemplo, o objeto proxy pode:

- fazer cache de chamadas para objetos caros para o sistema
- criar logs de acesso, avisos ou erros
- controle de acesso (autentica��o)
- distribuir servi�os
- adiar instancia��es (lazy instantiation) ou execu��es (lazy evaluation)
- e mais (as possibilidades s�o basicamente controladas pela sua criatividade)

Com base no modo como os proxies s�o usados, o padr�o pode ser classificado como:

- Proxy Virtual: controla acesso a recursos que podem ser caros para cria��o ou utiliza��o.
- Proxy Remoto: controla acesso a recursos que est�o em servidores remotos.
- Proxy de prote��o: controla acesso a recursos que possam necessitar autentica��o ou permiss�o.
- Proxy inteligente: al�m de controlar acesso ao objeto real, tamb�m executa tarefas adicionais para saber quando e como executar determinadas a��es.

### Diferen�as entre *Composite*, *Decorator* e *Proxy*

Composite, Decorator e Proxy s�o padr�es com estruturas semelhantes, por�m com inten��es diferentes, veja:

- **Composite** - compor objetos em estruturas de �rvore para representarem hierarquias partes-todo. Composite permite aos cliente tratarem de maneira uniforme objetos individuais e composi��es de objetos.
- **Decorator** - atribui responsabilidades adicionais a um objeto dinamicamente. Os Decorators fornecem uma alternativa flex�vel � subclasses para extens�o da funcionalidade.
- **Proxy** - fornece um objeto representante (surrogate), ou um marcador de outro objeto para controlar o acesso ao mesmo. 

Dentre esses tr�s padr�es, o *Decorator* e o *Proxy* tem confundido muito mais meus alunos do que *Composite* e *Proxy*, por isso segue um trecho do livro da GoF detalhando a diferen�a:

> (GoF PT-BR p�g. 209) ...Diferentemente do *Decorator*, o padr�o *Proxy* n�o est� preocupado em incluir ou excluir comportamentos dinamicamente e n�o est� projetado para composi��o recursiva. Sua inten��o � fornecer um substituto para um objeto quando for inconveniente ou indesej�vel acess�-lo diretamente porque, por exemplo, est� numa m�quina remota, tem acesso restrito ou � persistente.

Apesar de estruturas parecidas, todas as inten��es refletem exatamente o que cada padr�o resolve.

---

## Estrutura

Veja a pasta diagramas.

## Aplicabilidade

Use o padr�o Proxy quando:

- voc� tem um objeto caro para ser criado e n�o quer permitir acesso direto a esse objeto (proxy virtual)
- voc� que restringir acesso a partes da sua aplica��o (proxy de prote��o)
- voc� quer uma liga��o entre seu sistema e um sistema remoto. O proxy pode fingir ser a interface do objeto remoto e lidar com toda a complexidade de conex�o e transmiss�o de dados (proxy remoto)
- voc� quer fazer cache de chamadas j� realizadas (proxy inteligente ou proxy de cache)

## Implementa��o

Um exemplo do mundo real, imagine uma torre onde os magos locais v�o estudar seus feiti�os. A torre de marfim s� pode ser acessada atrav�s de um proxy que garante que apenas os tr�s primeiros assistentes possam entrar. Aqui o proxy representa a funcionalidade da torre e adiciona controle de acesso a ela. Simplificando, usando o padr�o de proxy, uma classe ir� representar a funcionalidade de outra classe.

Primeiramente temos a interface `TorreDoMago` e sua classe de implementa��o `TorreDeMarfim`. Ent�o uma classe simples `Mago` pra sua representa��o. Em seguida � criado o proxy `TorreDoMagoProxy` controle de acesso para adicionar a `TorreDoMago`.

## Consequ�ncias

O que � bom ou ruim no Proxy:

**Bom:**
- O c�digo cliente nem precisa saber se est� ou n�o usando um Proxy (ele finge ser o objeto real)
- Voc� pode adicionar novos Proxies sem mudar c�digo j� testado (OCP)
- O Proxy funciona mesmo se o objeto real n�o estiver operacional ou pronto para uso
- Voc� pode controlar o ciclo de vida de objetos reais dentro do proxy

**Ruim:**
- Introduz mais classes ao sistema isso o torna mais complexo 
