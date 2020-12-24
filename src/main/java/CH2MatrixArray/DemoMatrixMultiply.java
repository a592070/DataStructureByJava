package CH2MatrixArray;

import java.util.Arrays;

public class DemoMatrixMultiply {
    public static int[][] matrixMultiply(int[][] arrA , int[][] arrB) {
        // arrA[M*N] arrB[N*P] arrC[M*P]
        int lenM = arrA.length;
        int lenN = arrB.length;
        int lenP  =arrB[0].length;

        if (lenM <= 0 || lenN <= 0) {
            System.err.println("format error");
            return null;
        }
        // check every column length equals
        for (int i = 0; i < lenM; i++) {
            int tmp = arrA[0].length;
            if (tmp != arrA[i].length) {
                System.err.println("arrA format error");
                return null;
            }
        }
        for (int i = 0; i < lenN; i++) {
            int tmp = arrB[0].length;
            if (tmp != arrB[i].length) {
                System.err.println("arrB format error");
                return null;
            }
        }
        // check arrA column length and arrB row length equals
        for (int i = 0; i < lenM; i++) {
            if(arrA[i].length != lenN){
                System.err.println("format error");
                return null;
            }
        }

        int[][] arrC = new int[lenM][lenP];
        for (int i = 0; i < lenM; i++) {
            for (int j = 0; j < lenP; j++) {
                int tmp = 0;
                for (int k = 0; k < lenN; k++) {
                    tmp += arrA[i][k] * arrB[k][j];
                }
                arrC[i][j] = tmp;
            }
        }
        return arrC;
    }

    public static void main(String[] args) {
        int[][] arrA = {{1,2,3},{4,5,6}};
        int[][] arrB = {{1,2},{3,4},{5,6}};
        int[][] arrC = matrixMultiply(arrA,arrB);

        if(arrC != null) {
            for (int i = 0; i < arrC.length; i++) {
                System.out.println(Arrays.toString(arrC[i]));
            }
        }
    }
}
