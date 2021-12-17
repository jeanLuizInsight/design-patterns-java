# Factory Method - Creational (Cria��o)

## Inten��o

*Definir uma interface para criar um objeto, mas deixar as subclasses decidirem que classe instanciar. O Factory Method permite adiar a instancia��o para as subclasses.*

---

## Sobre o Factory Method

- � um padr�o de projeto de cria��o (lida com a cria��o de objetos)
- Oculta a l�gica de instancia��o do c�digo cliente. O m�todo f�brica ser� respons�vel por instanciar as classes desejadas
- � obtido atrav�s de heran�a. O m�todo f�brica pode ser criado ou sobrescrito por subclasses
- D� flexibilidade ao c�digo cliente permitindo a cria��o de novas factories sem a necessidade de alterar c�digo j� escrito (OCP)
- Pode usar par�metros para determinar o tipo dos objetos a serem criados ou os par�metros a serem enviados aos objetos sendo criados.

---

## Estrutura

Veja a pasta diagramas.

## Aplicabilidade

- Use o factory method quando n�o souber com certeza quais os tipos de objetos o seu c�digo vai precisar
- Use o factory method para permitir a extens�o de suas factories para cria��o de novos objetos (isso ajuda a aplicar o Open/Closed Principle)
- Use o factory method para desacoplar o c�digo que cria do c�digo que usa as classes (Single Responsibility Principle)
- Use o factory method para dar um hook (gancho) �s subclasses para permitir que elas decidam a l�gica de cria��o de objetos
- Use o factory method para eliminar duplica��o de c�digo na cria��o de objetos

## Implementa��o - Teoria

1. Crie uma interface em comum para todos os produtos (por exemplo, Product)
2. Crie classes que implementam a interface dos produtos (por exemplo, ConcreteProduct1, ConcreteProduct2...)
3. Crie uma classe (Creator) que implementa ou contem o m�todo f�brica (factory method). Essa classe pode conter dados e outros m�todos. S�o raros os casos onde a classe Creator � simplesmente uma interface com o factory method. O m�todo f�brica � respons�vel por criar produtos que implementam a interface "Product".
4. Crie classes concretas que estendem a classe Creator e implementam o m�todo f�brica. As classes ConcreteCreator podem retornar produtos diferentes, contando que esses produtos implementem a interface Product.

## Consequ�ncias

O que � bom ou ruim no Factory Method:

**Bom:**
- Ajuda a aplicar o Open/Closed Principle. Seu c�digo vai estar aberto para extens�o
- Ajuda na aplica��o do Single Responsibility Principle. Separa o c�digo que cria do c�digo que usa o objeto
- Ajuda no desacoplamento do seu c�digo

**Ruim:**
- Pode causar uma explos�o de subclasses. Ser� necess�rio uma classe Creator para cada ConcreteProduct. S� � vantajoso quando j� seria necess�rio estender a classe Creator na estrutura
