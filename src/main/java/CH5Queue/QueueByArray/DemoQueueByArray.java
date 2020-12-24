package CH5Queue.QueueByArray;

import java.util.Arrays;

public class DemoQueueByArray {
    private int max;
    private int front = 0;
    private int rear = -1;
    private int[] queue;

    public DemoQueueByArray(int max) {
        this.max = max;
        this.queue = new int[max];
    }
    public void add(int ele){
        rear++;
        queue[rear] = ele;
    }

    /**
     *  每次刪除都將元素往前移一位，size過大時造成耗時
     *
     * @return  first element
     */
    public int delete(){
        int tmp = queue[front];
        queue[front] = 0;
        this.putQueue();
        return tmp;
    }
    public void putQueue(){
        for (int i = 0; i < rear; i++) {
            int tmp = queue[i+1];
            queue[i] = tmp;
        }
        queue[rear] = 0;
        rear--;
    }
    public int getFront(){
        return queue[front];
    }
    public boolean isEmpty(){
        return rear==-1;
    }

    public void printQueue(){
        StringBuilder str = new StringBuilder();
        str.append("[");
        for (int i = 0; i < rear; i++) {
            str.append(queue[i]+", ");
        }
        str.append(queue[rear]+"]");
        System.out.println(str);
    }

    @Override
    public String toString() {
        return Arrays.toString(queue);
    }
}
