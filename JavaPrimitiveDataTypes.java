import java.util.*;
public class JavaPrimitiveDataTypes {
    public static void main(String[] args){
        byte b = 5; // to store byte value 
        char c = 'a';
        boolean bool = false;
        System.out.println(c);
        // double , boolena , long , short
        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter Double value");
        System.out.println("Enter Integer value");
        int intValue = sc.nextInt();
        System.out.println(intValue);
        System.out.println("Enter Double value");
        double doubleValue = sc.nextDouble();
        System.out.println("Enter Short value");
        short shortValue = sc.nextShort();
        System.out.println("Enter Long value");
        long longValue = sc.nextLong();
        System.out.println("Enter Boolean value");
        boolean boolValue = sc.nextBoolean();
        sc.close();

        System.out.println("Double value is"+doubleValue);
        System.out.println("Short value is"+shortValue);
        System.out.println("Long value is"+longValue);
        System.out.println("Boolean value is"+boolValue);
    }
}
