import java.util.Comparator;


public class Task2 {
    public static class SortingStudentsByGPA implements Comparator<Student> {
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

    public static void quicksort(Student mass[], int first, int last, Comparator c){
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


    public static void main(String[] args) {
        SortingStudentsByGPA c = new SortingStudentsByGPA();
        Student[] mass = Task1.createS(5,1);
        quicksort(mass,0, mass.length -1, c);
        for(Student a: mass){
            System.out.println(a);
        }
    }

}




