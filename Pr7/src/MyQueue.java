public class MyQueue extends MyCollection{
    @Override
    public boolean isEmpty() {
        return getArrayList().isEmpty();
    }

    @Override
    public int pop() {
        int a = getArrayList().get(0);
        getArrayList().remove(0);
        return a;
    }

    @Override
    public void push(int a) {
        getArrayList().add(a);
    }

    @Override
    public int peek() {
        return getArrayList().get(0);
    }


}