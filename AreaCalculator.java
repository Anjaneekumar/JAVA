import java.util.Scanner;

public class AreaCalculator {
    public Float AreaOfTriangle(float height,float base) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the height & base value of triange: ");
        height=sc.nextFloat();
        base = sc.nextFloat();
        float ans = (height*base)/2;
        return ans;
        // System.out.println("The area of triangle with base of "+base+" and height of "+height+" is ");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose the Area of \n 1)Circle \n 2)Triangle \n 3)Rectangle \n 4)Isosceles \n 5)Parallelogram");
        System.out.println("Enter the Choice of Object of wich area you want to calculate: ");
        sc.close();
    }
}
