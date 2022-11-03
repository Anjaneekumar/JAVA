public class EncryptTheGrade {
    public static void main(String[] args) {
        char grade = 'A';
        // to ecrypt the garde add 8 to it --> simmilar to decrypt
        grade+=8; // ecrypt
        System.out.println(grade+" :Encyprted");
        grade-=8; // decrypt
        System.out.println(grade+" :Decrypted");
        int v=16;
		int u =5;
		int a = 7;
		int s = 9;
		int res1 = v*v;
		int res2 = u*u;
        double FunRes1 =  Math.pow(v, 2);
        double FunRes2 =  Math.pow(u, 2);
        int part1 = res1 - res2;
        int part2 = 2 *a*s;
        int result = part1/part2;
        int AllResult = (v*v-u*u)/2*a*s;
        double doubleResult = FunRes1-FunRes2 / 2*a*s;
        double doubleResult2 = (FunRes1-FunRes2) / 2*a*s;
        
    }
}
