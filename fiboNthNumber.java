import java.util.Scanner;

public class fiboNthNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the term for Fibonaccie Series: ");
        int input = sc.nextInt();
        sc.close();
        int a=0;
        int b=1;
        int count=2;
        // while (count<=input) {
        //     int temp=b;
        //     b=b+a;
        //     a=temp;
        //     count++;
        // }
        for (int i = 2; i <=input; i++) {
            int temp=b;
            b=b+a;
            a=temp;
        }
        System.out.println("The nth number is: "+b);
    }
}
