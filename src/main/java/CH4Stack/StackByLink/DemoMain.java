package CH4Stack.StackByLink;


public class DemoMain {
    public static void main(String[] args) {
        DemoStackByLink list = new DemoStackByLink();
        list.push("1");
        list.push("2");
        list.push("3");
        list.push("4");
        list.push("5");
        System.out.println(list.len);
        System.out.println(list);

        for (int i = 0; i < list.len; i++) {
            System.out.print(list.getNode(i)+"\t");
        }
        System.out.println();

        System.out.println(list.pop());
        System.out.println(list.pop());
        System.out.println(list.pop());

        System.out.println(list.len);
        System.out.println(list);

        list.push("1");
        list.push("2");
        System.out.println(list.len);
        System.out.println(list);

    }
}
