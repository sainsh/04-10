package classroom;

public class Arrays {

    public static void main(String[] args) {

        //double marks[] = new double[5]; //første måde at lave et array

        //0, 1, 2, 3, 4
        //marks[0] = 85
        //marks[1] = 75.5;

        int marks[] = {72,85,93,29,85}; // laver et array med 5 værdier
        int sum=0;  // sum af marks

        for(int counter = 0; counter < marks.length; counter++){ //kører array igennem

            System.out.println(marks[counter]); // printer hvert mark
            sum += marks[counter]; // lægger mark til sum
        }

        System.out.println(sum); // printer sum ud
    }

}
