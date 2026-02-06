package academy.devdojo.maratonajava.exercicios.arrays;

public class Arrays03 {
    public static void main(String[] args) {
        int[] arr = new int[]{-3,2,3,4,5,6,7,8,9,18};

        int maior = arr[0];
        int menor = maior;

        for (int j : arr) {
            if (j > maior) {
                maior = j;
            } else if ( j < menor) {
                menor = j;
            }
        }

        System.out.println("Maior número: " + maior);
        System.out.println("Menor número: " + menor);
    }
}
