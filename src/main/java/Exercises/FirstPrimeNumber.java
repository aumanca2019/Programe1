package Exercises;
// Sa se calculeze primul numar prim mai mare decat un numar dat ca paramentru la linia de comanda


import java.util.Scanner;
import javax.swing.*;

public class FirstPrimeNumber {


    public static void main(String[] args) {



//        Scanner numar = new Scanner(System.in);
//        System.out.println("Input nr: " );
//        int nr1 = numar.nextInt();
        int nr = Integer.parseInt(JOptionPane.showInputDialog("nr="));
        // int nr = Integer.parseInt(args[0]);

           // int nr = 89;


            int nrCrt = nr + 1;


            for (; ; ) {
                if (estePrim(nrCrt))
                    break;
                else nrCrt++;
            }
            System.out.println("Primul numar prim mai mare este: " + nrCrt);
        }

        private static boolean estePrim ( int x){

            boolean isPrime = true;
            for (int i = 2; i < Math.sqrt(x); i++)
                if (x % i == 0) {
                    isPrime = false;
                    break;

                }

            return isPrime;
        }
    }




