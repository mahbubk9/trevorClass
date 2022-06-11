import java.util.Scanner;

public class MyCalculator {

    public int add(int a, int b){
        return a+b;

    }

    public int sub(int a, int b){
        return a-b;

    }

    public int mul(int a, int b){
        return a*b;

    }

    public float div(int a, int b){
        float af=a;
        return  af/b;

    }


    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Please enter your first number ");
        int num1= sc.nextInt();
        System.out.println("Please enter your second number now");
        int num2 =sc.nextInt();
        MyCalculator mc =new MyCalculator();
        System.out.println("Two numbers add up to "+ mc.add(num1,num2));
        System.out.println("Difference between two numbers is "+ mc.sub(num1,num2));
        System.out.println("Product of two numbers is "+mc.mul(num1,num2));
        System.out.println("Dividing first number by second number results in "+ mc.div(num1,num2));



    }
}
