package CH2MatrixArray;

import java.util.Arrays;

public class DemoMatrixAdd {
    public static int[][] matrixAdd(int[][] arrA , int[][] arrB){
        int lenA = arrA.length;
        int lenB = arrB.length;

        if (lenA <=0 || lenB <=0 || (lenA != lenB)) {
            System.err.println("format error cannot add");
            return null;
        }
        // check arrA、arrB column length equals
        for (int i = 0; i < arrA.length; i++) {
            if(arrA[i].length != arrB[i].length){
                System.err.println("format error cannot add");
                return null;
            }
        }


        int[][] arrC = new int[lenA][arrA[0].length];
        for (int i = 0; i < arrA.length; i++) {
            for (int j = 0; j < arrA[i].length; j++) {
                arrC[i][j] = arrA[i][j] + arrB[i][j];
            }
        }
        return arrC;
    }

    public static void main(String[] args) {
        int[][] arrA = {{3,7,0,6,2}};
        int[][] arrB = {{1,5,2,0,9}};
        int[][] arrC = matrixAdd(arrA,arrB);

        if(arrC != null) {
            for (int i = 0; i < arrC.length; i++) {
                System.out.println(Arrays.toString(arrC[i]));
            }
        }
    }
}
