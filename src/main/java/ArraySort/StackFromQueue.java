package ArraySort;

import java.util.Arrays;


public class StackFromQueue {

    private int head = 0;
    private int tail = 0;
    private int size;
    private int[] queue2;

    private int maxSize;
    private int top;
    private int[] stackFQ;

    public StackFromQueue(int size) {
        this.top = -1;
        this.size = size;
        this.stackFQ = new int[size];

    }

    @Override
    public String toString() {

        return Arrays.toString(stackFQ);
    }


}
