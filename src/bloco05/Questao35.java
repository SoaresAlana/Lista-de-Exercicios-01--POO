package bloco05;
/* [Ver Questao 35](../../blocos.Txt/bloco05.txt) */
public class Questao35 {
    public static void main(String[] args) {
        char op = '+';
        double a = 15.0;
        double b = 4.0;
        
        // Operadores
        switch (op) {
            case '+':
                System.out.println("Resultado: " + (a + b));
                break;
            case '-':
                System.out.println("Resultado: " + (a - b));
                break;
            case '*':
                System.out.println("Resultado: " + (a * b));
                break;
            case '/':
                // Para evitar divisão por zero
                if (b == 0) {
                    System.out.println("Erro: Divisao por zero nao permitida.");
                } else {
                    System.out.println("Resultado: " + (a / b));
                }
                break;
            default:
                System.out.println("Operador invalido.");
                break;
        }
    }
}