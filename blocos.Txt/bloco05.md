[← Voltar ao README](../README.md)

* Bloco 5: Estrutura switch / case
  - QUESTÃO 33: (../src/bloco05/Questao33.java)
    Declare dia = 4 (1 = Domingo . . . 7 = Sábado). Use switch para exibir o nome completo do 
    dia da semana. O default exibe "Dia invalido.".

  - QUESTÃO 34: (../src/bloco05/Questao34.java)
    Declare mes = 2. Use switch para exibir: o nome do mês por extenso e quantos dias ele tem 
    (fevereiro = 28; use case agrupado para meses com 30 e 31 dias).
      ▷ Dica:
        Agrupe casos em Java: case 1: case 3: case 5: ...
        System.out.println("31 dias");
  
  - QUESTÃO 35: (../src/bloco05/Questao35.java)
    Implemente uma calculadora simples. Declare char op = ’+’, double a = 15.0, double b = 4.0. 
    Trate ’+’, ’-’, ’*’ e ’/’. Para divisão, verifique b == 0 antes de calcular. O default 
    exibe "Operador invalido.". 

  - QUESTÃO 36: (../src/bloco05/Questao36.java)
    Declare codigo = 3. Use switch para exibir o nome e o preço do produto. 
      Cód. | Produto          | Preço
        1  | Arroz (5 kg)     | R$ 28,90
        2  | Feijão (1 kg)    | R$ 9,50
        3  | Macarrão (500 g) | R$ 4,75
        4  | Azeite (500 ml)  | R$ 22,00
        5  | Leite (1 L)      | R$ 6,30 

  - QUESTÃO 37: (../src/bloco05/Questao37.java)
    Declare turno = 2 (1 = Manhã, 2 = Tarde, 3 = Noite). Use switch para exibir a saudação 
    correspondente: "Bom dia!", "Boa tarde!" ou "Boa noite!".

  - QUESTÃO 38: (../src/bloco05/Questao38.java)
    Declare contrato = 1 e salarioBruto = 5000.0. Use switch para calcular e 
    exibir o desconto e o salário líquido. 
      Cód. | Tipo         | Desconto
       1   | CLT          | 27,5%
       2   | PJ (simples) | 15,0%
       3   | Estágio      | 11,0%
