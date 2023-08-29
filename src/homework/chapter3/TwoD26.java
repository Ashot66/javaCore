package homework.chapter3;

public class TwoD26 {
    public static void main(String[] args) {
        int[][] ars = new int[4][5];
        int i, j, k = 0;
        for (i = 0; i < 4; i++) {
            for (j = 0; j < 5; j++) {
                System.out.print((ars[i][j] = k) + " ");
                k++;
            }
            System.out.print("\n");
        }
    }
}
