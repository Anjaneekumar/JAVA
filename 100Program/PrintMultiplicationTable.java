import java.util.Scanner;

public class PrintMultiplicationTable {
    
    public static void MultiplicatioTable(int n){
        for(int i=1;i<=10;i++){
            System.out.print("\n"+i+" x "+n+" : "+i*n+" ");
        }
        System.out.println("\n");
    }

    public static void ReverseMulTable(int n){
        System.out.print("The table in reverse order: ");
        for(int i=10;i>=1;i--){
            System.out.print("\n"+i+" x "+n+" : "+i*n+" ");
        }
        System.out.println(" ");
    }

    public static void SumOfMulTable(int n){
        int total = 0;
        for(int i=1;i<=10;i++){
            total +=i*n;
        }
        System.out.println("The sum of all numbers is: "+total);
    }


    public static void SeperateDigitsThenSum(int n) {
        int rem = 0;

        if (n <= 9) { // input 9 se bada hai to run fun otherwise return as it is
            System.out.print(n);
        } else {
            while (n > 0) { // seprate & Sum

                rem += n % 10;
                n /= 10; // n ko katna hai ... har bar smaller krte jana hai
            }
            System.out.print("--> " + rem);
            SeperateDigitsThenSum(rem); // it print single digit 2 times because of if() statement above
        }
    }

    public static void sumOfDigits(int n) {
        // 8*7=56 --> 5+6=11
        for(int i=1;i<=10;i++){
            int currentMulDigit = i*n;
            System.out.print("\n"+i+" x "+n+" : "+currentMulDigit);
            SeperateDigitsThenSum(currentMulDigit);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number to print multiplication table: ");
        int num = sc.nextInt();
        MultiplicatioTable(num);
        ReverseMulTable(num);
        SumOfMulTable(num);
        sumOfDigits(num);
        
        sc.close();
    }
}
