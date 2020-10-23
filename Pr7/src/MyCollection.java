import java.util.ArrayList;
abstract public class MyCollection{

    private ArrayList<Integer> arrayList;
    public ArrayList<Integer> getArrayList() {
        return arrayList;
    }
    public MyCollection() {
        this.arrayList = new ArrayList<>();
    }

    abstract public boolean isEmpty();
    abstract public int pop();
    abstract public void push(int a);
    abstract public int peek();
}
