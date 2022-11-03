import java.util.Scanner;

/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main
{
    public int subtractProductAndSum(int n) {
        int[] arr = new int[10];
        int num=n;
        int i=0;
            while(num>0){
            int rem=num%10;
            arr[i]=rem;
            num/=10; // cut the num varna while endless ho jayega
            i++;
        }
        // int rem=num%10;
        //     num/=10;
        //     arr[i]=rem;
        //     i++;
        // int lenght=arr.length;
        // to calculate sum of digits
        int sumOfAllDigits=0;
        int productOfAllDigits = 1;
        for(int j=0;j<arr.length;j++){
            if(arr[j]>0){
                productOfAllDigits*=arr[j];
                sumOfAllDigits+=arr[j];
            }
        }
        int ans = productOfAllDigits - sumOfAllDigits;
        System.out.println(productOfAllDigits);
        System.out.println(sumOfAllDigits);
        return ans;
    }
	public static void main(String[] args) {
        Main obj = new Main();
        Scanner sc = new Scanner(System.in);
		System.out.println(obj.subtractProductAndSum(sc.nextInt()));
        sc.close();
        
	}
}
