package pairProg;


import java.util.Scanner;

public class six_two {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("enter a multidigit number: ");
        System.out.println("mult of digits is: " + mulDigites(in.nextInt()));

    }

    public static int mulDigites(long digites){

        int mult = 1;


        while(digites != 0) {

            mult *= digites % 10;
            digites /= 10;


        }

        return mult;
    }

}
