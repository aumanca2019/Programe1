package ArraySort;

import org.junit.Test;

import java.util.Arrays;

public class TestBubbleSort {

    @Test
    public void TestListToSort() {

        int [] list = {23, 55, 9, 25, 81, 0, 2};
        BubbleSort list1 = new BubbleSort(list);
        System.out.println(Arrays.toString(list));

        list1.listNumbers();
        System.out.println(Arrays.toString(list));
    }


    }