# Facade - Structural (Estrutural)

## Intenção

*Facade (Fachada) é um padrão de projeto estrutural que tem a intenção de fornecer uma interface unificada para um conjunto de interfaces em um subsistema. Façade define uma interface de nível mais alto que torna o subsistema mais fácil de ser usado*

---

## Sobre o Facade

O Facade é o padrão mais simples de todos. Ele tem a intenção de facilitar a vida do código cliente ao criar um objeto de fachada para um sistema mais complexo.

Imagine ter que instanciar várias classes, passar objetos como parâmetro de outros objetos, chamar vários métodos ou executar algorítmos apenas para iniciar um sistema. O Facade ajudará você a não poluir o código cliente com todo esse código. Ele visa fornecer uma interface muito mais simples e unificada em um objeto que o cliente pode simplesmente chamar métodos e obter o comportamento desejado.

Vamos a um exemplo do mundo real, como funciona uma mina de ouro? Bem, os mineiros vão lá e cavam ouro! Isso é o que você acredita porque você está usando uma interface simples que a mina de ouro fornece por fora, internamente ela tem que fazer um monte de coisas para que isso aconteça. Essa interface simples para o subsistema complexo é um facade(fachada).

É importante ressaltar que o Facade não tem a intenção de ocultar nada do código cliente, a ideia é simplesmente facilitar o uso do sistema. O cliente ainda poderá usar os objetos do sistema diretamente se necessário.

Como esse padrão visa unificar coisas que poderiam estar separadas no sistema, é muito comum que a própria classe de fachada se torne uma "*God Class*" (uma classe faz tudo), isso quebra o SRP (princípio da responsabilidade única). Porém, ele também permite a criação de fachadas adicionais que podem ser usadas tanto por clientes quando por outras fachadas, o que ajuda a minimizar este problema.  

---

## Estrutura

Veja a pasta diagramas.

## Aplicabilidade

Use o padrão Facade quando:

- você quer disponibilizar uma interface mais simples para um sistema complexo
- você quer criar pontos de entrada para determinadas partes do sistema, como serviços externos, camadas da aplicação e objetos complexos dentro em determinadas partes do código  

## Implementação

Veja o código e os diagramas dessa pasta para entender como o Facade é implementado.

## Consequências

O que é bom ou ruim no Facade:

**Bom:**
- Isola o código complexo do código cliente
- Facilita o uso do sistema
- Cria pontos de entrada para camadas da aplicação e serviços de terceiros

**Ruim:**
- O objeto façade se torna facilmente uma "*God class*" (use fachadas adicionais se perceber que isso está ocorrendo no seu código)
