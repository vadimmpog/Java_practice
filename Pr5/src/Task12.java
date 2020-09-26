import java.util.ArrayList;
import java.util.Scanner;


public class Task12 {
    static Scanner in = new Scanner(System.in);
    static void func(ArrayList<Integer> arrayList){
        int a = in.nextInt();
        if(a % 2 == 1)
            arrayList.add(a);
        if(a != 0){
            func(arrayList);
        }
    }
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        func(arrayList);
        boolean first = true;
        for (int a: arrayList) {
            if(first){
                System.out.print(a);
                first = false;
            }
            else {
                System.out.print(" " + a);
            }
        }
    }
}
