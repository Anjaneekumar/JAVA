import java.util.Arrays;
import java.util.Scanner;

public class ArayDemo {
    public static void main(String[] args) {
        // print Array 

        //create 1D array of size 5
        int[] arr = new int[5];
        arr[0]=1;
        arr[1]=2;
        arr[2]=3;
        arr[3]=4;
        arr[4]=5;

        // declare -> initialise -> add
        int[] arr2;
        arr2 = new int[5];
        arr2[0] = 4;

        // or can create array of element directly
        int[] arr3 = {1,2,3,4,5};

        // array input
        int[] arr4 = new int[5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr4.length; i++) {
            arr4[i]=sc.nextInt();
        }
        sc.close();

        //array output
        for(int num:arr4){
            System.out.print(num+" ");
        }

        // without for loop 
        System.out.println(Arrays.toString(arr4));
    }
}
