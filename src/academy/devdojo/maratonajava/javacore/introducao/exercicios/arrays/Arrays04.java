package academy.devdojo.maratonajava.javacore.introducao.exercicios.arrays;

import java.util.Scanner;

public class Arrays04 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int[] arr = new int[10];

        for (int i = 0; i < arr.length; i++) {
            System.out.printf("Digite o número para a posição " + i + ": ");
            arr[i] = scn.nextInt();
        }

        int aux = 0;

        for (int i = 0; i < (arr.length)/2 ; i++) {
            int p = (arr.length - i) - 1;
            aux = arr[i];
            arr[i] = arr[p];
            arr[p] = aux;
        }


        for (int i : arr) {
            System.out.println(i);
        }
    }
}
