public class Person {
    private String firstname;
    private String lastname;
    private String patronymic;

    public Person(String firstname, String lastname, String patronymic) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.patronymic = patronymic;
    }

    public Person(String lastname) {
        this.lastname = lastname;
    }

    public String getFullName(){
        if(firstname != null && patronymic != null)
            return lastname + " " + firstname.toCharArray()[0] + ". " + patronymic.toCharArray()[0] + ".";
        else
            return lastname;
    }

    public static void main(String[] args) {
        Person person = new Person("Vadim", "Pogodin", "Vitalevich");
        System.out.println(person.getFullName());
        Person person2 = new Person("Petrov");
        System.out.println(person2.getFullName());

    }
}
