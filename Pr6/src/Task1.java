import  java.util.Random;

public class Task1 {

    public static Student[] createS(int n, int group){
        Random random = new Random();
        Student[] mass = new Student[n];
        for(int i = 0; i < n; i++){
            mass[i] = new Student("student_"+group+"_"+(i+1), Math.abs(random.nextInt()%(n*5)));
            mass[i].setGrade(Math.abs(random.nextInt()%10+1));
        }
        return mass;
    }

    public static Student[] insertsort(Student[] arr,int n){
        for( int j = 1; j < n; j++){
            Student key = arr[j];
            int i = j-1;
            while(i >= 0 && arr[i].compareTo(key) > 0){
                arr[i+1] = arr[i];
                i--;
            }
            arr[i+1] = key;
        }
        return arr;
    }

    public static void main(String[] args) {
        Student[] mass = createS(5,1);
        mass = insertsort(mass, 5);
        for(Student a: mass){
            System.out.println(a);
        }
    }
}
