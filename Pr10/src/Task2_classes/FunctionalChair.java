package Task2_classes;

public class FunctionalChair implements Chair{
    @Override
    public String toString() {
        return "Functional chair";
    }

    public int sum(int a, int b){
        return a+b;
    }
}
