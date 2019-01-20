package Exercises;

public class ChristmasTree {
    public static void main(String[] args) {
        int n=8;
        for (int i = 0; i < n*2; i = i+2){
            for (int j = n-i/2-1;j>0;j--)
                System.out.print(" ");
            for (int k=0; k <=i; k++)
                System.out.print("*");
                System.out.println();
        }
        int n1 = 4;
        for (int i1 =0;i1 < n*2;i1 = i1 +2){
            for(int j1 = n1-i1/2 - n1;j1>0;j1--)
                System.out.print(" ");
                for (int k=0;k<=i1;k++)
                    System.out.print("*");
            System.out.println();

        }
    }
}
