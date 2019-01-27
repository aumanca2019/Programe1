package ArraySort;

import java.util.Arrays;

public class BubbleSort {

    private final int[] numbers;

    public BubbleSort(int[] numbers) {
        this.numbers = numbers;
    }

    @Override
    public String toString() {
        return "BubbleSort{" +
                "numbers=" + Arrays.toString(numbers) +
                '}';
    }

    public int[] listNumbers() {

        for (int i = 0; i < numbers.length-1; i++) {

            for (int j = 0; j < numbers.length-i-1; j++) {

                if (numbers[j] > numbers[j+1]) {

                    int auxElement = numbers[j];

                    numbers[j] = numbers[j+1];

                    numbers[j+1] = auxElement;

                    System.out.println(Arrays.toString(numbers));

                }
            }

        }





        return numbers;

    }

}








