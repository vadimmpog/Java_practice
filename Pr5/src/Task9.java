import java.util.Scanner;

public class Task9 {
    static int k = 0;
    static void comb(int a, int b, String s){
        if(a > 0) comb(a-1, b, s+0);
        if(b > 0) comb(a, b-1, s+1);
        if(a == 0 && b == 0 && !s.contains("00")){
            k++;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt(), b = in.nextInt();
        comb(a,b,"");
        System.out.println(k);
    }
}
