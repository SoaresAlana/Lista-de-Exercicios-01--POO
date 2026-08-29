[← Voltar ao README](../README.md)

## Bloco 3: Estrutura if / else / else if
  ### - QUESTÃO 16: (../src/bloco03/Questao16.java)
    Declare numero = -8. Verifique se é positivo, negativo ou zero e se 
    é par ou ímpar. Produza uma única mensagem combinada: "O numero -8 e 
    negativo e par."

  ### - QUESTÃO 17: (../src/bloco03/Questao17.java)
    Retomando o exercício 04: declare imc = 26.5. Classifique conforme a 
    tabela da OMS e exiba o resultado. 
      | Classificação      |  IMC         |
      |--------------------|--------------|
      | Abaixo do peso     |  < 18,5      |
      | Peso normal        |  18,5 – 24,9 |
      | Sobrepeso          |  25,0 – 29,9 |
      | Obesidade grau I   |  30,0 – 34,9 |
      | Obesidade grau II  |  35,0 – 39,9 |
      | Obesidade grau III |  ≥ 40,0      |

  ### - QUESTÃO 18: (../src/bloco03/Questao18.java)
    Declare ano = 2024. Verifique se o ano é bissexto.
      * Um ano é bissexto se divisível por 4, exceto séculos 
      (divisíveis por 100) quesão bissextos somente se também 
      divisíveis por 400.
      * Em Java: (ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)

  ### - QUESTÃO 19: (../src/bloco03/Questao19.java)
    Dados os lados a = 5.0, b = 5.0, c = 8.0: 
      (a)- Verifique se formam um triângulo válido (cada lado deve ser menor que 
      a soma dos outros dois). 
      (b)- Se válido, classifique em equilátero, isósceles ou escalêno.

  ### - QUESTÃO 20: (../src/bloco03/Questao20.java)
    Declare compra = 750.0. Calcule o descontoe exiba o valor descontado e 
    o preço final. 
      | Valor da compra        | Desconto |
      |------------------------|----------|
      | Menos de R$ 100,0      | 00%      |
      | R$ 100,00 a R$ 499,99  | 5%       |
      | R$ 500,00 a R$ 999,99  | 10%      |
      | R$ 1.000,00 ou mais    | 15%      |

  ### - QUESTÃO 21: (../src/bloco03/Questao21.java)
    Declare x = 42, y = 17, z = 89. Encontre e exiba o maior e o menor usando 
    apenas if/else if/else (sem arrays, sem Math.min/max).

  ### - QUESTÃO 22: (../src/bloco03/Questao22.java)
    Declare n = 153. Verifique se é um número de Armstrong: para um número de 
    3 dígitos, a soma dos cubos dos dígitos é igual ao próprio número. 
      Exemplo: 153 = 13 + 53 + 33 = 153 (Armstrong). 100 = 1 + 0 + 0 = 1 (não é).
        Extraia os dígitos: c = n / 100; d = (n / 10) % 10; u = n % 10.

  ### - QUESTÃO 23: (../src/bloco03/Questao23.java)
    Retomando o exercício 06: com delta calculado, use if/else para calcular e 
    exibir as raízes da equação x^2 − 5x + 6 = 0, ou exibir "Sem raizes reais." 
    se ∆ < 0. 
      x = (−b ± √∆) / 2a
