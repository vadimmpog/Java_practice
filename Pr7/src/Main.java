import java.util.*;

public class Main {
    static Scanner in = new Scanner(System.in);

    public int nextCard(Stack<Integer> p){
        return p.pop();
    }

    public int nextCard(Queue<Integer> p){
        return p.pop();
    }

    public int nextCard(Deque<Integer> p){
        return p.pop();
    }

//    public int nextCard(DoubleList<Integer> p){
//        return p.pop();
//    }


    public static <T> void  game(T player1,T player2){
        int a, b;
        boolean pl1turn = true;
        while(!((Collection)player1).isEmpty() && !((Collection)player2).isEmpty()){
            a = nextCard(player1);
            b = nextCard(player2);
            if((a > b && b != 0) || a == 0 ){
                //победа 1
                addCard(player2,a);
                addCard(player2,a);
            }
            else{
                //победа 2
                addCard(player1,a);
                addCard(player1,a);
            }

        }

    }

    public static void main(String[] args) {
        Stack<Integer> player1 = new Stack<>(), player2 = new Stack<>();
        for (int i = 0; i < 5; i++){
            player1.push(in.nextInt());
        }
        for (int i = 0; i < 5; i++){
            player2.push(in.nextInt());
        }

    }

}
