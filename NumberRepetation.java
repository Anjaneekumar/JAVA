public class NumberRepetation {
    public static void main(String[] args) {
        long longNumber = 73_857_579_587L;
        // find the number of repetation of 7...  E.g : 
        int flag =0;
        while (longNumber>0) {
            Long rem =longNumber%10;
            if (rem==7) {
                flag++;
            }
            longNumber/=10;
        }

        System.out.println(flag);
    }
}
