public class Main {
    public static void main(String[] args) {
        MyList<Item> list = new MyList<>();
        Item item = new Dish("asd2", 1, "Asdas");
        Item item2 = new Dish("asd3", 1, "Asdas");
        Item item3 = new Dish("as4d", 1, "Asdas");
        Item item4 = new Dish("asd5", 1, "Asdas");
        list.push(item);
        list.push(item2);
        list.push(item3);
        list.push(item4);
        for (Item a : list.ListToTArray() ) {
            System.out.println(a.getName());
        }
    }
}
