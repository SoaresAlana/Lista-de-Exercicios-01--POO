package bloco07;
/* [Ver Questao 50](../../blocos.Txt/bloco07.txt) */
public class Questao50 {
    // (a) Método para verificar se a string é um palíndromo
    static boolean ehPalindromo(String s) {
        s = s.toLowerCase();
        int ini = 0, fim = s.length() - 1;
        while (ini < fim) {
            if (s.charAt(ini) != s.charAt(fim)) 
                return false; // Preenchimento da primeira lacuna
            ini++;
            fim--;
        }
        return true;
    }
    // (b) Método que gera um array com os primeiros n termos de Fibonacci (fibo)
    static int[] gerarFibonacci(int n) {
        if (n <= 0) return new int[0];
        int[] fibo = new int[n];
        
        if (n > 0) fibo[0] = 0;
        if (n > 1) fibo[1] = 1;
        
        for (int i = 2; i < n; i++) {
            fibo[i] = fibo[i - 1] + fibo[i - 2];
        }
        return fibo;
    }
    // (c) Método que exibe os elementos do vetor fibo (Fibonacci) separados por " -> "
    static void exibirVetor(int[] v) {
        for (int i = 0; i < v.length; i++) {
            System.out.print(v[i]);
            if (i < v.length - 1) {
                System.out.print(" -> ");
            }
        }
        System.out.println(); // Quebra de linha no final
    }
    public static void main(String[] args) {
        // Testando o método ehPalindromo
        System.out.println("\"racecar\" = palindromo? " + ehPalindromo("racecar"));
        System.out.println("\"hello\" = palindromo? " + ehPalindromo("hello"));
        System.out.println("\"Ama\" = palindromo? " + ehPalindromo("Ama"));
        
        System.out.println(); // Linha em branco para separar
        
        // Chamando exibirVetor com gerarFibonacci(15)
        System.out.print("Fibonacci: ");
        exibirVetor(gerarFibonacci(15));
    }
}