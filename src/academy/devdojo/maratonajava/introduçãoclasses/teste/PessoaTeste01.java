package academy.devdojo.maratonajava.introduçãoclasses.teste;

import academy.devdojo.maratonajava.introduçãoclasses.domain.Pessoa;

public class PessoaTeste01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.idade = 18;
        pessoa.nome = "Miguel";
        pessoa.sexo = 'M';
    }
}
