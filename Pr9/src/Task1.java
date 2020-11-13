import java.util.Scanner;

public class Task1 {

    public static class Client{
        private String fullName;
        private String INN;

        public Client(String fullName, String INN) {
            this.fullName = fullName;
            this.INN = INN;
        }

        public String getFullName() {
            return fullName;
        }

        public void setFullName(String full_name) {
            this.fullName = full_name;
        }

        public String getINN() {
            return INN;
        }

        public void setINN(String INN) {
            this.INN = INN;
        }
    }

    public static class BadInnException extends Exception {
        public BadInnException(String errorMessage) {
            super(errorMessage);
        }
    }

    public static Client[] info = {new Client("Pogodin Vadim Vitalevich","123456789") ,
            new Client("Vasilev Dmitriy Egorovich","847653214"),
            new Client("Voronov Mihail Dmitrievich","123456789"),
            new Client(" Evgeniy Maksimovich","123456789"),};

    static void checkINN(String fullName, String INN){
        try{
            for(Client cl : info){
                System.out.println(cl.getFullName() +" "+ fullName);
                if(cl.getFullName().equals(fullName)){

                    if(!cl.getINN().equals(INN))
                        throw new BadInnException("Не верный ИНН: "+ INN);
                    else
                        System.out.println("Все верно.");
                }
            }
        }
        catch (BadInnException e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите фамилию, имя и отчество.");
        String fullName = in.nextLine();
        String INN = in.next();
        checkINN(fullName, INN);
    }
}
