import java.util.Scanner;

public class CheckUserInput {
    public static void main(String[] args) {
        // check user enterd a int or not
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            System.out.println("You Entered an Integer.");
        } else {
            System.out.println("You Entered non int value");
        }
    }
}
