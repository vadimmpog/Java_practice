public class Main {
    public static void main(String[] args) {
        Dog d1 = new Dog("Mike", 2, "black", "male");
        Dog d2 = new Dog("Helen", 7, "black", "female");
        Dog d3 = new Dog("Bob");
        d3.setAge(1);
        System.out.println(d1);
        d1.intoHumanAge();
        d2.intoHumanAge();
        d3.intoHumanAge();
        Ball ball = new Ball("red", 25.4, "rubber");
        System.out.println(ball);
        Book book = new Book(58, "Death world", "Garry Garryson","science fiction");
        System.out.println(book);
    }
}
