# Composite - Structural (Estrutural)

## Inten��o

*Compor objetos em estruturas de �rvore para representar hierarquias partes/todo. Composite permite aos clientes tratarem de maneira uniforme objetos individuais e composi��es de objetos.*

*Observa��o:* **partes** s�o objetos que formam a estrutura (as partes da estrutura); **todo** � a estrutura inteira que � formada por v�rias partes.

---

## Sobre o Composite

O composite � um padr�o de projeto que permite ao cliente tratar um �nico objeto ou uma estrutura formada de v�rios objetos aninhados hierarquicamente da mesma maneira.

Na vida real lidamos com grases, cada frase � composta de palavras que, por sua vez, s�o compostas de letras. Cada um desses objetos pode ser impresso e eles podem ter algo impresso antes ou depois deles, como a frase sempre termina com ponto final e a palavra sempre tem um espa�o antes dela.

O padr�o Composite � exatamente isso: podemos tratar um �nico objeto ou uma estrutura de objetos da mesma maneira. Conseguimos isso atrav�s um uma interface em comum entre objetos compostos (frase) e objetos folha (palavra).

---

## Estrutura

Veja a pasta diagramas.

## Aplicabilidade

Use o padr�o Composite quando:

- sua estrutura de objetos possa ser representada hierarquicamente, como por exemplo, estruturas do tipo �rvore
- voc� quiser que o c�digo cliente trate objetos compostos e objetos simples da mesma maneira

## Implementa��o - Teoria

**Observa��o:** veja o c�digo e os diagramas nessa mesma pasta, eles detalham melhor a implementa��o do padr�o composite.

1. **Crie uma interface em comum para objetos compostos e objetos simples (`Component`):** pode ser uma classe abstrata ou uma interface, contando que os m�todos fa�am sentido em ambos os objetos. Defina um ou mais m�todos que funcionam de maneira polim�rfica em objetos compostos e objetos simples. Quando esse m�todo for chamado em um objeto composto, ele delegar� a tarefa para seus filhos; quando chamado em objetos simples, eles n�o tem para onde delegar, ent�o realizam a a��o requisitada
2. **Crie objetos folha (`Leaf`) que implementam a interface `Component`:** s�o os objetos da ponta da estrutura, geralmente s�o os objetos que realmente fazem o trabalho real (como descrito acima)  
3. **Crie objetos compostos (`Composite`):** s�o objetos que t�m filhos. Esses filhos podem ser outros objetos compostos (`Composite`) ou objetos folha (`Leaf`). O trabalho desses objetos � delegar o trabalho para seus filhos. Objetos compostos devem ter um container que sustenta seus filhos (pode ser um vetor, uma tabela de dispers�o, um dicion�rio ou qualquer outra estrutura de dados). Al�m disso, eles tamb�m t�m m�todos para adicionar e remover novos filhos.

## Consequ�ncias

O que � bom ou ruim no Composite:

**Bom:**
- � muito f�cil criar objetos complexos por composi��o
- � f�cil gerar uma hierarquia de objetos
- � f�cil usar polimorfismo e recurs�o
- � f�cil adicionar novos tipos de elementos na estrutura (OCP)

**Ruim:**
- Dependendo da estrutura, pode quebrar o princ�pio da segrega��o de interface (ISP). Objetos do tipo "Leaf" (folha) tendem a ter m�todos que n�o usam ou n�o fazem nada