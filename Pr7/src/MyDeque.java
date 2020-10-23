public class MyDeque extends MyCollection{

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

    public int popBack() {
        int a = getArrayList().get(getArrayList().size() - 1);
        getArrayList().remove(getArrayList().size() - 1);
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

    public int peekBack() {
        return getArrayList().get(getArrayList().size() - 1);
    }

    public void pushBack(int a) {
        getArrayList().add(0,a);
    }
}
