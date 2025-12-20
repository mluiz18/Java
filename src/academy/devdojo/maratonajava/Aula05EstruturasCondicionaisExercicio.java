package academy.devdojo.maratonajava;

public class Aula05EstruturasCondicionaisExercicio {
    /**
     * Exercicio 2: Dado um determinado salário, determine qual o valor a ser pago de imposto, valores: <br>
     *  0 < x <= 34,712 -> 9,70% <br>
     *  34,712 < x <= 68,507 -> 37,35% <br>
     *  x > 68,507 -> 49,50% <br>
     */
    public static void main(String[] args) {
        double salario = 34713;
        double imposto;

        if (salario >= 0 && salario <= 34712) {
            imposto = (salario * 9.70) / 100;
        } else if (salario > 34712 && salario <= 68507) {
            imposto = (salario * 37.35) / 100;
        } else if (salario > 68507) {
            imposto = (salario * 49.50) / 100;
        } else {
            System.out.println("Valor Inválido!");
            return;
        }

        System.out.println("Imposto devido: R$" + imposto);
    }
}
