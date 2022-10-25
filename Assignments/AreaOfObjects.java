import java.util.Scanner;

public class AreaOfObjects {
    public static Float AreaOfTriangle(float height,float base) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the height & base value of triange: ");
        height=sc.nextFloat();
        base = sc.nextFloat();
        float ans = (height*base)/2;
        sc.close();
        return ans;
        // System.out.println("The area of triangle with base of "+base+" and height of "+height+" is ");
    }

    public static Float AreaOfCircle(float radius) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius of Circle: ");
        radius=sc.nextFloat();
        float ans=3.147F * radius;
        sc.close();
        return ans;
        // System.out.println("The area of triangle with base of "+base+" and height of "+height+" is ");
    }

    // program starter & user Validation
    public static void StartAndInput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose the Area of \n 1)Circle \n 2)Triangle \n 3)Rectangle \n 4)Isosceles \n 5)Parallelogram");
        System.out.println("Enter the Choice of Object of wich area you want to calculate: ");
        int input = sc.nextInt();
        if (sc.hasNextInt()) {
            switch (input) {
                case 1:
                    // area of circle here
                    System.out.println(AreaOfCircle(input));
                case 2:
                    System.out.println(AreaOfTriangle(input, input));
                    break;
                case 3:
                    // Rectangle : w*l
    
                case 4:
                    //Isosceles
    
                case 5:
                    //Parallelogram
                default:
                    break;
            }
            sc.close();
        }
        }

    public static void main(String[] args) {
        StartAndInput();
    }
}
