package bloco07;
/* [Ver Questao 46](../../blocos.Txt/bloco07.txt) */
public class Questao46 {
    // Método static que imprime o símbolo repetido 'tam' vezes
    public static void imprimirLinha(int tam, char sim) {
        for (int i = 0; i < tam; i++) {
            System.out.print(sim);
        }
        System.out.println(); // Quebra de linha
    }
    public static void main(String[] args) {
        // Chamadas do método conforme solicitado
        imprimirLinha(30, '-');
        imprimirLinha(20, '=');
        imprimirLinha(10, '*');
    }
}