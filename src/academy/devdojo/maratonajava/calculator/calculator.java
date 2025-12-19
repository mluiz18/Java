package academy.devdojo.maratonajava.calculator;

import java.util.Scanner;
import academy.devdojo.maratonajava.calculator.operations;

public class calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        operations op = new operations();

        int r = 0;

        System.out.println("Digite um número: ");
        int n1 = scanner.nextInt();
        System.out.println("Digite outro número: ");
        int n2 = scanner.nextInt();

        while (r == 0) {
            System.out.println("Selecione a operação: ");
            System.out.println("1 - Soma");
            System.out.println("2 - Subtração");
            System.out.println("3 - Multiplicação");
            System.out.println("4 - Divisão");
            int c = scanner.nextInt();

            switch (c) {
                case (1):
                    int response = op.addOperation(n1, n2);
                    System.out.println(n1 + " + " + n2 + " = " + response);
                    break;
                case (2):
                    int res = op.subOperation(n1, n2);
                    System.out.println(n1 + " - " + n2 + " = " + res);
                    break;
                case (3):
                    int resp = op.mulOperation(n1, n2);
                    System.out.println(n1 + " * " + n2 + " = " + resp);
                    break;
                case (4):
                    if (n2 == 0) {
                        System.out.println("Error! Divisão por 0.");
                        continue;
                    }
                    int respo = op.divOperation(n1, n2);
                    System.out.println(n1 + " / " + n2 + " = " + respo);
                default:
                    System.out.println("Operação inválida");
            }

            System.out.println("Deseja continuar? (Digite qualquer número diferente de 0 para sair). ");
            r = scanner.nextInt();
            if (r != 0) {
                System.out.println("Desligando o sistema...");
                break;
            }
        }
    }
}
