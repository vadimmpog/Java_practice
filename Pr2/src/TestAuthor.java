public class TestAuthor {
    public static void main(String[] args) {
        Author author = new Author("Jhon", "hisemail@gmail.com",'m');
        System.out.println(author);
        author.setEmail("newemail@gmail.com");
        System.out.println(author);
        System.out.println(author.getGender());
    }
}
