# Bridge - Structural (Estrutural)

## Intenção

*Bridge é um padrão de projeto estrutural que tem a intenção de desacoplar uma abstração da sua implementação, de modo que as duas possam variar e evoluir independentemente.*

*Observação:* **abstração** é um código de alto nível que geralmente delega tarefas para sua implementação; **implementação** é o código de baixo nível que realmente faz o trabalho (o código para o qual a abstração delega tarefas).

---

## Sobre o Bridge

O bridge foca o trabalho em composição, ou seja, ao invés de extender infinitamente minha estrutura de classes para todas as possíveis variantes por herança, posso apenas manter uma referência para uma implementação dentro da minha abstração. Isso me permite encaminhar chamadas de métodos da abstração para a implementação em tempo de execução.

O bridge é idêntico ao adapter, o que muda é apenas sua intenção. Veja esse trecho do livro da GoF:

> (GOF em PT-BR pág. 208) A diferença chave entre esses padrões está nas suas intenções… O padrão Adapter faz as coisas funcionarem *APÓS* elas terem sido projetadas; o Bridge as faz funcionar *ANTES QUE* existam...

---

## Estrutura

Veja a pasta diagramas.

## Aplicabilidade

Use o padrão Bridge quando:

- você souber que sua estrutura terá abstrações (código de alto nível) e implementações dessa abstração (detalhes) que possam variar de maneira independente
- você souber que o Adapter poderia ser aplicado naquela estrutura (você já conhece a estrutura)
- você quiser dividir uma classe que possa ter diversas variantes (como em produtos e suas variações de cores: CanetaAzul, CanetaVermelha, CamisetaAzul, CamisetaVermelha, etc...)
- você quer trocar as implementações em tempo de execução


## Implementação - Teoria

Considere que você tem uma arma com diferentes encantamentos, e você deve permitir a mistura de diferentes armas com diferentes encantamentos. O que você faria? 
1 - Cria várias cópias de cada uma das armas para cada um dos encantamentos 
2 - Você apenas criaria um encantamento separado e o definiria para a arma conforme necessário? 
O padrão bridge permite que você faça a segunda opção.

1. **Declare a interface da `Abstração`:** essa é a interface que seu código cliente usa e todas as abstrações concretas implementam. Ela deve ter os métodos que serão encaminhados para a implementação dessa abstração (`Arma` no diagrama)
2. **Crie abstrações refinadas que implementam a interface da abstração:** você pode criar quantas abstrações concretas precisar para seu código. Essas classes devem encaminhar chamadas de métodos para sua implementação concreta (`Martelo` ou `Espada` no diagrama) por composição (`Encantamento`)
3. **Encaminhe as chamadas de método de `Abstraction` para o `Implementor`:** agora você só precisará encaminhar as chamadas de métodos da sua `Abstraction` concreta para o código que está implementando a abstração (`Martelo` ou `Espada` no diagrama). Para encaminhar as chamadas, geralmente precisamos ter uma referência do `Implementor` concreto na `Abstraction` concreta (por composição).

Observe que teremos 2 hierarquias, uma para Arma e uma para Encantamento, sendo que o Encantamento compõe uma Arma.

## Consequências

O que é bom ou ruim no Bridge:

**Bom:**
- Desacopla o código da abstração do código da implementação (SRP)
- Implementa o OCP ao permitir novas abstrações e/ou implementações para código existente
- Tem as mesmas vantagens do Adapter

**Ruim:**
- Aumenta a complexidade da aplicação quando implementado em locais incorretos
