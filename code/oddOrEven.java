import java.util.Scanner;;
public class oddOrEven {
    public static void main(String[] args) {
        System.out.println("Enter a number to check is it Even or Odd? ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if(number>=1 && number%2==0){
            System.out.println("The number "+number+" is Even.");
        }else {
            System.out.println("The number "+number+" is Odd.");
        }
        sc.close();
    }
}
