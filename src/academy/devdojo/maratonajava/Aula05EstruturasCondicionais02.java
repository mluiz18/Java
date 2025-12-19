package academy.devdojo.maratonajava;

public class Aula05EstruturasCondicionais02 {
    public static void main(String[] args) {
        int idade = 14;

        if (idade < 15) {
            System.out.println("Categoria Infantil");
        } else if (idade < 18){
            System.out.println("Categoria Juvenil");
        } else if (idade >= 18) {
            System.out.println("Categoria Adulto");
        }

    }
}
