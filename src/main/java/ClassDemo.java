public class ClassDemo {
    public static int someMethod(int n,int m){
        int sum=0;
        sum=n+m;
        return sum;

    }
    public static void display(int sum){
        System.out.println("The Sum is = "+sum);

    }

    public static void main(String[] args) {
        int a=4;
        int b=6;

        int c= someMethod(a,b);
        display(c);

    }

}
