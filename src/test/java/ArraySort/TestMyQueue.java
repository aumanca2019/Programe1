package ArraySort;

import org.junit.Test;


public class TestMyQueue {



    @Test
    public void TestMyQueue() throws Exception {


        MyQueue list2 = new MyQueue(5);
        System.out.println(list2);

        list2.enqueue(7);
        list2.enqueue(10);
        list2.enqueue(5);
        System.out.println(list2);

        int dequeuedElements =  list2.dequeue();
        System.out.println(list2.toString());
        dequeuedElements =  list2.dequeue();
        System.out.println(list2.toString());
        list2.enqueue(9);
        list2.enqueue(18);
        list2.enqueue(20);

        System.out.println(list2.toString());
       int headOfQueue = list2.peek();
        System.out.println("Head of Queue = "  + headOfQueue);



    }
}
