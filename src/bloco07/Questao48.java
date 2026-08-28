package bloco07;
/* [Ver Questao 48](../../blocos.Txt/bloco07.txt) */
public class Questao48 {
    // Método para verificar se o número é primo
    public static boolean ehPrimo(int n) {
        // Números menores ou iguais a 1 não são primos
        if (n <= 1) {
            return false;
        }
        // Loop interno que vai de 2 até a raiz quadrada de n
        int limite = (int) Math.sqrt(n);
        for (int i = 2; i <= limite; i++) {
            // Se for divisível por qualquer número nesse intervalo, não é primo
            if (n % i == 0) {
                return false;
            }
        }
        // Se passou pelo loop sem divisores, o número é primo
        return true;
    }
    public static void main(String[] args) {
        System.out.println("Numeros primos de 1 a 50:");
        // Loop principal para exibir os primos no intervalo de 1 a 50
        for (int i = 1; i <= 50; i++) {
            if (ehPrimo(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println(); // Quebra de linha no final
    }
}