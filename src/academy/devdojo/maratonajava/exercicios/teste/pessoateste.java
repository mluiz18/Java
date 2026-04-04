package academy.devdojo.maratonajava.exercicios.teste;

import academy.devdojo.maratonajava.exercicios.domain.pessoa;

import java.util.Scanner;

public class pessoateste {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String nome = scn.next();
        System.out.println("Digite sua idade: ");
        int idade = scn.nextInt();
        pessoa p = new pessoa(idade, nome);
        System.out.println(p.apresentar());
    }
}
