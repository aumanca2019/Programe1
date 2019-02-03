package Exercises;

public class Exercise1 {
    //sa se calculeze si sa se afiseze cate numere nat de 4 cifre impartite la 67 dau rest 23.
    public static void main(String[] args) {
        int counter = 0;
        for( int i = 1000; i <= 9999; i++){
            if (i%67 == 23)
                counter++;}
            System.out.println("They are " + counter + " number");
        }

    }



