package bloco05;
/* [Ver Questao 34](../../blocos.Txt/bloco05.txt) */
public class Questao34 {
    public static void main(String[] args) {
        int mes = 2;
        String nMes = "";  // Nome do Mês

        switch (mes) {
            case 1:  nMes = "Janeiro"; break;
            case 2:  nMes = "Fevereiro"; break;
            case 3:  nMes = "Março"; break;
            case 4:  nMes = "Abril"; break;
            case 5:  nMes = "Maio"; break;
            case 6:  nMes = "Junho"; break;
            case 7:  nMes = "Julho"; break;
            case 8:  nMes = "Agosto"; break;
            case 9:  nMes = "Setembro"; break;
            case 10: nMes = "Outubro"; break;
            case 11: nMes = "Novembro"; break;
            case 12: nMes = "Dezembro"; break;
            default: nMes = "Mes Invalido"; break;
        }

        // Se o mês for válido, exibe o nome e calcula os dias usando cases agrupados
        if (!nMes.equals("Mes Invalido")) {
            System.out.print(nMes + " tem ");
            
            switch (mes) {
                case 2:
                    System.out.println("28 dias.");
                    break;
                // Casos agrupados para meses com 31 dias
                case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                    System.out.println("31 dias.");
                    break;
                // Casos agrupados para meses com 30 dias
                case 4: case 6: case 9: case 11:
                    System.out.println("30 dias.");
                    break;
            }
        } else {
            System.out.println(nMes);
        }
    }
}
