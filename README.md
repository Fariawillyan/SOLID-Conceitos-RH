# SOLID-Conceitos-RH
Modelo básico para o entendimento das boas práticas de programação em SOLID.
O termo SOLID é o acrônimo para os cinco princípios da POO, a saber:

- S de Single Responsibility Principle (Princípio da Responsabilidade Única); 
- O de Open-Closed Principle (Princípio Aberto-Fechado);
- L de Liskov Substitution Principle (Princípio da Substituição de Liskov);
- I de Interface Segregation Principle (Princípio da Segregação da Interface);
- D de Dependency Inversion Principle (Princípio da Inversão da Dependência).

## O que aprendi:

### Coesão:
- Uma classe coesa faz bem uma única coisa.
- Classes coesas não devem ter várias responsabilidades.

### Encapsulamento:
- Getters e setters não são formas eficientes de aplicar encapsulamento.
- É interessante fornecer acesso apenas ao que é necessário em nossas classes.
- O encapsulamento torna o uso das nossas classes mais fácil e intuitivo.

### Acoplamento:
- Acoplamento é a dependência entre classes
- Acoplamento nem sempre é ruim, e que é impossível criar um sistema sem nenhum acoplamento
- Devemos controlar o nível de acoplamento na nossa aplicação (falaremos mais sobre isso)

###outros:
- Que classes/métodos/funções/módulos devem ter uma única responsabilidade bem definida;
- Que, segundo o Princípio de Responsabilidade Única (SRP), uma classe deve ter um e apenas um motivo para ser alterada;
- Como realizar uma refatoração no nosso sistema, para aplicar o SRP;
- Como extrair uma classe.
- Que classes/métodos/funções/módulos devem ter uma única responsabilidade bem definida;
- Que, segundo o Princípio de Responsabilidade Única (SRP), uma classe deve ter um e apenas um motivo para ser alterada;
- Como realizar uma refatoração no nosso sistema, para aplicar o SRP;
- Como extrair uma classe.
- Que, embora a herança favoreça o reaproveitamento de código, ela pode trazer efeitos colaterais quando não utilizada da maneira correta;
- Que o Princípio de Substituição de Liskov (LSP) diz que devemos poder substituir classes base por suas classes derivadas em qualquer lugar, sem problema.
- Que é mais interessante e mais seguro para o nosso código depender de interfaces (classes abstratas, assinaturas de métodos e interfaces em si) do que das implementações de uma classe;
- Que as interfaces são menos propensas a sofrer mudanças enquanto implementações podem mudar a qualquer momento;
- Que o Princípio de Inversão de Dependência (DIP) diz que implementações devem depender de abstrações e abstrações não devem depender de implementações;
- Que as interfaces devem definir apenas os métodos que fazem sentido para seu contexto;
- Que o Princípio de Segregação de Interfaces (ISP) diz que uma classe não deve ser obrigada a implementar um método que ela não precisa;