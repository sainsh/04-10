package pairProg;


import java.util.Scanner;

public class six_two {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in); // input from user

        System.out.print("enter a multidigit number: "); //prompt user to enter number
        System.out.println("mult of digits is: " + mulDigites(in.nextInt())); // run muldigits method

    }

    public static int mulDigites(long digites){

        int mult = 1;       //start value of return value


        while(digites != 0) {      //stops when there are no digits left

            mult *= digites % 10;       //ekstraks last digit
            digites /= 10;              //removes last digit


        }

        return mult;
    }

}
