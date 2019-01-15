import java.util.Scanner;

public class luckySum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input a: ");
        int a = input.nextInt();
        System.out.println("Input b: ");
        int b = input.nextInt();
        System.out.println("input c: ");
        int c = input.nextInt();

        int sum = luckySum(a, b, c);
        System.out.println("Sum =" + sum);

    }

    public static int luckySum(int a, int b, int c) {
        int sum = 0;

        if (a == 13) {
            sum = 0;
        } else if (b == 13) {
            sum = a;

        } else if (c == 13) {
            sum = a + b;

        }
        return sum;


    }
}

