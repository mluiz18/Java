package academy.devdojo.maratonajava.Aintroduçãoclasses.teste;

import academy.devdojo.maratonajava.Aintroduçãoclasses.domain.Pessoa;

public class PessoaTeste01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();

        pessoa.idade = 18;
        pessoa.nome = "Miguel";
        pessoa.sexo = 'M';

        System.out.println(pessoa.idade);
        System.out.println(pessoa.nome);
        System.out.println(pessoa.sexo);
    }
}
