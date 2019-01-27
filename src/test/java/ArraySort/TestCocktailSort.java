package ArraySort;

import org.junit.Test;

import java.util.Arrays;

public class TestCocktailSort {

   @Test
    public void testCocktail() {
        int[] numListToSort = {23, 55, 9, 25, 81, 0, 2};
       System.out.println(Arrays.toString(numListToSort));
        CocktailSort cs = new CocktailSort();
        cs.cocktailSorting(numListToSort);
       System.out.println(Arrays.toString(numListToSort));


    }
}
