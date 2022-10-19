import java.util.Scanner;
public class areaOfCircle {
    //input radius --> area of circle
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double radius,areaOfCircle;
        System.out.println("Enter Radius od Circle");
        radius=sc.nextDouble();
        areaOfCircle = 3.147*radius*radius;
        System.out.println("Area of Circle is: "+areaOfCircle);

        // result in Float data type because Double: 8b but Float: 4b
        System.out.println("Enter Radius of Circle (Float)");
        float fRadius=sc.nextFloat();
        float floatResult = 3.14f*fRadius*fRadius;
        System.out.println("The Area of Circle in Float Data type is: "+floatResult);
        sc.close();
    }
}