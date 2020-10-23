import java.util.*;

public class Main {
    static Scanner in = new Scanner(System.in);

    public static void swap(int a, int b){
        int c;
        c = a;
        a = b;
        b = c;
    }

    public static <T> int nextCard(Class cl, T t){
        int a = -1;
        switch (cl.toString()){
            case "class MyStack":{
                MyStack p = (MyStack)t;
                Stack<Integer> buf = new Stack<>();
                while(!p.isEmpty()){
                    buf.push(p.pop());
                }
                int card = buf.pop();
                while(!buf.isEmpty()){
                    p.push(buf.pop());
                }
                a = card;
                break;
            }
            case "class MyDeque":{
                a = ((MyDeque)t).pop();
                break;
            }
            case "class MyQueue":{
                a = ((MyQueue)t).pop();
                break;
            }
            case "class DoubleList":{
                a = ((DoubleList)t).pop();
                break;
            }
        }
        return a;
    }

    public static <T> void addCard(Class cl, T t, int a){
        switch (cl.toString()){
            case "class MyStack":{
               ((MyStack)t).push(a);
                break;
            }
            case "class MyDeque":{
                ((MyDeque)t).push(a);
                break;
            }
            case "class MyQueue":{
                ((MyQueue)t).push(a);
                break;
            }
            case "class DoubleList":{
                ((DoubleList)t).push(a);
                break;
            }
        }
    }

    public static <T> void  game(T player1,T player2){
        int a, b, turn = 0;
        boolean pl1turn = true;
        if (player1.getClass().toString() == "class DoubleList"){

        }

        while(!((MyCollection)player1).isEmpty() && !((MyCollection)player2).isEmpty() && turn != 181){

            a = nextCard(player1.getClass(), player1);
            b = nextCard(player2.getClass(), player2);
            if((a > b && b != 0) || a == 0 ){
                //победа 1
                if (!pl1turn) swap(a,b);
                addCard(player2.getClass(), player2,a);
                addCard(player2.getClass(), player2,b);
            }
            else{
                //победа 2
                if (!pl1turn) swap(a,b);
                addCard(player1.getClass(), player1,a);
                addCard(player1.getClass(), player1,b);
            }
            turn++;
        }
        if (turn < 181){
            System.out.println(((MyCollection)player1).isEmpty() ? "first" : "second" + " " + turn);
        }
        else System.out.println("botva");

    }

    public static void main(String[] args)  {
        System.out.println("Выберите структуру для игры:\n" +
                "[1] Стек\n" +
                "[2] Очередь\n" +
                "[3] Дек\n" +
                "[4] Двусвязный список");
        int Case = in.nextInt();
        MyCollection player1 = null, player2 = null;
        switch (Case){
            case 1:{
                player1 = new MyStack();
                player2 = new MyStack();
                break;
            }
            case 2:{
                player1 = new MyQueue();
                player2 = new MyQueue();
                break;
            }
            case 3:{
                player1 = new MyDeque();
                player2 = new MyDeque();
                break;
            }
            case 4:{
                player1 = new DoubleList();
                player2 = new DoubleList();
                break;
            }
        }

        System.out.println("Введите 5 карт для первого игрока затем для второго игрока:");

        for (int i = 0; i < 5; i++){
            player1.push(in.nextInt());
        }
        for (int i = 0; i < 5; i++){
            player2.push(in.nextInt());
        }

        game(player1, player2);

    }

}
//1 3 5 7 9 2 4 6 8 0