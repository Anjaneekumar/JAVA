public class reverseNumber {
    public static void main(String[] args) {
        int n=12345;
        int reverseNumber=0;
        String temp="";
        // 12345 --> 54321
        // while(n>0){
        //     reverseNumber =n%10;
        //     n/=10;
        //     temp=temp+Integer.toString(reverseNumber);
        // }
        // System.out.println(temp);

        //Another idea is   rev= n*10+rem

        while (n>0) {
            int rem = n%10;
            n/=10;
            reverseNumber = reverseNumber*10+rem;
        }
        System.out.println(reverseNumber);
    }
}
