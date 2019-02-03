package Exercises;

import javax.swing.*;

public class Exercise12 {
    //se citeste un numar N; sa se calculeze suma primilor N termeni din sirul lui Fibonacci
    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog("N= "));
        int sum = 0;
        for (int i = 0;i <n; i++)
            sum = sum + fib(i);
        System.out.println("Suma primilor " + n + " termeni este  "  +  sum);

    }
    private static int fib(int n){
        if (n==0) return 1;
        if (n==1) return 1;
        return fib(n-1) + fib(n-2);
    }
}