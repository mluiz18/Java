package academy.devdojo.maratonajava.javacore.introducao;

public class Aula04Operadores {
    public static void main(String[] args) {

        // Operadores Aritméticos
        int n1 = 12;
        int n2 = 3;
        System.out.println(n1 + n2);
        System.out.println(n1 - n2);
        System.out.println(n1 * n2);
        System.out.println(n1 / n2);

        // Operadores relacionais
        boolean isDezMaiorVinte = 10 > 20;
        boolean isDezMenorVinte = 10 < 20;
        boolean isDezIgualVinte = 10 == 20;
        boolean isDezIgualDez = 10 == 10;
        boolean isDezDiferenteDez = 10 != 10;

        System.out.println(isDezMaiorVinte);
        System.out.println(isDezMenorVinte);
        System.out.println(isDezIgualVinte);
        System.out.println(isDezIgualDez);
        System.out.println(isDezDiferenteDez);

        // Operadores Lógicos
        int age = 29;
        float salary = 3381F;
        boolean isDentroDaLeiMaior30 = (age >= 30 && salary >= 4612);
        boolean isDentroDaLeiMenor30 = (age < 30 && salary >= 3381);
        System.out.println("isDentroDaLeiMaior30: " + isDentroDaLeiMaior30);
        System.out.println("isDentroDaLeiMenor30: " + isDentroDaLeiMenor30);

        double contaCorrente = 200;
        double contaPoupanca = 10000;
        boolean isPlayStation5Compravel = (contaPoupanca > 5000) || (contaCorrente > 5000);
        System.out.println("isPlayStation5Compravel: " + isPlayStation5Compravel);

        // += -= *= /=
        double bonus = 1800;
        bonus += 1000;
        bonus -= 1000;
        bonus *= 2;
        bonus /= 2;
        bonus %= 2;
        System.out.println("bonus " + bonus);
    }
}
