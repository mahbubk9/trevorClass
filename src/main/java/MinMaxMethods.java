import java.util.Scanner;

public class MinMaxMethods {
    public int findMax(int a,int b,int c){
        int max= a;
        if (b>a && b>c){
            max=b;
        }
        else if ( c>a && c>b) {
            max=c;

        }
        return max;

    }
    public double findMax(double a,double b,double c){
        double max= a;
        if (b>a && b>c){
            max=b;
        }
        else if ( c>a && c>b) {
            max=c;

        }
        return max;

    }
public int findMin(int a, int b, int c){
        int min=a;
        if (b<a && b<c){
            min=b;
        }
        else if (c<a && c<b) {
            min=c;

        }
        return min;

}

    public double findMin(double a, double b, double c){
        double min=a;
        if (b<a && b<c){
            min=b;
        }
        else if (c<a && c<b) {
            min=c;

        }
        return min;

    }











    public static void main(String[] args) {
        int num1 = 0,num2=0,num3=0;
        double num1d=0.00, num2d=0.00, num3d=0.00;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your first number as integer or double");

            if (sc.hasNextInt()) {
                num1= sc.nextInt();
            }
            else if (sc.hasNextDouble()) {
                 num1d= sc.nextDouble();

            }


        System.out.println("Please enter your first number as integer or double");

            if (sc.hasNextInt()) {
                 num2= sc.nextInt();
            }
            else if (sc.hasNextDouble()) {
                num2d= sc.nextDouble();



        }

        System.out.println("Please enter your first number as integer or double");

            if (sc.hasNextInt()) {
                 num3= sc.nextInt();
            }
            else if (sc.hasNextDouble()) {
                 num3d= sc.nextDouble();



        }
        MinMaxMethods mn=new MinMaxMethods();
        if (num1==0 && num2==0 && num3==0){
            System.out.println("The biggest number out of the three is "+mn.findMax(num1d,num2d,num3d));
            System.out.println("The smallest number out of the three is "+mn.findMin(num1d,num2d,num3d));

        }
        else   {
            System.out.println("The biggest number out of the three is "+mn.findMax(num1,num2,num3));
            System.out.println("The smallest number out of the three is "+mn.findMin(num1,num2,num3));

        }


    }
}
