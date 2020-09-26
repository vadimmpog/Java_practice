import java.util.Scanner;

public class Task11 {
    static Scanner in = new Scanner(System.in);
    static int func(){
        int a = in.nextInt();
        switch (a){
            case 1:{
                return func()+1;
            }
            case 0:{
                int x = in.nextInt();
                if(x == 0)
                    return 0;
                else
                    if(x == 1)
                        return func()+1;
                    else
                        return func();
            }
            default:{
                return func();
            }
        }
    }
    public static void main(String[] args) {
        System.out.println(func());
    }
}
