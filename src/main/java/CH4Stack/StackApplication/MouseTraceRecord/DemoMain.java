package CH4Stack.StackApplication.MouseTraceRecord;

public class DemoMain {
    static MazeMap map = new MazeMap();
    static TraceRecord trace = new TraceRecord();
    public static void main(String[] args) {
        map.printMap();
        System.out.println("===============================================");

        int x = 1;
        int y = 1;

        trace.insert(x,y);
        while(x<=map.exitX && y<=map.exitY){
            map.maze[x][y] = 2;
            if(map.checkExit(x,y)) {
                break;
            }
            // Up
            else if (map.maze[x-1][y] == 0){
                x--;
                trace.insert(x,y);
            }
            // Down
            else if(map.maze[x+1][y] == 0){
                x++;
                trace.insert(x,y);
            }
            // Left
            else if(map.maze[x][y-1] == 0){
                y--;
                trace.insert(x,y);
            }
            // Right
            else if(map.maze[x][y+1] == 0){
                y++;
                trace.insert(x,y);
            }
            // previous step
            else{
                trace.delete();
                x = trace.last.x;
                y = trace.last.y;
            }
        }
        map.printMap();

    }
}
