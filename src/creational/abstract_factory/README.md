# Abstract Factory - Creational (Cria��o)

## Inten��o

*Fornecer uma interface para cria��o de fam�lias de objetos relacionados ou dependentes sem especificar suas classes concretas.*

---

## Sobre o Abstract Factory

O Abstract Factory � usado para garantir que uma fam�lia de produtos relacionados ou dependentes trabalhem sempre juntos (*veja aplicabilidade para mais casos de uso*).  

Por exemplo: imagine que est� criando um sistema para representa��o de reinos de ORCS e ELFOS. � natural termos v�rias classes representando elementos como Rei, Castelo, Ex�rcito e assim por diante. Al�m disso, os reinos tamb�m precisam de implementa��es diferentes das classes de Rei, Castelo e Ex�rcito.  

Nesse caso ter�amos fam�lias de classes de elementos (Rei, Castelo e Ex�rcito) separadas por grupos de reinos (�lfico e Orc). 

O Abstract Factory ajuda a garantir que classes de mesma fam�lia trabalhem sempre juntas. Voc� n�o quer que classes `OrcCastelo` se misturem com `ElfCastelo`, n�o �? Por isso focamos em fam�lia de objetos relacionados ou dependentes.

No exemplo, poder�amos ter uma f�brica abstrata (`ReinoFactory`) com os m�todos abstratos `createExercito`, `createCastelo` e `createRei`. Agora podemos implementar f�bricas concretas que estendem `ReinoFactory` e implementam esses m�todos, seriam elas: `ElfReinoFactory` e `OrcReinoFactory`. Cada f�brica concreta fica respons�vel pode retornar objetos da sua pr�pria fam�lia.

A �nica coisa que tamb�m precisamos, mas que n�o foi mencionado at� aqui � uma interface em comum para todos os produtos finais. Todos os produtos devem seguir a mesma interface. 

No exemplo as interfaces de produtos seriam: `Exercito`, `Castelo` e `Rei`.

---

## Estrutura

Veja a pasta diagramas.

## Aplicabilidade

Use o padr�o Abstract Factory quando:

- um sistema deve ser independente de como seus produtos s�o criados, compostos ou representados
- um sistema deve ser configurado como um produto de fam�lia de m�ltiplos produtos
- uma fam�lia de objetos for projetada para ser usada em conjunto e voc� necessita garantir essa restri��o
- voc� quer fornecer uma biblioteca de classes de produtos e quer revelar somente suas interfaces, n�o suas implementa��es

## Implementa��o - Teoria

Observa��o importante: objetos criados por um f�bricas tendem a ser chamados de "Product" (produto). Veja os diagramas na pasta "diagramas" para melhor entendimento.

1. **Crie uma interface em comum para todas as factories concretas:** essa interface define m�todos que retornam fam�lias de produtos diferentes em um n�vel mais abstrato. Esses produtos podem colaborar entre si caso necess�rio. Esses m�todos devem ser implementados por todas as f�bricas concretas.
2. **Crie f�bricas concretas:** essas f�bricas implementam os m�todos da f�brica abstrata e retornam os produtos concretos. A assinatura dos m�todos nas f�bricas concretas retornam a mesma fam�lia da f�brica abstrata, por�m o retorno s�o produtos concretos que implementam a interface da fam�lia de produtos retornados pela f�brica abstrata. 
3. **Crie interfaces correspondentes para cada fam�lia de produto:** essas interfaces definem os tipos dos objetos a serem retornados pela f�brica abstrata. Essas interfaces s�o os retornos dos m�todos f�brica na f�brica abstrata.
4. **Crie os produtos concretos:** crie os produtos concretos que implementam as interfaces de produtos. Note que produtos de interfaces diferentes podem colaborar entre si por composi��o. Esses produtos s�o os retornos dos m�todos f�brica nas f�bricas concretas.

## Consequ�ncias

O que � bom ou ruim no Abstract Factory:

**Bom:**
- Os produtos sempre ser�o compat�veis entre si
- Aplica��o clara do Open/Closed Principle, � f�cil adicionar novas f�bricas e produtos
- Aplica��o clara do Single Responsibility Principle, o c�digo que cria est� separado do c�digo que usa os objetos

**Ruim:**
- Muitas classes e maior complexidade ser� introduzida no c�digo
