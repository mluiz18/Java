package academy.devdojo.maratonajava.exercicios.arrays;

public class Arrays01 {
    public static void main(String[] args) {
        int[] arr = new int[5];
        int n = 10;

        for (int i = 0; i < 5; i++) {
            arr[i] = n;
            n += 10;
        }

        int s = 0;
        for (int j : arr) {
            s += j;
        }

        System.out.println(s);
    }
}
