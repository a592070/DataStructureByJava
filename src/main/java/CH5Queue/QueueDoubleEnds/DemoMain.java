package CH5Queue.QueueDoubleEnds;



public class DemoMain {
    public static void main(String[] args) {
        Deques deques = new Deques();

        deques.addFront(1);
        deques.addFront(2);
        deques.addFront(3);
        deques.addRear(9);
        deques.addRear(8);
        deques.addRear(7);
        System.out.println(deques);

        System.out.println("pop front : "+deques.popFront().data);
        System.out.println("pop front : "+deques.popFront().data);
        System.out.println("pop rear : "+deques.popRear().data);
        System.out.println("pop rear : "+deques.popRear().data);
        System.out.println(deques);
    }
}
