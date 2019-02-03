package Exercises;

import javax.swing.*;

public class Exercise9 {
    //termenul de rang n al unei progresii aritmetice: primul termen, ratia, rangul cerut al termenului
    public static void main(String[] args) {
        double a1 = Integer.parseInt(JOptionPane.showInputDialog("First term of progression= "));
        double r = Integer.parseInt(JOptionPane.showInputDialog("Ration= "));
        int n = Integer.parseInt(JOptionPane.showInputDialog("The term of rank n= "));
        double an = calcTermOfRankN(a1,r,n);
        System.out.println("Termenul de rang " + n + " este " + an);
    }
    // metoda recursiva
    private static double calcTermOfRankN( double firstTerm,double r,int n){
        if (n==1) return firstTerm;
        return r + calcTermOfRankN(firstTerm,r,n-1);
//        double an = firstTerm;
//        for (int i = 2;i<=n;i++)
//            an = an + r;
//        return an;
    }
}
