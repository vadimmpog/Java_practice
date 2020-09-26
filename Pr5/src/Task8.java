import java.util.Scanner;

public class Task8 {
//    8. Палиндром
//    Дано слово, состоящее только из строчных латинских букв. Проверьте,
//    является ли это слово палиндромом. Выведите YES или NO.
//    При решении этой задачи нельзя пользоваться циклами, в решениях на
//    питоне нельзя использовать срезы с шагом, отличным от 1.
static boolean cut(String str){
    if(str.length() == 1) return true;
    if(str.charAt(0) == str.charAt(str.length()-1)){
        str = str.substring(1, str.length() - 2);
        if(str.length() <= 1){
            return true;
        }
        cut(str);
    }
    return false;
}

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String word = in.next();
        System.out.println(cut(word) ? "YES" : "NO");

    }
}
