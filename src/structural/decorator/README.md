# Decorator - Structural (Estrutural)

## Inten��o

*Agregar responsabilidades adicionais a um objeto dinamicamente. Os Decorators fornecem uma alternativa flex�vel ao uso de subclasses para extens�o de funcionalidades.*

---

## Sobre o Decorator

O Decorator � uma padr�o de projeto usado para adicionar funcionalidades a objetos j� criados, ou seja, sem a necessidade de alterar nenhum c�digo. Isso faz com que este padr�o aplique naturalmente o princ�pio do aberto/fechado (classes devem estar abertas para extens�o, mas fechadas para modifica��o).

---

## Estrutura

Veja a pasta diagramas.

## Aplicabilidade

Use o padr�o Decorator quando:

- voc� precisa adicionar funcionalidades em objetos sem quebrar ou alterar o c�digo existente
- voc� quiser usar composi��o ao inv�s de heran�a
- voc� percebe que pode ocorrer uma explos�o de subclasses em determinada estrutura

## Implementa��o

Utilizando um exemplo do mundo real, h� um troll furioso vivendo nas colinas pr�ximas. Normalmente, ele sai de m�os vazias, mas �s vezes tem uma arma. Para armar o troll n�o � necess�rio criar um novo troll, mas decor�-lo dinamicamente com uma arma adequada.

Veja o c�digo e os diagramas dessa pasta para entender como o Decorator � implementado.

## Consequ�ncias

O que � bom ou ruim no Decorator:

**Bom:**
- Composi��o � melhor do que heran�a em grande maioria dos casos
- � f�cil adicionar ou remover comportamento de objetos sem tocar em c�digo j� escrito ou testado (OCP)
- � poss�vel decorar um objeto j� decorado, adicionando ainda mais funcionalidades (camadas)

**Ruim:**
- Quanto mais decorators em camadas, mais complexo seu c�digo se torna
