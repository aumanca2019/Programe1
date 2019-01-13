package kLargestElements;


public class LargestAndSmallestWithFor {
    public static void main(String[] args) {

        largestElement();
    }

    static int largestElement;
    static int arr[] = new int[]{45, 235, 98, 56, 34, 67, 14, 89};

    public static int largestElement() {

        int max1 = arr[0];
        int max2 = arr[0];
        int max3 = arr[0];


        for (int i = 0; i < arr.length; i++) {
            if (max1 < arr[i]) {
                max1 = arr[i];

            } else if (arr[i] > max2) {
                max2 = arr[i];

            } else if (arr[i] > max3) {
                max3 = arr[i];


            }


        }
        System.out.println("largest elements " + " " + max1 + " " + max2 + " " + max3);

        return largestElement;
    }


}



































