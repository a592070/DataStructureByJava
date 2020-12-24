package CH2MatrixArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DemoSparseMatrix {
    public static List<int[]> sparseMatrix(int[][] arrA){
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

        /*// arrC (i,j,itemValue )
        int[][] arrC = new int[nonZeroNum+1][3];
        arrC[0][0] = lenA;
        arrC[0][1] = arrA[0].length;
        arrC[0][2] = nonZeroNum;
        int tmp = 1;
        for (int i = 0; i < arrA.length; i++) {
            for (int j = 0; j < arrA[i].length; j++) {
                if(arrA[i][j] != 0){
                    arrC[tmp][0] = i;
                    arrC[tmp][1] = j;
                    arrC[tmp][2] = arrA[i][j];
                    tmp++;
                }
            }
        }
        return arrC;*/

        List<int[]> list = new ArrayList<>();
        list.add(new int[]{lenA , arrA[0].length , 0});
        for (int i = 0; i < arrA.length; i++) {
            for (int j = 0; j < arrA[i].length; j++) {
                if(arrA[i][j] != 0){
                    list.add(new int[]{i,j,arrA[i][j]});
                    list.get(0)[2] ++;
                }
            }
        }

        return list;
    }

    public static void main(String[] args) {
        int[][] arrA = {{1,2,3,0,0},{4,5,6,0,0}};
        List<int[]> list = sparseMatrix(arrA);

        if(list != null) {
            for (int i = 0; i < list.size(); i++) {
                int[] tmp = list.get(i);
                System.out.println(Arrays.toString(tmp));
            }
        }
    }
}
