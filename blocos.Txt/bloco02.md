[← Voltar ao README](../README.md)

## Bloco 2: Conversões de Unidades e Tipos
  ### - QUESTÃO 09: (../src/bloco02/Questao09.java)
	Declar ecelsius = 37.5. Converta e exiba com 2 casas decimais: 
      * F = C × 9/5 + 32 
	  * K = C + 273,15

  ### - QUESTÃO 10: (../src/bloco02/Questao10.java)
	Declare metros = 2.5. Exiba as equivalências em: quilômetros (÷ 1000), 
	centímetros (× 100), milímetros (× 1000) e polegadas (÷ 0,0254).

  ### - QUESTÃO 11: (../src/bloco02/Questao11.java)
	Declare horas = 2, minutos = 45, segundos = 30. Converta tudo para apenas 
	segundos. Depois converta o total de volta para o formato hh:mm:ss. 

  ### - QUESTÃO 12: (../src/bloco02/Questao12.java)
	Declare reais = 150.0. Use as taxas fixas para converter e exiba com 2 casas 
	decimais.
	  | Moeda       |  1 unidade = R$ |
	  |-------------|-----------------|
  	  | Dólar (USD) |  R$ 5,20        |
	  | Euro (EUR)  |  R$ 5,65        |
	  | Libra (GBP) |  R$ 6,40        |

  ### - QUESTÃO 13: (../src/bloco02/Questao13.java)
	Declare gramas = 4750.0. Converta e exiba em: quilogramas (÷ 1000), 
	  toneladas (÷ 106) e miligramas (× 1000).

  ### - QUESTÃO 14: (../src/bloco02/Questao14.java)
    Declare kmh = 90.0. Converta e exiba: 
	  * m/s = km/h ÷ 3,6 
	  * mph = km/h ÷ 1,609

  ### - QUESTÃO 15: (../src/bloco02/Questao15.java)
	Analise o efeito do cast de tipo em Java. Sem executar, determine o que cada 
	linha exibe. Depois escreva o código e confirme.	
	
	  double d = 3.99;
	  int a = 7, b = 2;
			
	  System.out.println((int) d);   // -> ___
	  System.out.println((double) a / b);   // -> ___
	  System.out.println(a / b);   // -> ___
	  System.out.println((int)(d * 10));   // -> ___
	  System.out.println((int) d + a);   // -> ___
