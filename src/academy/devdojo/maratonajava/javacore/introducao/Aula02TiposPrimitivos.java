package academy.devdojo.maratonajava.javacore.introducao;

public class Aula02TiposPrimitivos {
    public static void main(String[] args) {
        int idade = 18;
        long numeroGrande = 10000000;
        double salarioDouble = 2000;
        float salarioFloat = 2000;
        byte idadeByte = 10;
        short idadeShort = 10;
        boolean verdadeiro = true;
        boolean falso = false;
        char caractere = 62;

        System.out.println("A idade é: " + idade + " anos");
        System.out.println(falso);
        System.out.println(idadeByte);

        int numero = (int) 100000000000L;
        System.out.println(numero);

        String nome = "Goku";
        System.out.println("Oi, meu nome é " + nome);

    }
}
