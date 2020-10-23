public class MyStack extends MyCollection{

    @Override
    public boolean isEmpty() {
        return getArrayList().isEmpty();
    }

    public int pop(){

        int a = getArrayList().get(getArrayList().size() - 1);
        getArrayList().remove(getArrayList().size()-1);
        return a;
    }

    public void push(int a){
        getArrayList().add(a);
    }

    public int peek(){
        return getArrayList().get(getArrayList().size() - 1);
    }
}