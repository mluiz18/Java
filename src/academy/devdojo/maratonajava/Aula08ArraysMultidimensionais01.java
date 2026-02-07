package academy.devdojo.maratonajava;

public class Aula08ArraysMultidimensionais01 {
    public static void main(String[] args) {
        int[][] arrm = new int[3][3];

        arrm[0][0] = 1;
        arrm[0][1] = 2;
        arrm[0][2] = 3;

        arrm[1][0] = 4;
        arrm[1][1] = 5;
        arrm[1][2] = 6;

        arrm[2][0] = 7;
        arrm[2][1] = 8;
        arrm[2][2] = 9;

        for (int i = 0; i < arrm.length; i++) {
            for (int j = 0; j < arrm[i].length; j++) {
                System.out.println(arrm[i][j]);
            }
        }

        for (int[] x : arrm) {
            for (int z : x) {
                System.out.println(z);
            }
        }
    }

}
