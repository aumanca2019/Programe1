package Exercises;

import javax.swing.*;

public class Exercise5 {
    //se citesc doua numere  a si b, sa se afiseze daca au acelasi nr de divizori.
    public static void main(String[] args) {
        int a = Integer.parseInt(JOptionPane.showInputDialog("a = "));
        int b = Integer.parseInt(JOptionPane.showInputDialog("b = "));
        int nrDivA = 2; //orice numar are cel putin 2 divizori
        for(int i = 2;i <=a/2;i++)
            if(a%1 == 0)
                nrDivA++;
            int nrDivB = 2;
            for (int i =2;i<= b/2;i++)
                if(b%i == 0)
                    nrDivB++;
                if(nrDivA >nrDivB) System.out.println(a+ " has more divisors");
                else if(nrDivA == nrDivB) System.out.println(a + "and " + b + " have the same number of divisors");
                else System.out.println(b+ " has mor divisors");
    }
}
