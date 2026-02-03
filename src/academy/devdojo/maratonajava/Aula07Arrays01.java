package academy.devdojo.maratonajava;

public class Aula07Arrays01 {
    public static void main(String[] args) {
        int[] idades = new int[10];
        for (int i = 0; i < 10; i++) {
            idades[i] = ++i;
        }
        System.out.println(idades[0]);
    }
}
