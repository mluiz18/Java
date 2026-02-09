package academy.devdojo.maratonajava.javacore.introducao;

public class Aula07Arrays02 {
    public static void main(String[] args) {
        String[] nomes = new String[3];
        nomes[0] = "Miguel";
        nomes[1] = "Ricardo";
        nomes[2] = "João";

        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]);
        }
    }
}
