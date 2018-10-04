package pairProg;

import java.util.Scanner;

public class six_8 {

    public static void main(String[] args) {
        int j=20;

        System.out.printf("%15s %15s %10s %15s %15s \n","miles", "kilometers","|", "kilometers", "miles");
        System.out.println("_______________________________________________________________________________");

        for(int i =1; i<=10; i++){

            System.out.printf("%15s %15.2f %10s %15s %15.2f \n",i, mileToKilometer(i),"|", j,kilometerToMile(j));

            j+=5;

        }





    }

    public static double mileToKilometer(double mile){
        double kilometer=0;

        kilometer = mile*1.6;

    return kilometer;
    }

    public static double kilometerToMile(double kilometer){
        double mile=0;

        mile = kilometer/1.6;

        return mile;
    }
}
