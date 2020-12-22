import java.io.*;
import java.util.*;

public class Task5 {


    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = "test.txt";

        bufferedReader = new BufferedReader(new FileReader(fileName));
        ArrayList<String> words = new ArrayList<>();

        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        while (stringTokenizer.hasMoreTokens()) {
            words.add(stringTokenizer.nextToken());
        }

        System.out.println(getLine(words));
    }

    public static String getLine(ArrayList<String> words) {
        StringBuilder sb = new StringBuilder();
        if (words.size() == 0) {
            return sb.toString();
        }

        sb.append(words.remove(0));
        while(!words.isEmpty()){
            for(int i = 0; i < words.size(); i++){
                if(words.get(i).charAt(0) == sb.charAt(sb.length()-1)){
                    sb.append(" ");
                    sb.append(words.remove(i));
                }
                else
                    if(words.get(i).charAt(words.get(i).length()-1) == sb.charAt(0)){
                        sb.insert(0," ");
                        sb.insert(0, words.remove(i));
                    }
            }
        }

        return sb.toString();
    }
}