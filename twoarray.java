package Java;
import java.util.Scanner;

public class twodarray {
    public static void nhap(int array[][], int n, int m) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.printf("[%d][%d] = ", i, j);
                array[i][j] = scanner.nextInt();
            }
        }
    }

    public static void in(int array[][], int n, int m) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.printf("%d ", array[i][j]);
            }
            System.out.println();
        }
    }

    public static int[][] sum_matrix(int a[][], int b[][], int n, int m) {
        int[][] sum = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                sum[i][j] = a[i][j] + b[i][j];
            }
        }
        return sum;
    }

    public static int[][] minus_matrix(int a[][], int b[][], int n, int m) {
        int[][] minus = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                minus[i][j] = a[i][j] - b[i][j];
            }
        }
        return minus;
    }

    public static int[][] transposition(int[][] array, int n, int m) {
        int[][] transpose = new int[m][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                transpose[j][i] = array[i][j];
            }
        }
        return transpose;
    }

    public static int[][] multi_matrix(int a[][], int b[][], int n, int m, int p) {
        int[][] product = new int[n][p];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < p; j++) {
                product[i][j] = 0;
                for (int k = 0; k < m; k++) {
                    product[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        return product;
    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap n hang m cot cua ma tran a:");
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] a = new int[n][m];
        nhap(a, n, m);

        System.out.println("Nhap p hang va q cot cua ma tran b:");
        int p = scanner.nextInt();
        int q = scanner.nextInt();
        int[][] b = new int[p][q];
        nhap(b, p, q);
        System.out.println("Cac phep toan ma tran: ");
        System.out.println("Ma tran a:");
        in(a, n, m);

        System.out.println("Ma tran b:");
        in(b, p, q);
        
        int[][] transpose = transposition(a, n, m);
        System.out.println("Transpose cua a:");
        in(transpose, m, n);
        
        if (n == p && m == q) {
            int[][] sum = sum_matrix(a, b, n, m);
            System.out.println("Tong hai ma tran:");
            in(sum, n, m);

            int[][] minus = minus_matrix(a, b, n, m);
            System.out.println("Tru hai ma tran:");
            in(minus, n, m);
        } else {
            System.out.println("Khong the thuc hien phep cong hay tru vi khong cung cap");
        }

        if (m == p) {
            int[][] product = multi_matrix(a, b, n, m, q);
            System.out.println("Nhan 2 ma tran:");
            in(product, n, q);
        } else {
            System.out.println("Khong the thuc hien phep nhan do cot cua a khac so hang cua b");
        }
        scanner.close();
    }
}
