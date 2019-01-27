package kLargestElements;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class LargestElements {
    public static void main(String[] args) {


        Integer arr[] = new Integer[]{5, 9, 23, 78, 67, 88};
        int k = 3;
        int k1 = 4;

        kLargest(arr, k);
        System.out.println();
        kSmallest(arr, k1);


    }

   // public int getValidUserInput() {
     //   Scanner in = new Scanner((System.in));
       // System.out.println("Input Number: ");
        //int i;
        //while (!in.hasNext()){
          //  System.out.println("Try again");
        //}
        //Scanner reader = new Scanner(System.in);
        //System.out.println("Input number: ");
        //i = in.nextInt();
          //  return i;

    //}





    public static void kLargest(Integer[]arr, int k) {
            Arrays.sort(arr,Collections.reverseOrder());

        for (int i = 0; i < k; i++) {
            //int max = arr[0];
            //if (arr[i] > max) {


                System.out.print(arr[i] + " ");
            }

        }
        //public static int kSmallest(Integer[] arr,int k1){
        // Arrays.sort(arr);

        //return arr[k1-1];
    public static void kSmallest (Integer[] arr, int k1){
        Arrays.sort(arr);
        for ( int i1 =0 ; i1 < k1; i1 ++){
            System.out.print(arr[i1] + " ");
        }


    }

}






