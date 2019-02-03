package Exercises;

import javax.swing.*;

public class Exercise7 {
    //se citesc capetele unui interval inchis; sa se afiseze daca exista cel putin un nr prim
    public static void main(String[] args) {


        int n1 = Integer.parseInt(JOptionPane.showInputDialog("n1= "));
        int n2 = Integer.parseInt(JOptionPane.showInputDialog("n2= "));
        boolean is = false;
        for (int i = n1; i <= n2; i++)
            if (isPrime(i)) {
                is = true;
                break;
            }
        if (is) System.out.println("is");
        else
            System.out.println("is not");

    }
        private static boolean isPrime( int nr){
            for (int i = 2; i <= Math.sqrt(nr); i++)
                if (nr % i == 0) return false;
            return true;
        }

    }


