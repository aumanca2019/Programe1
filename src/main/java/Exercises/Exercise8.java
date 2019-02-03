package Exercises;

import javax.swing.*;

public class Exercise8 {
    //se citesc trei numere a,b si c; sa se calc maximul dinte a si b cu metoda maxim() si apoi maximul dintre a,b si c
    //cu metoda maxim() cu trei paramentrii = polimorfismul parametric in java= metoda cu acelasi nume si patma diferiti
    public static void main(String[] args) {
        int a = Integer.parseInt(JOptionPane.showInputDialog("int a = "));
        int b = Integer.parseInt(JOptionPane.showInputDialog("int b = "));
        int c = Integer.parseInt(JOptionPane.showInputDialog("int c = "));

        int max2 = maxim(a,b);
        System.out.println("Maximul dinte " + a + " si " +  b + " este " + max2);
        int max3 = maxim(a,b,c);
        System.out.println("Maximul dintre " + a + " , " + b +  " si " + c + " este " + max3);
    }
    private static int maxim(int a,int b){
        if(a>=b) return a;
        else return b;
    }
    private static int maxim(int a,int b,int c){
        int max = a;
        if (b > max)max = b;
        if (c > max)max = c;
        return max;
    }
}
