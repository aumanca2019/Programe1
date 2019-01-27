package ArraySort;

import java.util.Arrays;

public class KlargestElement {


    static int[] array = new int[]{55, 334, 22, 234234, 514};

    public static void main(String[] args) {
        BubbleSort bs = new BubbleSort(array);
        int[] ints = bs.listNumbers();
        System.out.println(Arrays.toString(ints));

        int k = 3;
        kLargestElem(ints,k);

//            int k=0;
//            while ( k < 3){
//            for (int i = ints.length; i < ints.length; i--) {
//                System.out.println(Arrays.toString(ints));
//                k++;
//                break;


    }
    public static void kLargestElem(int[]ints,int k){

        for (int i = k-1; i < ints.length;i++){
            System.out.print(ints[i] + " ");
        }
    }

        }











