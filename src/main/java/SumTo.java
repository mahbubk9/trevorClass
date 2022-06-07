import java.util.Scanner;

public class SumTo {
    public static void main(String[] args) {
        Scanner reader= new Scanner(System.in);
        System.out.println("Input a Number to Sum To  ");
        int sumTo= reader.nextInt();
        int sum=0;
        for (int i = 0; i <= sumTo ; i++) {
            sum=sum+i;



        }
        System.out.println(sum);

    }
}
