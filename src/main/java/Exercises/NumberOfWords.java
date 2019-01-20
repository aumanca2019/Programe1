package Exercises;

import java.util.Scanner;

public class NumberOfWords {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("String input:");
        String sentence = in.nextLine();


        System.out.println("Number of words = " + countWords(sentence));

    }

    public static int countWords(String sentence) {
        int count = 0;
        if (!(" ".equals(sentence.substring(0, 1))) || !(" ".equals(sentence.substring(sentence.length() - 1)))) {
            for (int i = 0; i < sentence.length(); i++) {
                if (sentence.charAt(i) == ' ') {
                    count++;
                }
            }
//            count += count;

        }
        return count+1;
    }
}
