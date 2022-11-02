import java.util.Scanner;

public class FactorialOfNumber {
    
    public static void NumFactorial(int n) {
        int ans = 1; 
        // making reverse logic for factorials as 5 --> 4 --> 3 --> 2 --> 1
        // so creating an decrementing while loop
        int start = n; // starting from 5
        while(start>1){ // 
            ans *= start; 
            start--; // decrementing start pointer
        }
        System.out.println(ans);
    }


    public static void ForLoopFactorial(int n) {
        // using forward moving logic 1 --> 2 --> 3 --> 4 --> 5
        int ans=1;
        for(int i=1;i<=n;i++){
            ans*=i;
        }
        System.out.println(ans);
    }

    public static void printFactSeries(int n) {
        int ans=1;
        for(int i=1;i<=n;i++){
            if (i!=n) {
                System.out.print(i+" * ");
            } else{

                System.out.print(i);
            }
            ans*=i;
        }
        System.out.print(" = "+ans);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the num for Factorial: ");
        int number = sc.nextInt();
        // NumFactorial(number);
        // ForLoopFactorial(number);
        printFactSeries(number);
        sc.close();
    }
}
