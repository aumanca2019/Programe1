package ArraySort;


import org.junit.Test;

public class TestStackFromQueue {

    @Test
    public void TestStackFromQ() throws Exception {
        MyStack stackFQ1 = new MyStack(5);
        System.out.println(stackFQ1.toString());


        MyQueue queue2 = new MyQueue(5);
        System.out.println(queue2.toString());


        queue2.enqueue(9);
        queue2.enqueue(16);
        queue2.enqueue(45);
        queue2.enqueue(33);
        queue2.enqueue(8);
        System.out.println("Queue to be reversed : " + queue2.toString());


        int dequeued1 = queue2.dequeue();
        System.out.println(queue2.toString());
        stackFQ1.push(dequeued1);
        System.out.println(stackFQ1.toString());
        dequeued1 = queue2.dequeue();
        stackFQ1.push(dequeued1);
        System.out.println(stackFQ1.toString());
        dequeued1 = queue2.dequeue();
        int dequeued2 = queue2.dequeue();
        int dequeued3 = queue2.dequeue();
        stackFQ1.push(dequeued1);
        stackFQ1.push(dequeued2);
        stackFQ1.push(dequeued3);
        System.out.println("Stack from Queue: " + stackFQ1.toString());

        MyStack stackFQ2 = new MyStack(5);
        for (int i = 0; i < 5; i++) {
            int elementRemoved1 = stackFQ1.pop();

            stackFQ2.push(elementRemoved1);
            System.out.println("Queue reversed: " + stackFQ2.toString());


        }


    }
}
