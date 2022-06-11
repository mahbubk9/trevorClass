import java.util.Random;

public class ArrayEx1 {


    static int sum=0;
    static double avg=0.0;
    static  int [] numbers= new int[10];

    public static void main(String[] args) {
        Random rand= new Random();
        for (int i = 0; i < numbers.length; i++) {
            numbers[i]=rand.nextInt(20)+1;
            System.out.println(numbers[i]);
            sum+=numbers[i];


        }
        avg=sum/numbers.length;
        System.out.println("The sum is "+sum);
        System.out.println("The average is "+avg);

    }
}
