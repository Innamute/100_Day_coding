
package mutmainna;

import java.util.LinkedList;
import java.util.Queue;

public class d25_Queuepeek {
    public static void main(String[] args) {
        Queue<Double> myQueue = new LinkedList<>();
        myQueue.offer(45.67);
        myQueue.offer(56.78);
        double value = myQueue.peek();
        System.out.println("PEEK" + value);
        System.out.println(myQueue);

    }
}


    
