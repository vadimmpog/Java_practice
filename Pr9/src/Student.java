public class Student implements Comparable{
    private String name;
    private int IDNumber;
    private int grade;

    public Student(String name, int IDNumber) {
        this.name = name;
        this.IDNumber = IDNumber;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public double getIDNumber() {
        return IDNumber;
    }

    @Override
    public int compareTo(Object o) {
        return this.IDNumber > ((Student)o).IDNumber ?  1 : -1;
    }

    @Override
    public String toString() {
        return name + " оценка " + grade;
    }
}