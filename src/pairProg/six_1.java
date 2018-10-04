package pairProg;

public class six_1 {

    public static void main(String[] args) {

        //pentagonal numbers


        for (int i = 1; i < 101; i++) {

            System.out.print(getPentagonalNumber(i) + " " );
            if(i % 10 == 0) {
                System.out.print("\n");
            }
        }

    }

    public static int getPentagonalNumber(int n) {

        n = n*(3*(n-1))/2;

        return n;
    }
}
