public class PrintStar {

    public static void MyNameReturn(String name) {
        int age =19;
        System.out.println("My name and age is: "+name+" "+age);
    }

    public static void MyNameReturnWithoutParameter(){
        int age =19;
        System.out.println("My name and age is: "+age);
    }


    public static void main(String[] args) {
        // print inverse star
        int n=4;
        for(int i=n;i>0;i--){ // inverse the loop to print star in desc order
            for (int j = 0; j<i; j++) {
                System.out.print("*");
            }
             System.out.print("\n");
        }


        
    }
}
