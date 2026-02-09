package academy.devdojo.maratonajava.javacore.introducao;

public class Aula07Arrays03 {
    public static void main(String[] args) {
        int[] num = new int[3];
        int[] num2 = {1,2,3,4,5};
        int[] num3 = new int[]{1,2,3,4,5};

        for (int i : num2) {
            System.out.println(i);
        }
    }
}
