import java.util.Scanner;

public class Task10 {
    static int count = 0;
    static void req(int x){
        count *= 10; count += x % 10;
        x /= 10;
        if(x != 0){
            req(x);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        req(n);
        System.out.println(count);
    }
}