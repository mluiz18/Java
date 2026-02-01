package academy.devdojo.maratonajava.exercicios.arrays;

import java.util.Scanner;

public class Arrays {

    public static void main(String[] args) {
        int[] arr = new int[10];
        int indice = 0;
        Scanner scn = new Scanner(System.in);

        while (true) {
            System.out.println("1 - Adicionar número");
            System.out.println("2 - Listar números");
            System.out.println("0 - Sair");
            int c = scn.nextInt();

            switch (c) {
                case (0):
                    return;

                case (1):
                    System.out.print("Digite um número: ");
                    int n = scn.nextInt();

                    if (indice == arr.length) {
                        System.out.println("Array cheio!");
                    } else {
                        arr[indice++] = n;
                    }
                    break;

                case (2):
                    System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
                    if (indice == 0 && arr[indice] == 0) {
                        System.out.println("O Array não possui nenhum número");
                    } else {
                        for (int i = 0; i < indice; i++) {
                            System.out.println("número na posição " + i + ": " + arr[i]);
                        }
                    }
                    System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
                    break;


                default:
                    System.out.println("Opção inválida!");
            }
        }
    }
}
