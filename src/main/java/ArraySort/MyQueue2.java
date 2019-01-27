package ArraySort;

import java.util.Arrays;

public class MyQueue2 {

    private int[]queue;
    private int head;
    private int tail;
    private int size;

    private int maxSize;

    /**Activitate de acasa
     * inlocuiti utilizarea variabilei size cu verifiari in functie de head si tail.
     * Hint daca se suprapun, size = 0, daca sunt la dif de 1, queue e plin.
     */

    // Activitate de curs:
    // 1.afisati array intreg
    // 2.Introducti functionalitate de reutilizare array: indexare circulare

    public MyQueue2(int maxSize){
        this.queue = new int[maxSize];
        this.maxSize = maxSize;


    }
    @Override
    public String toString() {
        return Arrays.toString(queue) + "Index head: "  +  head + " Index tail: " + tail;
    }


    public boolean enqueue(int element){
        if (size == maxSize){
            return false;
        }

        queue[tail] = element;
        tail++;
        size++;
        tail = tail%maxSize;
        return true;
    }

    public int dequeue() throws Exception {
        if (size ==0){
            System.out.println("Queue is empty");
            throw new Exception("Queue is empty");
        }
        int dequeuedElement = queue[head];
        queue[head] =0;
        head++;
        size--;
        head = head%maxSize;
        return dequeuedElement;
    }



    }







