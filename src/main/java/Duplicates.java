import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Duplicates {
    static int length=20;
    static  int [] arr1= new int[length];
    static  int [] arr2= new int[length];
    static ArrayList<Integer> duplicates = new ArrayList<>();

    public static void main(String[] args) {
        Random rand= new Random();
        for (int i = 0; i < arr1.length ; i++) {
            arr1[i]=rand.nextInt(20)+1;
            arr2[i]= rand.nextInt(20)+1;

        }
        System.out.print(Arrays.toString(arr1));
        System.out.println();
        System.out.print(Arrays.toString(arr2));

        for (int i = 0; i < arr1.length ; i++) {

            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i]==arr2[j]){
                    duplicates.add(arr1[i]);

                }

            }

        }
        System.out.println("Duplicate Number= "+ Arrays.toString(new ArrayList[]{duplicates}));
    }
}
