package Exercises;

import javax.swing.*;

public class Exercise10 {
    //se citeste un nr nat N;sa se calc termenul de rang N, din sirul lui Fibonacci
    public static void main(String[] args) {
        //sirul lui Fibonacci se defineste recursiv astfel: a0 = 1,a1 = 1, pt n>=2, an = an-1 + an-2
        int N = Integer.parseInt(JOptionPane.showInputDialog("N= "));
        System.out.println(fib(N));
    }

    private static int fib(int n){
        if(n==0) return 1;
        if(n==1) return 1;
        return fib(n-1) + fib(n-2);

    }
}
