import java.util.Scanner;
public class SumOfInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers to calculate sum of all digits AND \n 0 to exit");
        
        int sumOfAll=0;
        while(sc.hasNextInt()){
            int n=sc.nextInt();
            if(n>0){
                sumOfAll+=n;
            }else{
                break;
            }
        }
        System.out.println("The sum of all input is: "+sumOfAll);
        sc.close();
    }
}
