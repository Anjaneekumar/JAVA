import java.util.Scanner;

public class SumOfFirstnEvenNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the nth number: ");
        int n=sc.nextInt();
        if(n%2==0){
            printNumber(n);
        }else{
            n-=1;
            printNumber(n);
        }

        
    }
    public static void printNumber(int num){
        while (num==1) {
            System.out.print(num+" ");
            num-=2;
        }
    }
}
