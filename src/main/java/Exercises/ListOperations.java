package Exercises;

public class ListOperations {
    public static void main(String[] args) {
        Integer[] lotsOfNumber = new Integer[]{44, 1, 5, 8, 21, 33, 9, 12, 56,};

        PrintOnAfterAnother(lotsOfNumber);
        System.out.println();
        printIntegersBackwards(lotsOfNumber);
        System.out.println();
        printOddIntegers(lotsOfNumber);
        System.out.println();
        printIntegersDivisibleBy3(lotsOfNumber);
        System.out.println();
        printSumOfAllIntegers(lotsOfNumber);
        System.out.println();
        printSumOfFirstFourIntegers(lotsOfNumber);
        System.out.println();
        printSumOfFirstFiveIntegersBiggerThan2(lotsOfNumber);
        System.out.println();
        printNumberOfFirstIntegersWithSum10(lotsOfNumber);
        System.out.println();
        printAverageOfTheList(lotsOfNumber);

    }


    public static void PrintOnAfterAnother(Integer lotsOfNumber[]) {

        for (int i = 0; i < lotsOfNumber.length; i++) {
            System.out.print(lotsOfNumber[i] + " ");
        }
    }

    public static void printIntegersBackwards(Integer lotsOfNumber[]) {

        for (int i = lotsOfNumber.length - 1; i >= 0; i--) {
            System.out.print(lotsOfNumber[i] + " ");

        }
    }

    public static void printOddIntegers(Integer lotsOfNumber[]) {

        for (int i = 0; i < lotsOfNumber.length; i++) {
            if (lotsOfNumber[i] % 2 != 0) {
                System.out.print(lotsOfNumber[i] + " ");

            }
        }
    }

    public static void printIntegersDivisibleBy3(Integer lotsOfNumber[]) {

        for (int i = 0; i < lotsOfNumber.length; i++) {
            if (lotsOfNumber[i] % 3 == 0) {
                System.out.print(lotsOfNumber[i] + " ");

            }

        }
    }

    public static void printSumOfAllIntegers(Integer lotsOfNumber[]) {
        int sum = 0;
        for (int i = 0; i < lotsOfNumber.length; i++) {
            sum = sum + lotsOfNumber[i];
        }
        System.out.print(sum);
    }

    public static void printSumOfFirstFourIntegers(Integer lotsOfNumber[]) {
        int sum4 = 0;
        for (int i = 0; i <= 3; i++) {

            sum4 = sum4 + lotsOfNumber[i];
        }
        System.out.print(sum4);
    }

    public static void printSumOfFirstFiveIntegersBiggerThan2(Integer lotsOfNumber[]) {
        int sum = 0;

        int count = 0;
        for (int i = 0; i < lotsOfNumber.length; i++) {

            if ((lotsOfNumber[i] > 2) && (count <= 5))
                sum = sum + lotsOfNumber[i];
            count++;
        }

        System.out.print(sum);
    }

    public static void printNumberOfFirstIntegersWithSum10(Integer lotsOfNumber[]) {
        int sum10 = 0;
        int count2 = 0;

        for (int i = 0; i < lotsOfNumber.length; i++) {
            sum10 = sum10 + lotsOfNumber[i];
            if (sum10 < 76)

                count2++;
        }
        System.out.print(count2);

    }


    public static void printAverageOfTheList(Integer lotsOfNumber[]) {


        int sum11 = 0;
        double average = 0;


        for (int i = 0; i <= lotsOfNumber.length - 1; i++) {

            sum11 = sum11 + lotsOfNumber[i];

        }


        average = (double) sum11 / lotsOfNumber.length;

        System.out.println("Media aritmetica a numerelor este: " + average);
    }
}




         //1. Write a Java program to sort a numeric array and a string array.



       // public class ArraySort {





     //       static void sortListNumbers(int[] listToBeOrdered){



       //         for (int i = 0; i < listToBeOrdered.length; i++) {

               //     for (int j = 0; j < listToBeOrdered.length; j++) {

              //          if (listToBeOrdered[i] < listToBeOrdered[j]) {

              //              int tempElement = listToBeOrdered[i];

              //              listToBeOrdered[i] = listToBeOrdered[j];

              //              listToBeOrdered[j] = tempElement;

              //          }

           //         }

         //       }

           //     System.out.println("Ordered number list: ");



            //    for(int i=0;i<listToBeOrdered.length;i++){

            //        System.out.print(listToBeOrdered[i]+" ");

           //     }

        //    }



       //     static void sortListString(String[] listToBeOrdered){



          //      for (int i = 0; i < listToBeOrdered.length; i++) {

           //         for (int j = i+1; j < listToBeOrdered.length; j++) {

          //              if (listToBeOrdered[i].compareTo(listToBeOrdered[j])>0) {

           //                 String tempElement = listToBeOrdered[i];

          //                  listToBeOrdered[i] = listToBeOrdered[j];

           //                 listToBeOrdered[j] = tempElement;

          //              }

          //          }

         //       }

        //        System.out.println("Ordered string list: ");



          //      for(int i=0;i<listToBeOrdered.length;i++){

           //         System.out.print(listToBeOrdered[i]+" ");







       //     public static void main(String[] args) {



      //          int[]listNumbers = {9,3,8,2,7,5,6,4,1};

    //            String[] listString = {"g","a","h","e","b","d","c","f"};

  //              sortListNumbers(listNumbers);

       //         System.out.println();
//
       //         sortListString(listString);














      //      public class CommonElements {

        //        public static void main(String[] args) {

          //          int[] prima={23,45,67,89,12,21};

      //              int[] aDoua={89,45,65,21,85,67};
//
  //                  for(int i=0;i<prima.length;i++){
//
  //                      for(int j=0;j<aDoua.length;j++){
//
  //                          if(prima[i]==aDoua[j]){

    //                            int elementComun=prima[i];

    //                            System.out.print(elementComun+" ");

               //             }

             //           }

           //         }

           //     }

           // }

           // import java.util.Scanner;



           // public class IsItInTheArray {

           //     public static void main(String[] args) {

            //        Scanner in=new Scanner(System.in);

          //          System.out.println("Introduceti un numar: ");

          //          int num=in.nextInt();



          //          int[] lista={1,2,3,4,5,6,7,8,9,10};

          //          for(int i=0;i<=lista.length-1;i++){

          //              if(num == lista[i]){

                            //System.out.println("Numarul introdus se afla in lista");

                          //  break;

                        //} else {

                      //      System.out.println("Numarul introdus nu se afla in lista");

                    //        break;

                  //      }

                //    }



              //  }

            //}


          //  public class MinimMaxim {

          //      public static void main(String[] args) {

          //          int[] sir = {1, 56, 94, 25, 2, 76, 23, 105, 14};

                //    int max = 0;

              //      int min = 0;



            //        for (int i = 0; i < sir.length; i++) {

          //              if(sir[i]>max){

        //                    max=sir[i];

      //                  }

    //                }

  //                 int valueToCompare=max;
//
  //                  for(int j=0;j<sir.length;j++){
//
//
//
  //                      if(sir[j]<valueToCompare){
//
  //                          min=sir[j];
//
  //                          valueToCompare=min;
//
//
//
  //                      }
//
  //                  }
//
  //                  System.out.println("Maximul este: " + max);
//
  //                  System.out.println("Minimul este: " + min);
//
//
//
  //              }
//
//
         //   }


















