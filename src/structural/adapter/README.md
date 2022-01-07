# Adapter - Structural (Estrutural)

## Intenção

*Converter a interface de uma classe em outra interface esperada pelos clientes. O Adapter permite que certas classes trabalhem em conjunto, pois de outra forma seria impossível por causa de suas interfaces incompatíveis.*

---

## Sobre o Adapter

O `Adapter` é um padrão de projeto muito usado para adaptar interfaces de código de terceiros (como frameworks ou libs) ou código legado (antigo) para o nosso código atual. Com ele é possível não depender diretamente de código que não está no domínio da nossa aplicação.

Atualmente usamos muitos frameworks ou libs externas para tarefas simples, como validação de dados, logging, ORM e assim por diante. Geralmente usamos esses códigos diretamente na nossa aplicação, o que faz o nosso código depender de código externo.

Um código que depende de algo externo parece inofensivo, porém se isso ocorrer em muitos locais da minha aplicação e, por algum motivo, eu precisar trocar de biblioteca, agora eu terei um problema em mãos. Testes precisarão ser refeitos, partes que não deveriam quebrar com alterações quebram... Enfim, vários problemas poderão ocorrer.

O padrão `Adapter` ajuda a resolver este problema (dentre vários outros) adicionando um adaptador sob meu domínio dentro na aplicação. A função do objeto `Adapter` é adaptar chamadas de dentro da minha aplicação para o framework ou lib externos.

Isso também pode ser usado para outros fins, como adaptar código legado, adicionar funcionalidades a classes ou fazer qualquer tipo de adaptação necessária para sua aplicação.

---

## Estrutura

Veja a pasta diagramas.

## Aplicabilidade

Use o padrão Adapter quando:

- você não quiser que seu código dependa diretamente de código de terceiros ou legado 
- você quiser usar um classe existente mas sua interface for incompatível com a interface que seu código ou domínio precisam
- você quiser reutilizar várias subclasses que não possuam determinada funcionalidade mas for impraticável estender o código de cada uma apenas para adicionar a funcionalidade desejada 

## Implementação - Teoria

Considere uma capitão que só pode usar barcos de remo e não pode velejar.
O capitão sempre espera uma implementação da interface `BarcoDeRemo` seja capaz de o mover.
Agora, digamos que os piratas estão chegando e nosso capitão precisa escapar, mas há apenas um barco de pesca disponível. Precisamos criar um adaptador que permita ao capitão operar o barco de pesca com suas habilidades de barco de remo.
Dessa forma o capitão pode utilizar o `BarcoDePesca` para escapar dos piratas.
1. **Declare a interface do `Adapter`:** essa é a interface (`BarcoDeRemo`) que seu código cliente usa e todos os `Adapters` concretos implementam. Ela deve ter os métodos que serão encaminhados para o código que está sendo adaptado (`BarcoDePesca` no diagrama e `Adaptee` no padrão)
2. **Crie adaptadores concretos que implementam a interface do `Adapter` (`BarcoDePescaAdapter` no diagrama):** você pode criar quantas classes adaptadoras precisar para seu código. Essa classe deverá encaminhar chamadas de métodos para o código que está sendo adaptado (`BarcoDePesca` no diagrama)
3. **Encaminhe as chamadas de método do `Adapter` para o `Adaptee`:** agora você só precisará encaminhar as chamadas de métodos do seu `Adapter` concreto para o código que está sendo adaptado (`Adaptee` no diagrama)

## Consequências

O que é bom ou ruim no Adapter:

**Bom:**
- Desacopla o código da aplicação de códigos de terceiros
- Aplica o SRP ao separar a conversão de interfaces da lógica da aplicação
- Aplica o OCP ao permitir introduzir novos Adapters para código existente

**Ruim:**
- Aumenta a complexidade da aplicação (Por outro lado, qual outra solução deveria ser aplicada?)