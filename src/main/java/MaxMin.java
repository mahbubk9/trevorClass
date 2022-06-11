import java.util.Random;

public class MaxMin {
    static  int [] numbers= new int[10];
    public static void main(String[] args) {
        int max=0;
        int min=10;
        Random rand= new Random();
        for (int i = 0; i < numbers.length; i++) {
            numbers[i]=rand.nextInt(10)+1;
            System.out.println(numbers[i]);

        }
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i]>max){
                max=numbers[i];
            }
            if (numbers[i]<min && numbers[i]<max){
                min=numbers[i];
            }


        }
    System.out.println("Maximum"+max +","+ "Minimum "+min);
    }
}
