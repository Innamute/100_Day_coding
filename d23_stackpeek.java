
package mutmainna;

import java.util.Stack;

public class d23_stackpeek {
    public static void main(String[] args) {
        Stack<Double> myStack = new Stack<>();
        myStack.push(3.14);
        myStack.push(256.0);
        myStack.push(25.8);
        double value = myStack.peek();
        System.out.println("PEEK:"+value);
        System.out.println(myStack);
    }
}
    
