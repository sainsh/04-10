package pairProg;

public class six_12 {
    public static void main(String[] args) {

        printNumber(1,100,10); //run method for 1 to 100 included, 10 on each line

    }

    public static void printNumber(int num1, int num2, int numberPerLine){

        for(int i= num1; i < num2+1; i++ ){ //run through every number from num1 to num2

            System.out.printf("%s ",i);
            if(i%numberPerLine == 0){       //new line every numberPerLine numbers
                System.out.print("\n");
            }

        }


    }
}
