package academy.devdojo.maratonajava.exercicios.domain;

public class pessoa {
    private String nome;
    private int idade;

    public String apresentar() {
        String sentece = "Meu nome é " + nome + " e tenho " + idade + " anos.";
        return sentece;
    }

    public pessoa(int idade, String nome) {
        this.idade = idade;
        this.nome = nome;
    }
}
