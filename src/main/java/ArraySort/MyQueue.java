package ArraySort;

import java.util.Arrays;

public class MyQueue {

    private int head = 0;
    private int tail = 0;
    private int size;
    private int[] elements;

    private int maxSize;

    public MyQueue(int maxSize) {

        this.maxSize = maxSize;
        this.elements = new int[maxSize];

    }

    @Override
    public String toString() {
        return Arrays.toString(elements);
    }

    public boolean enqueue(int elementToAdd) {

        if (size == maxSize){
            return false;
        }


        elements[tail] = elementToAdd;
        tail++;
        size++;
        tail = tail%maxSize;
        return true;
    }

    public int dequeue() throws Exception {
        if (size==0) {
            System.out.println("Queue is empty");
            throw new Exception("Queue is empty");

        }
        int dequeuedElements = elements[head];
            elements[head] = 0;
            head++;
            size--;
            head = head%maxSize;
        

            return dequeuedElements;
        }

        public int peek (){

        int headOfQueue = elements[head];
            System.out.println("Head of queue = " + headOfQueue);
        return headOfQueue;
        }

}

