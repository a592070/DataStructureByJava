package CH2MatrixArray;

import java.util.Arrays;

public class DemoTransformationMatrix {
    public static int[][] transformationMatrix(int[][] arrA){
        int lenA = arrA.length;
        if (lenA <=0) {
            System.err.println("format error");
            return null;
        }
        // check every column length equals
        for (int i = 0; i < arrA.length; i++) {
            int tmp = arrA[0].length;
            if (tmp != arrA[i].length) {
                System.err.println("arrA format error");
                return null;
            }
        }

        int[][] arrC = new int[arrA[0].length][lenA];
        for (int i = 0; i < arrC.length; i++) {
            for (int j = 0; j < arrC[i].length; j++) {
                arrC[i][j] = arrA[j][i];
            }
        }
        return arrC;
    }

    public static void main(String[] args) {
        int[][] arrA = {{1,2,3},{4,5,6}};
        int[][] arrC = transformationMatrix(arrA);

        if(arrC != null) {
            for (int i = 0; i < arrC.length; i++) {
                System.out.println(Arrays.toString(arrC[i]));
            }
        }
    }
}
