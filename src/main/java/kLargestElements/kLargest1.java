package kLargestElements;

public class kLargest1 {
    public static void main(String[] args) {
        int[]array = new int[]{55,334,22,234234,514};
        int kMax = 3;

        for (int i =0;i < kMax;i++){
            int max = getMax(array);
            System.out.println(max);
            array = removeElementFromArray(max,array);
        }
    }
    static int getMax(int[]array){
        int max = array[0];
        for(int elem:array){
            if (elem > max){
                max = elem;
            }
        }
        return max;
    }
    static int[] removeElementFromArray (int element,int[]oldArray){
        int [] newArray = new int[oldArray.length - 1];

        int index = 0;
        for ( int i = 0; i < oldArray.length; i++) {
            if (element != oldArray[i]){
                newArray[index] = oldArray[i];
                index++;
            }
        }
        return newArray;
    }
}
