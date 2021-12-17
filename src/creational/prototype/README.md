# Prototype - Creational (Cria��o)

## Inten��o

*Especificar os tipos de objetos a serem criados usando uma inst�ncia-prot�tipo e criar novos objetos pela c�pia desse prot�tipo.*

---

## Destilando a inten��o

A inten��o acima significa que voc� pode criar objetos prot�tipos que t�m um m�todo espec�fico ('clone') para clonar seus dados em um novo objeto. Isso evita a recria��o de objetos caros ou complexos para serem criados.

---

## Implementa��o

Veja o c�digo dessa mesma pasta.

## Estrutura

Veja a pasta diagramas nessa mesma pasta.

## Aplicabilidade

Use o Prototype quando:

- precisar que seu c�digo n�o dependa de classes concretas para a cria��o de novos objetos
- quiser evitar explos�o de subclasses para objetos muito similares
- quiser evitar a recria��o de objetos "caros" ou "complexos"

## Consequ�ncias

O que � bom ou ruim no Prototype:

**Bom:**
- Oculta classes concretas do c�digo cliente
- Ajuda na cria��o de objetos caros ou complexos
- Evita a explos�o de subclasses

**Ruim:**

- Clonar objetos que que tem refer�ncias para outros objetos pode ser super complexo
