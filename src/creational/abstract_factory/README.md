# Abstract Factory - Creational (Criação)

## Intenção

*Fornecer uma interface para criação de famílias de objetos relacionados ou dependentes sem especificar suas classes concretas.*

---

## Sobre o Abstract Factory

O Abstract Factory é usado para garantir que uma família de produtos relacionados ou dependentes trabalhem sempre juntos (*veja aplicabilidade para mais casos de uso*).  

Por exemplo: imagine que está criando um sistema para representação de reinos de ORCS e ELFOS. É natural termos várias classes representando elementos como Rei, Castelo, Exército e assim por diante. Além disso, os reinos também precisam de implementações diferentes das classes de Rei, Castelo e Exército.  

Nesse caso teríamos famílias de classes de elementos (Rei, Castelo e Exército) separadas por grupos de reinos (Élfico e Orc). 

O Abstract Factory ajuda a garantir que classes de mesma família trabalhem sempre juntas. Você não quer que classes `OrcCastelo` se misturem com `ElfCastelo`, não é? Por isso focamos em família de objetos relacionados ou dependentes.

No exemplo, poderíamos ter uma fábrica abstrata (`ReinoFactory`) com os métodos abstratos `createExercito`, `createCastelo` e `createRei`. Agora podemos implementar fábricas concretas que estendem `ReinoFactory` e implementam esses métodos, seriam elas: `ElfReinoFactory` e `OrcReinoFactory`. Cada fábrica concreta fica responsável pode retornar objetos da sua própria família.

A única coisa que também precisamos, mas que não foi mencionado até aqui é uma interface em comum para todos os produtos finais. Todos os produtos devem seguir a mesma interface. 

No exemplo as interfaces de produtos seriam: `Exercito`, `Castelo` e `Rei`.

---

## Estrutura

Veja a pasta diagramas.

## Aplicabilidade

Use o padrão Abstract Factory quando:

- um sistema deve ser independente de como seus produtos são criados, compostos ou representados
- um sistema deve ser configurado como um produto de família de múltiplos produtos
- uma família de objetos for projetada para ser usada em conjunto e você necessita garantir essa restrição
- você quer fornecer uma biblioteca de classes de produtos e quer revelar somente suas interfaces, não suas implementações

## Implementação - Teoria

Observação importante: objetos criados por um fábricas tendem a ser chamados de "Product" (produto). Veja os diagramas na pasta "diagramas" para melhor entendimento.

1. **Crie uma interface em comum para todas as factories concretas:** essa interface define métodos que retornam famílias de produtos diferentes em um nível mais abstrato. Esses produtos podem colaborar entre si caso necessário. Esses métodos devem ser implementados por todas as fábricas concretas.
2. **Crie fábricas concretas:** essas fábricas implementam os métodos da fábrica abstrata e retornam os produtos concretos. A assinatura dos métodos nas fábricas concretas retornam a mesma família da fábrica abstrata, porém o retorno são produtos concretos que implementam a interface da família de produtos retornados pela fábrica abstrata. 
3. **Crie interfaces correspondentes para cada família de produto:** essas interfaces definem os tipos dos objetos a serem retornados pela fábrica abstrata. Essas interfaces são os retornos dos métodos fábrica na fábrica abstrata.
4. **Crie os produtos concretos:** crie os produtos concretos que implementam as interfaces de produtos. Note que produtos de interfaces diferentes podem colaborar entre si por composição. Esses produtos são os retornos dos métodos fábrica nas fábricas concretas.

## Consequências

O que é bom ou ruim no Abstract Factory:

**Bom:**
- Os produtos sempre serão compatíveis entre si
- Aplicação clara do Open/Closed Principle, é fácil adicionar novas fábricas e produtos
- Aplicação clara do Single Responsibility Principle, o código que cria está separado do código que usa os objetos

**Ruim:**
- Muitas classes e maior complexidade será introduzida no código
