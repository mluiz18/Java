package academy.devdojo.maratonajava.exercicios.arrays;

import java.util.Scanner;

public class Arrays02 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        float[] notas = new float[4];

        for (int i = 0; i < notas.length; i++) {
            System.out.println("Digite a nota: ");
            notas[i] = scn.nextFloat();
        }

        float s = 0;
        for (float i : notas) {
            s += i;
        }

        float media = s / notas.length;
        System.out.println("média: " + media);
    }
}
