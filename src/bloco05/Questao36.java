package bloco05;
/* [Ver Questao 36](../../blocos.Txt/bloco05.txt) */
public class Questao36 {
    public static void main(String[] args) {
        int codigo = 3; 

        switch (codigo) {
            case 1:
                System.out.println("Produto: Arroz (5 kg) - Preco: R$ 28,90");
                break;
            case 2:
                System.out.println("Produto: Feijao (1 kg) - Preco: R$ 9,50");
                break;
            case 3:
                System.out.println("Produto: Macarrao (500 g) - Preco: R$ 4,75");
                break;
            case 4:
                System.out.println("Produto: Azeite (500 ml) - Preco: R$ 22,00");
                break;
            case 5:
                System.out.println("Produto: Leite (1 L) - Preco: R$ 6,30");
                break;
            default:
                System.out.println("Código de produto inválido.");
                break;
        }
    }
}