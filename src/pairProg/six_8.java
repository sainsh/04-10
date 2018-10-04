package pairProg;

import java.util.Scanner;

public class six_8 {

    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);

        System.out.print("Enter mile or kilometer and value");
        String choice =  in.next();
        double value = in.nextDouble();

        if(choice == "mile"){
            System.out.println(value + " miles is "mileToKilometer(value) + " kilometers");
        }else if (choice == "kilometer"){
            System.out.println(value + " kilometees is "kilometerToMile(value) + " milss");

        }else System.out.println("wrong input");



    }

    public static double mileToKilometer(double mile){
        double kilometer=0;

        kilometer = mile/1.6;

    return kilometer;
    }

    public static double kilometerToMile(double kilometer){
        double mile=0;

        mile = 1.6*kilometer;

        return mile;
    }
}
