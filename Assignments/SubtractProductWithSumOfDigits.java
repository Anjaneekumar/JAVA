public class SubtractProductWithSumOfDigits {
    public int subtractProductAndSum(int n) {
        // int n=sc.nextInt();
        // int[] numArray= new int[10];
        //     while(n>0){
        //         int i=0;
        //         numArray[i]=n%10;
        //         n/=10;
        //         i++;
        //     }
        //     for(int i=0;i<=numArray.length;i++){
        //         // System.out.println(numArray[i]);
        //         System.out.print(numArray[i]);
        // }
        int ans=0;
        // 234 --> (2*3*4)-(2+3+4)
        int num =n;
        int[] arr=new int[10];
        int i=0;
        while(num>0){
            int rem=num%10;
            num/=10;
            arr[i]=rem;
            i++;
        }

        int procustOfDigit=1;
        int sumOfDigits=0;
        for(int j=0;j<arr.length;j++){
            if(arr[j]>0){
                procustOfDigit*=arr[j]; // it multiply with all elem wher other are 0
            }
        }
        for(int j=0;j<arr.length;j++){
            if(arr[j]>0){
            sumOfDigits+=arr[j];
            }
        }
        ans = procustOfDigit-sumOfDigits;
        System.out.println(procustOfDigit);
        System.out.println(sumOfDigits);
        return ans;
    }
    
    public static void main(String[] args) {
        SubtractProductWithSumOfDigits obj = new SubtractProductWithSumOfDigits();
        
        System.out.println(obj.subtractProductAndSum(234));    
    }
}
