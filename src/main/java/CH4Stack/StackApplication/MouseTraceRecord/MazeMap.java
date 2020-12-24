package CH4Stack.StackApplication.MouseTraceRecord;

import java.util.Arrays;

public class MazeMap {
    static int exitX = 8;
    static int exitY = 8;

    // 10 * 10 maze
    // [1,1] start , [8,8] exit
    public int[][] maze = {
            {1,1,1,1,1,1,1,1,1,1},
            {1,0,1,0,0,1,1,1,1,1},
            {1,0,1,1,0,0,0,0,1,1},
            {1,0,0,0,0,1,1,1,1,1},
            {1,1,1,0,1,1,0,0,0,1},
            {1,1,1,0,1,1,0,1,0,1},
            {1,0,1,0,1,1,0,1,0,1},
            {1,0,1,0,0,0,0,1,0,1},
            {1,0,0,0,1,1,1,0,0,1},
            {1,1,1,1,1,1,1,1,1,1}};

    public boolean checkExit(int x , int y){
        return (x==exitX && y==exitY);
    }
    public void printMap(){
        for (int i = 0; i < maze.length; i++) {
            System.out.println(Arrays.toString(maze[i]));
        }
    }
}
