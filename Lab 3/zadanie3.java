import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;
import static java.lang.Math.*;

public class Main {

    private static void doMatricMultiplication(int[][] matrix1, int[][] matrix2, int rows1, int columns1, int columns2,
                                               int[][] result) {

        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < columns2; j++) {
                for (int k = 0; k < columns1; k++) {
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
    }
    private static void doPrintResultMatric(int[][] result) {
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[1].length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj n: ");
        int n = scan.nextInt();
        if (n < 1 || n > 10) {
            System.out.println("Podaj n z zakresu [1:10]: ");
            n = scan.nextInt();
        }
        System.out.println("Podaj m: ");
        int m = scan.nextInt();
        if (m < 1 || m > 10) {
            System.out.println("Podaj m z zakresu [1:10]: ");
            m = scan.nextInt();
        }
        System.out.println("Podaj k: ");
        int k = scan.nextInt();
        if (k < 1 || k > 10) {
            System.out.println("Podaj k z zakresu [1:10]: ");
            k = scan.nextInt();
        }

        int a[][] = new int[m][n];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = ((int) (Math.random()*10));
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();

        int b[][] = new int[n][k];
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[i].length; j++) {
                b[i][j] = ((int) (Math.random()*10));
                System.out.print(b[i][j] + " ");
            }
            System.out.println();
        }
        int rows1 = a.length;
        int columns1 = a[0].length;
        int rows2 = b.length;
        int columns2 = b[1].length;
        int[][] result = new int[rows1][columns2];

        doMatricMultiplication(a, b, rows1, columns1, columns2, result);
        System.out.println();
        doPrintResultMatric(result);

    }
}