package kLargestElements;

public class LargestAndSmallestWithFor {
    public static void main(String[] args) {
        System.out.println("LargestElement = " + largestElement());
    }


    static int arr[] = new int[]{45, 235, 98, 56, 34, 67, 14, 89};

        public static int largestElement() {

            int max = arr[0];


            for (int i = 0; i < arr.length; i++)
                if (max < arr[i])
                    max = arr[i];

                return max;
        }
    }



















