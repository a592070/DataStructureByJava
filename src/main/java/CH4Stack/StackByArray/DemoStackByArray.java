package CH4Stack.StackByArray;

import java.util.Arrays;

public class DemoStackByArray {
    private int[] stack;
    private int top;
    private int stackSize;

    public DemoStackByArray(int stackSize) {
        this.stack = new int[stackSize];
        this.stackSize = stackSize;
        this.top = -1;
    }
    public boolean isEmpty(){
        return top==-1;
    }

    public void push(int data){
        if(top > stackSize){
            System.err.println("out of range");
        }else{
            top++;
            stack[top] = data;
//            System.out.println(top +","+ stack[top]);
        }
    }
    public int pop(){
        if(this.isEmpty()){
            return -1;
        }else{
            return stack[top--];
        }
    }
    public int getSize(){
        return top+1;
    }

    @Override
    public String toString() {
        if(top > 0) {
            int[] tmp = new int[top+1];
            for (int i = 0; i <= top; i++) {
                tmp[i] = stack[i];
            }
            return Arrays.toString(tmp);
        }else return "Empty array";

    }
}
