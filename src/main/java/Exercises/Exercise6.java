package Exercises;

import javax.swing.*;

public class Exercise6 {
    //se citeste un nr natural a, sa se afiseze daca este patrat perfect
    public static void main(String[] args) {
        int a = Integer.parseInt(JOptionPane.showInputDialog("a= "));
        double radical = Math.sqrt(a);
        if((int)radical *(int)radical == a)
            System.out.println(a + " is perfect square");
        else System.out.println(a + " is not perfect square");
    }
}
