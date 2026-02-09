package academy.devdojo.maratonajava.javacore.introducao;

public class Aula06EstruturasDeRepetição01 {
    public static void main(String[] args) {
        int count = 0;
        while (count < 10) {
            System.out.println(count++);
        }

        count = 0;

        System.out.println("Do - while");
        do {
            System.out.println(++count);
        } while (count < 10);

        System.out.println("for");
        for (int i = 0; i <= 10; ++i) {
            System.out.println(i);
        }
    }
}
