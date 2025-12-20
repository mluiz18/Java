package academy.devdojo.maratonajava;

/**
 * Dados os valores de 1 a 7, imprima se é dia útil ou final de semana, considere 1 como domingo
 */
public class Aula05EstruturasCondicionais05Exercicio {
    public static void main(String[] args) {
        int dia = 7;

        switch (dia) {
            case (1):
            case (7):
                System.out.println("Final de semana!");
                break;
            case (2):
            case (3):
            case (4):
            case (5):
            case (6):
                System.out.println("Dia útil");
                break;
            default:
                System.out.println("Valor inválido!");
                break;
        }
    }
}
