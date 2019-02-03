package Exercises;

import javax.swing.*;

public class Exercise3 {
    //sa se afiseze toti divizorii unui nr intreg dat ca parametru de la linia de comanda
    public static void main(String[] args) {
        int nr = Integer.parseInt(JOptionPane.showInputDialog("input nr = "));
        for ( int i = 1; i <= nr; i++)
            if(nr%i ==0)
                System.out.print(i + " ");
    }
}
