import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;


public class Task2 extends JFrame {
    public class SortingStudentsByGPA implements Comparator<Student> {
        @Override
        public int compare(Student o1, Student o2) {
            if (o1.getGrade() == o2.getGrade())
                return 0;
            else if (o1.getGrade() > o2.getGrade())
                return 1;
            else
                return -1;
        }
    }

    public class StudentNotFoundException extends Exception {
        public StudentNotFoundException(String errorMessage) {
            super(errorMessage);
        }
    }

    public Student[] createS(int n, int group){
        Random random = new Random();
        Student[] mass = new Student[n];
        for(int i = 0; i < n; i++){
            mass[i] = new Student("student_"+group+"_"+(i+1), Math.abs(random.nextInt()%(n*5)));
            mass[i].setGrade(Math.abs(random.nextInt()%10+1));
        }
        return mass;
    }

    public void quicksort(Student mass[], int first, int last, Comparator c){
        int i = first, j = last;
        long tmp;
        Student x = mass[(first + last) / 2], a;

        do {
            while (c.compare(mass[i], x) < 0 ) {
                i++;
            }
            while (c.compare(mass[j], x) > 0) {
                j--;
            }
            if (i <= j) {
                if (i < j) {
                    a = mass[i];
                    mass[i] = mass[j];
                    mass[j] = a;
                }
                i++;
                j--;
            }
        } while (i <= j);

        if (i < last) {
            quicksort(mass, i, last, c);
        }

        if (first < j) {
            quicksort(mass, first, j, c);
        }
    }

    public String findStudent(String name, Student[] mass){
        Student student = null;
        try {
            for(Student s : mass){
                if(name.equals(s.getName())){
                    student = s;
                }
            }
            if(student == null){
                throw new StudentNotFoundException("Студент " + name + " не найден.");
            }
       }
       catch (StudentNotFoundException e){
           e.printStackTrace();
       }
        return "Студент найден. Оценка "+ student.getGrade() + " ID " + student.getIDNumber();
    }

    JPanel contents = new JPanel();
    JList<Student> allStudents = new JList<>();
    JTextArea student = new JTextArea();
    JLabel hello = new JLabel("Для работы нажмите старт.");
    JLabel alert = new JLabel();
    JButton start = new JButton("Старт");
    JButton exit = new JButton("Выход");
    JButton search = new JButton("Поиск");
    JButton sort = new JButton("Отсортировать по баллам");

    SortingStudentsByGPA c = new SortingStudentsByGPA();
    Student[] mass;

    Task2()
    {
        super("Практика №9");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        setSize(500,300);
        start.setBounds(50, 170,110,50);
        exit.setBounds(330, 170,110,50);
        hello.setBounds(90,60,300,30);

        Font font = new Font("Verdana", Font.PLAIN, 20);
        hello.setFont(font);
        add(start);
        add(exit);
        add(hello);
        start.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                start.setVisible(false);
                exit.setVisible(false);
                hello.setVisible(false);
                mass = createS(30,1);
                allStudents.setListData(mass);
                allStudents.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

                JPanel grid = new JPanel(new GridLayout(3, 1, 0, 3));
                grid.add(student);
                grid.add(alert);
                grid.add(search);
                contents.setLayout(new BorderLayout());
                contents.add(new JScrollPane(allStudents), BorderLayout.WEST);
                contents.add(sort, BorderLayout.SOUTH);
                contents.add(grid, BorderLayout.CENTER);
                setContentPane(contents);
            }
        });
        exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                setVisible(false);
                System.exit(0);
            }
        });
        search.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String s = student.getText();
                alert.setText(findStudent(s, mass));
            }
        });
        sort.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                quicksort(mass,0, mass.length-1, c);
                allStudents.setListData(mass);
            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        new Task2();
    }

}




