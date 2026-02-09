package academy.devdojo.maratonajava.javacore.introducao;

public class Aula08ArraysMultidimensionais02 {
    public static void main(String[] args) {
        int[][] arr = new int[3][];

        arr[0] = new int[2];
        arr[1] = new int[3];
        arr[2] = new int[4];

        int[][] arr2 = new int[][]{{1,2},{3,4,5},{6,7,8,9}};

        for (int[] x : arr2) {
            for (int z : x) {
                System.out.println(z);
            }
        }
    }
}
