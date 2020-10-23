public class DoubleList extends MyCollection{
    class Node{
        private Node next;
        private Node prev;
        private int value;

        public Node(Node next, Node prev, int value) {
            this.next = next;
            this.prev = prev;
            this.value = value;
        }
    }
    private Node first;
    private Node last;
    private int size;

    public DoubleList() {
        first = null;
        last = null;
        size = 0;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public int pop() {
        int a = last.value;
        last = last.prev;
        size--;
        return a;
    }

    @Override
    public void push(int a) {
        Node node = new Node(first, null, a);
        if(first == null && last == null){
            first = node;
            last = node;
        }
        else if (first == last){
            first = node;
            first.next = last;
            last.prev = first;
        } else {
            first.prev = node;
            first = node;
        }
        size++;
    }

    @Override
    public int peek() {
        return last.value;
    }
}
