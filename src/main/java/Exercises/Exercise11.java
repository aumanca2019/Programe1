package Exercises;

import javax.swing.*;

public class Exercise11 {
    //se citeste un nr de la tastatura;sa se afiseze daca acest numar este termen in sirul lui fibonacci
    public static void main(String[] args) {
        int x = Integer.parseInt(JOptionPane.showInputDialog("X= "));
        boolean is = false;
        int i = 0;
        for(;;){
            int termen = fib(i);
            if(x==termen){
                is = true;
                break;
            }
            if(x<termen)break; //adica nu este termen
            i++;
        }
        if(is) System.out.println("Termenul " + x + " este termen in sirul lui Fibonacci");
        else System.out.println("Termenul " + x + " nu este termen in sitrul lui Fibonacci");
    }
    private static int fib(int i){
        if(i==0) return 1;
        if(i==1) return 1;
        return fib(i-1) + fib(i-2);
    }

}
