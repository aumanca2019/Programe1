package ArraySort;

import org.junit.Test;

public class TestMyQueue2 {
    @Test
    public void testEnqueue() throws Exception {
        MyQueue2 queue1 = new MyQueue2(5);

        boolean enqueueResult = queue1.enqueue(1);
        System.out.println("Rezultat adaugare element: " + enqueueResult);
        System.out.println(queue1.toString());

        queue1.enqueue(1);
        queue1.enqueue(2);
        queue1.enqueue(3);
        queue1.enqueue(9);
        queue1.enqueue(10);
        System.out.println(queue1);

        int dequeuedElement = queue1.dequeue();
        System.out.println(queue1.toString());
        dequeuedElement = queue1.dequeue();
        System.out.println(queue1.toString());
       dequeuedElement =  queue1.dequeue();
       System.out.println(queue1.toString());
        queue1.enqueue(10);
        System.out.println(queue1.toString());
        queue1.enqueue(17);
        queue1.enqueue(19);
        System.out.println(queue1.toString());
        queue1.enqueue(20);
        System.out.println(queue1.toString());
        dequeuedElement = queue1.dequeue();
        System.out.println(queue1.toString());
    }
}
