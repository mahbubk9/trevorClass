import java.util.Scanner;

public class ExistInArray {

    static int[] numbers = {1, 5, 7, 20, 11, 9, 8, 10};
    static int match = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number between to check if it exists in Numbers Array.");
        int num = sc.nextInt();
        for (int number : numbers) {
            if (number == num) {
                System.out.println("Your number exists in the Numbers Array");
                match++;

            } /*else {
                System.out.println("");
            }*/


        }
        if (match < 1) {
            System.out.println(" Your number doesn't exist in the Numbers Array");
        }
    }
}