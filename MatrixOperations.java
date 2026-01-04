import java.util.Scanner;

class MatrixOperations {

     static void addition(int[][] a, int[][] b, int r, int c) {
        int[][] sum = new int[r][c];
        System.out.println("Addition:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                sum[i][j] = a[i][j] + b[i][j];
                System.out.print(sum[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void subtraction(int[][] a, int[][] b, int r, int c) {
        int[][] sub = new int[r][c];
        System.out.println("Subtraction:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                sub[i][j] = a[i][j] - b[i][j];
                System.out.print(sub[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void multiplication(int[][] a, int[][] b, int r1, int c1, int c2) {
        int[][] mul = new int[r1][c2];
        System.out.println("Multiplication:");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                for (int k = 0; k < c1; k++) {
                    mul[i][j] += a[i][k] * b[k][j];
                }
                System.out.print(mul[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void transpose(int[][] a, int r, int c) {
        System.out.println("Transpose:");
        for (int i = 0; i < c; i++) {
            for (int j = 0; j < r; j++) {
                System.out.print(a[j][i] + " ");
            }
            System.out.println();
        }
    }

    static void checkSquare(int r, int c) {
        if (r == c)
            System.out.println("Matrix is Square");
        else
            System.out.println("Matrix is Not Square");
    }

    static void checkDiagonal(int[][] a, int r, int c) {
        boolean diagonal = true;
        if (r != c) {
            diagonal = false;
        } else {
            for (int i = 0; i < r; i++) {
                for (int j = 0; j < c; j++) {
                    if (i != j && a[i][j] != 0) {
                        diagonal = false;
                        break;
                    }
                }
            }
        }
        System.out.println(diagonal ? "Matrix is Diagonal" : "Matrix is Not Diagonal");
    }

    static void checkIdentity(int[][] a, int r, int c) {
        boolean identity = true;
        if (r != c) {
            identity = false;
        } else {
            for (int i = 0; i < r; i++) {
                for (int j = 0; j < c; j++) {
                    if ((i == j && a[i][j] != 1) || (i != j && a[i][j] != 0)) {
                        identity = false;
                        break;
                    }
                }
            }
        }
        System.out.println(identity ? "Matrix is Identity" : "Matrix is Not Identity");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows and columns: ");
        int r = sc.nextInt();
        int c = sc.nextInt();

        int[][] a = new int[r][c];
        int[][] b = new int[r][c];

        System.out.println("Enter Matrix A:");
        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                a[i][j] = sc.nextInt();

        System.out.println("Enter Matrix B:");
        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                b[i][j] = sc.nextInt();

        addition(a, b, r, c);
        subtraction(a, b, r, c);

        if (r == c)
            multiplication(a, b, r, c, c);
        else
            System.out.println("Multiplication not possible");

        transpose(a, r, c);
        checkSquare(r, c);
        checkDiagonal(a, r, c);
        checkIdentity(a, r, c);
    }
}
