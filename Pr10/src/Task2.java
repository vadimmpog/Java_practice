import Task2_classes.Client;
import Task2_classes.VictorianChair;
import Task2_classes.MagicChair;
import Task2_classes.FunctionalChair;

import java.util.Scanner;

public class Task2 {
    public interface AbstractChairFactory{
        public abstract VictorianChair createVictorianChair();
        public abstract MagicChair createMagicChair();
        public abstract FunctionalChair createFunctionalChair();
    }

    public static class ChairFactory implements AbstractChairFactory{

        @Override
        public VictorianChair createVictorianChair() {
            Scanner in = new Scanner(System.in);
            System.out.println("Please concrete your Victorian chair (enter age of chair)");
            int age = in.nextInt();
            return new VictorianChair(age);
        }

        @Override
        public MagicChair createMagicChair() {
            return new MagicChair();
        }

        @Override
        public FunctionalChair createFunctionalChair() {
            return new FunctionalChair();
        }
    }


    public static void main(String[] args) {
        ChairFactory factory = new ChairFactory();
        Client client = new Client();
        client.setChair(factory.createVictorianChair());
        client.sit();
        System.out.println(((VictorianChair)client.chair).getAge());
        client.setChair(factory.createMagicChair());
        client.sit();
        ((MagicChair)client.chair).doMagic();
        client.setChair(factory.createFunctionalChair());
        client.sit();
        System.out.println(((FunctionalChair)client.chair).sum(5,3));
    }
}
