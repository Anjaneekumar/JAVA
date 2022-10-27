import java.util.Scanner;
public class FactorOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to find out it's Factors: ");
        int n = sc.nextInt();
        sc.close();
        int i;
        for (i = 1; i <= n; i++) {
            if ((n % i) == 0) {
                System.out.print(i+" ");
            }
        }
        
    }
}
