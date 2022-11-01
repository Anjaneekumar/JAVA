public class PrintStar {
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
