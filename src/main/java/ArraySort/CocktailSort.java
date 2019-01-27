package ArraySort;

import java.util.Arrays;

public class CocktailSort {


    void cocktailSorting(int[] numList) {
        boolean swap = true;
        int top = 0;
        int bottom = numList.length;

        while (swap == true) {
            swap = false;
            for (int i = top; i < bottom - 1; ++i) {
                if (numList[i] > numList[i + 1]) {
                    int aux = numList[i];
                    numList[i] = numList[i + 1];
                    numList[i + 1] = aux;
                    swap = true;
                }

            }
            if (swap == false)
                break;
            swap = false;
            bottom = bottom - 1;

            for (int i = bottom - 1; i >= top; i--) {
                if (numList[i] > numList[i + 1]) {
                    int aux = numList[i];
                    numList[i] = numList[i + 1];
                    numList[i + 1] = aux;
                    swap = true;
                }
            }
            top++;

        }
        System.out.println(Arrays.toString(numList));
    }

}
