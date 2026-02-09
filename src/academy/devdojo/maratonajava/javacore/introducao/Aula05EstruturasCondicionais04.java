package academy.devdojo.maratonajava.javacore.introducao;

public class Aula05EstruturasCondicionais04 {
    public static void main(String[] args) {
        byte dia = 10;

        switch (dia) {
            case (1):
                System.out.println("Domingo");
                break;
            case (2):
                System.out.println("Segunda - Feira");
                break;
            case (3):
                System.out.println("Terça - Feira");
                break;
            case (4):
                System.out.println("Quarta - Feira");
                break;
            case (5):
                System.out.println("Quinta - Feira");
                break;
            case (6):
                System.out.println("Sexta - Feira");
                break;
            case (7):
                System.out.println("Sábado");
                break;
            default:
                System.out.println("Valor Inválido!");
                break;
        }

        char sexo = 'J';

        switch (sexo){
            case ('M'):
                System.out.println("Sexo masculino!");
                break;
            case ('F'):
                System.out.println("Sexo feminino!");
                break;
            default:
                System.out.println("Valor inválido!");
                break;
        }
    }
}
