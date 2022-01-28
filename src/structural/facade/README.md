# Facade - Structural (Estrutural)

## Inten��o

*Facade (Fachada) � um padr�o de projeto estrutural que tem a inten��o de fornecer uma interface unificada para um conjunto de interfaces em um subsistema. Fa�ade define uma interface de n�vel mais alto que torna o subsistema mais f�cil de ser usado*

---

## Sobre o Facade

O Facade � o padr�o mais simples de todos. Ele tem a inten��o de facilitar a vida do c�digo cliente ao criar um objeto de fachada para um sistema mais complexo.

Imagine ter que instanciar v�rias classes, passar objetos como par�metro de outros objetos, chamar v�rios m�todos ou executar algor�tmos apenas para iniciar um sistema. O Facade ajudar� voc� a n�o poluir o c�digo cliente com todo esse c�digo. Ele visa fornecer uma interface muito mais simples e unificada em um objeto que o cliente pode simplesmente chamar m�todos e obter o comportamento desejado.

Vamos a um exemplo do mundo real, como funciona uma mina de ouro? Bem, os mineiros v�o l� e cavam ouro! Isso � o que voc� acredita porque voc� est� usando uma interface simples que a mina de ouro fornece por fora, internamente ela tem que fazer um monte de coisas para que isso aconte�a. Essa interface simples para o subsistema complexo � um facade(fachada).

� importante ressaltar que o Facade n�o tem a inten��o de ocultar nada do c�digo cliente, a ideia � simplesmente facilitar o uso do sistema. O cliente ainda poder� usar os objetos do sistema diretamente se necess�rio.

Como esse padr�o visa unificar coisas que poderiam estar separadas no sistema, � muito comum que a pr�pria classe de fachada se torne uma "*God Class*" (uma classe faz tudo), isso quebra o SRP (princ�pio da responsabilidade �nica). Por�m, ele tamb�m permite a cria��o de fachadas adicionais que podem ser usadas tanto por clientes quando por outras fachadas, o que ajuda a minimizar este problema.  

---

## Estrutura

Veja a pasta diagramas.

## Aplicabilidade

Use o padr�o Facade quando:

- voc� quer disponibilizar uma interface mais simples para um sistema complexo
- voc� quer criar pontos de entrada para determinadas partes do sistema, como servi�os externos, camadas da aplica��o e objetos complexos dentro em determinadas partes do c�digo  

## Implementa��o

Veja o c�digo e os diagramas dessa pasta para entender como o Facade � implementado.

## Consequ�ncias

O que � bom ou ruim no Facade:

**Bom:**
- Isola o c�digo complexo do c�digo cliente
- Facilita o uso do sistema
- Cria pontos de entrada para camadas da aplica��o e servi�os de terceiros

**Ruim:**
- O objeto fa�ade se torna facilmente uma "*God class*" (use fachadas adicionais se perceber que isso est� ocorrendo no seu c�digo)
