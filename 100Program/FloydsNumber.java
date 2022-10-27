import java.util.Scanner;

public class FloydsNumber {
    public static void main(String[] args) {
        int n, num = 1, c, d;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of rows of floyd's triangle you want");
        n = in.nextInt();
        System.out.println("Floyd's triangle :-");
        for (c = 1; c <= n; c++)// specify row
        {
            for (d = 1; d <= c; d++)// specify column
            {
                System.out.print(num + " ");// print number
                num++;// increase number
            }
            System.out.println(); // ONE row ENDED
        }

    }
}
