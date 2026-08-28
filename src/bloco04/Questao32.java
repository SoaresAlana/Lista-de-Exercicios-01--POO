package bloco04;
/* [Ver Questao 32](../../blocos.Txt/bloco04.txt) */
public class Questao32 {
    public static void main(String[] args) {
        int soma = 0;
        int termo = 1;
        int quantidadeTermos = 0;

        do {
            soma = soma + termo;
            termo++;
            quantidadeTermos++;
        } while (soma <= 500);
        
        System.out.println("Soma = "+ soma +" com "+ quantidadeTermos +" termos.");
    }
}