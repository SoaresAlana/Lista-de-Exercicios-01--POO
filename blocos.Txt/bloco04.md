[← Voltar ao README](../README.md)

### Bloco 4: Estruturas de Repetição: for, while, do-while
  ## - QUESTÃO 24: (../src/bloco04/Questao24.java)
    Exiba os números de 1 a 20 em uma única linha, marcando cada um como [P] (par) ou 
    [I] (ímpar). Use um único loop for.
      Saída esperada: 1[I] 2[P] 3[I] 4[P] ... 20[P]

  ## - QUESTÃO 25: (../src/bloco04/Questao25.java)
    Use um loop for para calcular e exibir a soma de todos os números inteiros de 1 a 100. 
      Resultado esperado: Soma = 5050.

  ## - QUESTÃO 26: (../src/bloco04/Questao26.java)
    Declare numero = 7. Exiba a tabuada completa (de 1 a 10) usando um loop for. 
      Saída: 7 x 1 = 7, 7 x 2 = 14, . . . , 7 x 10 = 70

  ## - QUESTÃO 27: (../src/bloco04/Questao27.java)
    Exiba as tabuadas de 1 a 5 usando dois loops for aninhados. Separe cada tabuada com uma 
    linha de hifens.
      Saída (trecho):
      –- Tabuada do 1 –-
      1 x 1 = 1 ... 1 x 10 = 10
      –- Tabuada do 2 –- ...
      
      ▷ Dica:
        Loop externo: for (int t = 1; t <= 5; t++)
        Loop interno: for (int i = 1; i <= 10; i++)

  ## - QUESTÃO 28: (../src/bloco04/Questao28.java)
    Calcule o fatorial de n = 10 usando um loop for. 
      Exiba o resultado no formato: "10! = 3628800".
      ▷ Dica: 
        Use o tipo long para acumular o resultado. 13! já ultrapassa o limite do int.

  ## - QUESTÃO 29: (../src/bloco04/Questao29.java)
    Exiba os primeiros 10 termos da sequência de Fibonacci usando um loop for.
      F0 = 0, F1 = 1, Fk = (Fk−1) + (Fk−2)
      Saída esperada: 0 1 1 2 3 5 8 13 21 34
      ▷ Dica: 
        Declare ant = 0, atu = 1 antes do loop. Em cada iteração: prox = ant + atu; 
        depois atualize ant = atu; atu = prox.

  ## - QUESTÃO 30: (../src/bloco04/Questao30.java)
    Declare n = 9876. Calcule e exiba a soma dos dígitos usando um loop while com divisão inteira e resto.
      Resultado esperado: 9 + 8 + 7 + 6 = 30
      ▷ Dica: 
      Em cada iteração: extraia n % 10 (último dígito) e faça n /= 10. Repita enquanto n > 0.

  ## - QUESTÃO 31: (../src/bloco04/Questao31.java)
    Declare decimal = 156. Converta para binário usando o método das divisões sucessivas por 2 com um loop 
    while. Concatene os restos (de baixo para cima) e exiba o resultado.
      Resultado esperado: "156 em binario = 10011100"
      ▷ Dica: 
        Acumule os restos em uma String:
        bin = (n % 2) + bin; depois n /= 2;

  ## - QUESTÃO 32: (../src/bloco04/Questao32.java)
    Use um loop do-while para somar os inteiros positivos consecutivos 1+2+3+. . . até que a soma ultrapasse 
    500. Exiba a soma final e quantos termos foram somados.
      Saída esperada: "Soma = 528 com 32 termos."
      ⋆ Saiba mais: 
        do-while garante que o bloco execute pelo menos uma vez antes de verificar a condição — útil quando 
        não sabemos com antecedência quantas iterações serão necessárias.
