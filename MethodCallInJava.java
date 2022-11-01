public class MethodCallInJava {
    public static void main(String[] args) {
        String naam = "Akshay";
        
        System.out.println(changeName(naam));
        System.out.println(naam);
    }

    static String changeName(String name){
        name = "rahul";
        return name;
    }
}
