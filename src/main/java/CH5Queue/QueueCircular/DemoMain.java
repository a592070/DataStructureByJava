package CH5Queue.QueueCircular;

import java.util.Arrays;

public class DemoMain {
    public static void main(String[] args) {
        CircularQueue queue = new CircularQueue(10);
        queue.delete();

        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);
        queue.add(6);
        System.out.println(queue);
        System.out.println(Arrays.toString(queue.queue));

        System.out.println("del ele : "+queue.delete());
        System.out.println("del ele : "+queue.delete());
        System.out.println("del ele : "+queue.delete());
        System.out.println(queue);
        System.out.println(Arrays.toString(queue.queue));

        queue.add(7);
        queue.add(8);
        queue.add(9);
        queue.add(10);
        queue.add(11);
        queue.add(12);
        queue.add(13);
        System.out.println(queue);
        System.out.println(Arrays.toString(queue.queue));


    }
}
