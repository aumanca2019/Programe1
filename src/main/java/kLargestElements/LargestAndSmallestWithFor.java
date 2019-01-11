package kLargestElements;

public class LargestAndSmallestWithFor {

    private static Object getMaxElement;

    public static void main(String[] args) {
        int arr[] = {234, 56, 43, 5, 78, 89, 100};


            int max1 = arr[0];
            int max2 = arr[0];
            int max3 = arr[0];

            for (int i = 0; i < arr.length; i++) {
                if (arr[i] > max1) {
                    max1 = arr[i];
                    System.out.println(" max1 " + max1);
                } else if ((arr[i]!= max1) && (arr[i]> max2)){
                    max2 = arr[i];
                   System.out.println(" max2 " + max2);
                } else if ((arr[i]!= max1)&& (arr[i]!= max2)){
                    max3 = arr[i];
                    System.out.println(" max3 " + max3);
                }




                }


        }

    }



        //}
      //  return max1;









