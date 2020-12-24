package CH4Stack.StackApplication.EightQueen;

import java.util.Arrays;

public class EightQueenMain {
    static int size = 4;
    static int[] queen = new int[size];
    static int[][] map = map();
    static int count = 0;
    public static void main(String[] args) {
//        printMap(map);

        PlaceList list = new PlaceList();

        putQueen(0);
        System.out.println(count);

    }

    public static void putQueen(int value){
        int i = 0;
        while(i<size){
            if(!check(i,value)){
                queen[value] = i;
                if(value == size-1){
//                    printMap(map);
//                    map = map();
                    System.out.println(Arrays.toString(queen));
                    System.out.println("===============================");
                    count++;
                }else{
                    putQueen(value+1);
                }
            }
            i++;
        }
    }

    private static boolean check(int row, int col) {
        int i = 0;
        boolean f = false;
        int offsetRow = 0;
        int offsetCol = 0;
        while(!f && i<col){
            offsetCol = Math.abs(i - col);
            offsetRow = Math.abs(queen[i] - row);
            if((queen[i] == row) || (offsetRow == offsetCol)){
                f = true;
            }
            i++;
        }
        return f;
    }

    public static int[][] map(){
//        return new int[][]{
//                {0,0,0,0,0,0,0,0},
//                {0,0,0,0,0,0,0,0},
//                {0,0,0,0,0,0,0,0},
//                {0,0,0,0,0,0,0,0},
//                {0,0,0,0,0,0,0,0},
//                {0,0,0,0,0,0,0,0},
//                {0,0,0,0,0,0,0,0},
//                {0,0,0,0,0,0,0,0},};
        return new int[size][size];
    }

    public static void printMap(int[][] map){
        for (int i = 0; i < queen.length; i++) {
            map[i][queen[i]] = 1;
        }
        for (int i = 0; i < map.length; i++) {
            System.out.println(Arrays.toString(map[i]));
        }
        System.out.println("==============================");
    }
}
