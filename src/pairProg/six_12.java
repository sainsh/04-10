package pairProg;

public class six_12 {
    public static void main(String[] args) {

    }

    public static void printNumber(int num1, int num2, int numberPerLine){

        for(int i= num1; i < num2; i++ ){

            System.out.print(i);
            if(i%numberPerLine == 0){
                System.out.print("\n");
            }

        }


    }
}
