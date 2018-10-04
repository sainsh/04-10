package pairProg;

import java.util.Scanner;

public class six_20 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Ener a string");
        String s = in.next();

        System.out.printf("number of letters in %s is %d",s,countLetter(s));

    }

    public static int countLetter(String s) {

        int letters = 0;

        for (int i = 0; i < s.length(); i++) {

            letters++;

        }


        return letters;
    }
}
