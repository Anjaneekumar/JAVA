import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter value of a: ");
        int a= sc.nextInt();
        System.out.println("Enter value of b: ");
        int b= sc.nextInt();
        int ans=0;
        // if user enter X or x then only exit .. otherwise keep taking inputs
        
        while(true){
            System.out.println("Enter the Operand: or X to exit");
            char input = sc.next().trim().charAt(0);
            if(input=='+' || input=='-' || input=='*' || input=='/' || input=='%'){
                switch (input) {
                    case '+':
                        ans=a+b;
                        break;
                    case '-':
                        ans=a-b;
                        break;
                    case '*':
                        ans=a*b;
                        break;
                    case '/':
                        ans=a/b;
                        break;
                    case '%':
                        ans=a%b;
                        break;
                    default:
                        System.out.println("Please Enter valid Operand");
                        break;
                }
            }
            else if(input=='X' || input=='x'){
                System.out.println("You are now Exited");
                break;
            }
            System.out.println(ans);
            // break;
        }
    }
}
