package academy.devdojo.maratonajava.exercicios.banco.teste;

import academy.devdojo.maratonajava.exercicios.banco.domain.pessoa;
import academy.devdojo.maratonajava.exercicios.banco.domain.verificacao;

import java.util.Scanner;

public class banco {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        pessoa p = new pessoa();
        verificacao v = new verificacao();

        System.out.println("Digite seu nome: ");
        String nome = scn.next();

        System.out.println("Digite sua idade: ");
        int idade = scn.nextInt();

        if (v.isOverEqualsEighteen(idade)) {
            System.out.println("Digite seu cpf: ");
            String cpf = scn.next();

            if (v.isCpfValid(cpf)) {

                System.out.println("Digite seu salário: ");
                double salario = scn.nextDouble();

                if (v.isSalaryAcceptable(salario)) {
                    p.setNome(nome);
                    p.setIdade(idade);
                    p.setCpf(cpf);
                    p.setSalario(salario);
                    System.out.println("Success!");
                }
            }
        }

    }
}
