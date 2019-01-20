public class ListOperations {
    public static void main(String[] args) {
        Integer[] lotsOfNumber = new Integer[]{44,1, 5, 8, 21, 33, 9, 12, 56,};

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

            if ((lotsOfNumber[i] > 2) && (count <=5))
                sum = sum + lotsOfNumber[i];
            count++;
        }

            System.out.print(sum);
    }
    public static void printNumberOfFirstIntegersWithSum10(Integer lotsOfNumber[]) {
        int sum10 = 0;
        int count2 =0;

        for (int i = 0; i <lotsOfNumber.length; i++) {
            sum10 = sum10 + lotsOfNumber[i];
            if (sum10 < 76)

                count2++;
        }
        System.out.print(count2);

        }



        }


















