package academy.devdojo.maratonajava.Aintroduçãoclasses.teste;

import academy.devdojo.maratonajava.Aintroduçãoclasses.domain.Pessoa;

public class PessoaTeste02 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        Pessoa pessoa2 = new Pessoa();

        System.out.println(pessoa.nome);
        System.out.println(pessoa.sexo);
        System.out.println(pessoa.idade);

        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=");

        pessoa2.nome = "Romero";
        System.out.println(pessoa2.nome);
        System.out.println(pessoa2.sexo);
        System.out.println(pessoa2.idade);
    }
}

