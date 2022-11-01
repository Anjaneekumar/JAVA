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
        int total=0;
        int start=2;
        System.out.println("\n The series ascending order: ");
        while (start<=num) {
            System.out.print(start+" ");
            
            start+=2;
        }
        System.out.println("\n The first n even numbers in descending are: ");
        while (num>1) {
            System.out.print(num+" ");
            total += num;
            num-=2;
        }

        System.out.println("\n The total is: "+total);
    }

}
