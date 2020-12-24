package CH4Stack.StackByArray;

public class DemoMain {
    public static void main(String[] args) {
        DemoStackByArray arr = new DemoStackByArray(5);
        arr.push(5);
        arr.push(4);
        arr.push(3);
        arr.push(2);
        arr.push(1);
//        arr.push(0);

        System.out.println(arr.getSize());
        System.out.println(arr.toString());

        int a = arr.pop();
        int b = arr.pop();
        System.out.println("pop out "+a);
        System.out.println("pop out "+b);
        System.out.println(arr.getSize());
        System.out.println(arr);
    }
}
