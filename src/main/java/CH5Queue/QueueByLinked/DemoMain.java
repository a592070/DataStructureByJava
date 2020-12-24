package CH5Queue.QueueByLinked;

public class DemoMain {
    public static void main(String[] args) {
        QueueLinkedList queue = new QueueLinkedList();

        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);
        System.out.println(queue);

        System.out.println("del ele : " + queue.delete());
        System.out.println("del ele : " + queue.delete());
        System.out.println("del ele : " + queue.delete());

        System.out.println(queue);

        queue.add(6);
        queue.add(7);
        queue.add(8);
        System.out.println(queue);
    }
}
