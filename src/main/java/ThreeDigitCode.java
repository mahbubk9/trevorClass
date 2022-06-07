import java.util.Arrays;

public class ThreeDigitCode {
    public static void main(String[] args) {
         int count=0;
         int [] code= new int[3];
        for (int i = 1; i <= 4; i++) {
                code[0]=i;
            for (int j = 1; j <=4 ; j++) {
                if (!(i==j)){

                    code[1]=j;

                }


                for (int k = 1; k <=4 ; k++) {
                    if (!(i==k) && !(j==k)){
                        code[2]=k;
                        count+=1;


                    }


                    System.out.println(Arrays.toString(code));

                    
                }
                
            }

        }


        System.out.println(count);
    }
}
