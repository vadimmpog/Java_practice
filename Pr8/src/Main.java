import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class Main {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        int command = 1;

        try {
            File f = new File("D:\\Workspace\\Git\\Java_practice\\Pr8\\file.txt");
            if (!f.exists())
                f.createNewFile();
            String data;
            while (command != 0){
                System.out.println("Введите команду:");
                command = in.nextInt();
                switch (command) {
                    case 1, 3: {
                        FileWriter fileWriter = new FileWriter(f);
                        System.out.println("Введите фрагмент текста:");
                        in.skip("\n");
                        data = in.nextLine();
                        fileWriter.write(data);
                        fileWriter.flush();
                        break;
                    }
                    case 2: {
                        FileReader fileReader = new FileReader(f);
                        int c;
                        while ((c = fileReader.read()) != -1) {
                            System.out.print((char) c);
                        }
                        break;
                    }
                    case 4: {
                        FileWriter fileWriter = new FileWriter(f, true);
                        in.skip("\n");
                        System.out.println("Введите фрагмент текста:");
                        data = in.nextLine();
                        fileWriter.write(data);
                        fileWriter.flush();
                        break;
                    }
                }
            }
        }
        catch (Exception e) {
            System.err.println(e);
        }

    }
}
