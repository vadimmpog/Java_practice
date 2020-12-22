
public class MyList<T> {
    private static class Node<T>{
        private Node<T> next;
        private Node<T> prev;
        private T value;
        private int quantity;
        public Node(T value) {
            this.value = value;
            quantity = 1;
        }
    }

    private Node<T> head;
    private int size;

    public MyList() {
        size = 0;
        head = null;
    }

    public boolean push(T t) {
        Node<T> node;
        try {
            if(head == null){
                head = new Node<>(t);
                head.next = head.prev = head;
            }
            else{
                node = new Node<>(t);
                node.prev = head.prev;
                node.next = head;
                head.prev.next = node;
                head.prev = node;
            }
        }catch (NullPointerException e ){
            e.printStackTrace();
            return false;
        }
        size++;
        return true;
    }

//    public boolean pop(T t) {
//        Node<T> node = head.next;
//        try {
//            if(head.value == t){
//                head.prev.next = head.next;
//                head.next.prev = head.prev;
//                head = head.next;
//            }
//            else{
//                while(node.value != t && node != head){
//                    node = node.next;
//                }
//                node.prev.next = node.next;
//                node.next.prev = node.prev;
//            }
//        }catch (NullPointerException e ){
//            e.printStackTrace();
//            return false;
//        }
//        size--;
//        return true;
//    }

    public boolean pop(String name) {
        Node<T> node = head.next;
        try {
            if(((Item)head.value).getName().equals(name)){
                head.prev.next = head.next;
                head.next.prev = head.prev;
                head = head.next;
            }
            else{
                while(((Item)node.value).getName().equals(name)){
                    if(node == head){
                        return false;
                    }
                    node = node.next;
                }
                node.prev.next = node.next;
                node.next.prev = node.prev;
            }
        }catch (NullPointerException e ){
            e.printStackTrace();
            return false;
        }
        size--;
        return true;
    }

    public Item[] ListToTArray() {
            Item[] a = new Item[size];
            Node<T> node = head;
        int i = -1;
        while(node != head || i < 0){
            i++;
            a[i] = (Item) node.value;
            node = node.next;
        }
        return a;
        }
}
