import java.util.Comparator;

public class Task3 {

    public static Student[] mergeArray(Student[] arrayA, Student[] arrayB, Comparator c) {

        Student[] arrayC = new Student[arrayA.length + arrayB.length];
        int positionA = 0, positionB = 0;

        for (int i = 0; i < arrayC.length; i++) {
            if (positionA == arrayA.length) {
                arrayC[i] = arrayB[positionB];
                positionB++;
            } else if (positionB == arrayB.length) {
                arrayC[i] = arrayA[positionA];
                positionA++;
            } else if (c.compare(arrayA[positionA], arrayB[positionB]) < 0 ) {
                arrayC[i] = arrayA[positionA];
                positionA++;
            } else {
                arrayC[i] = arrayB[positionB];
                positionB++;
            }
        }

        return arrayC;
    }

    public static Student [] mergeSort(Student[] arrayA, Comparator c){

        if (arrayA.length < 2) {
            return arrayA;
        }
        Student [] arrayB = new Student[arrayA.length / 2];
        System.arraycopy(arrayA, 0, arrayB, 0, arrayA.length / 2);

        Student [] arrayC = new Student[arrayA.length - arrayA.length / 2];
        System.arraycopy(arrayA, arrayA.length / 2, arrayC, 0, arrayA.length - arrayA.length / 2);

        arrayB = mergeSort(arrayB, c);
        arrayC = mergeSort(arrayC, c);

        return mergeArray(arrayB, arrayC, c);
    }

    public static void main(String[] args) {
        Task2.SortingStudentsByGPA c = new Task2.SortingStudentsByGPA();
        Student[] mass1 = Task1.createS(10,1);
        Student[] mass2 = Task1.createS(10,2);
        Student[] mass;
        mass1 = mergeSort(mass1, c);
        mass2 = mergeSort(mass2, c);
        mass = mergeArray(mass1, mass2, c);
        for(Student a: mass){
            System.out.println(a);
        }
    }
}
