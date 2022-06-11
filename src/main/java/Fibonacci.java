import java.util.Arrays;



public class Fibonacci {

    public static void main(String[] args) {
        int [] fib= new int [100];
        fib[0]=0;
        fib [1]=1;
        for (int i = 2; i <fib.length ; i++) {
            fib[i]=fib[i-2]+fib[i-1];

        }
        System.out.println(Arrays.toString(fib));



        }
    }

