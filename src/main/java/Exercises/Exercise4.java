package Exercises;

import javax.swing.*;

public class Exercise4 {
    //de la tastatura 3 numere intregi, sa se ordoneze in ordine crescatoare
    public static void main(String[] args) {
        int a = Integer.parseInt(JOptionPane.showInputDialog("a= "));
        int b = Integer.parseInt(JOptionPane.showInputDialog("b= "));
        int c = Integer.parseInt(JOptionPane.showInputDialog("c= "));

//        int a= 255;
//        int b = 120;
//        int c = 99;

        if (a > b) {
            int temp = a;
            a = b;
            b = temp;
        }
        if (b > c) {
            int temp = b;
            b = c;
            c = temp;
        }
        if (a > b) {
            int temp = a;
            a = b;
            b = temp;
        }


        System.out.println(a + " " + b + " " + c);
    }
}






