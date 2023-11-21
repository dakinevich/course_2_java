import java.util.Comparator;

public class Tester implements Comparator<Student> {
    public Student[] iDNumber;
    public void setArray(int l){
        iDNumber = new Student[l];
        for(int i = 0 ; i <l; i++){
            iDNumber[i] = new Student("Peter", "Petrov","Math", "Second","12-23",i%3+17, i%3+ i%3 + 12);
        }
    }
    public void quickSort(int a, int b) {
        if ((b-a)<2){
            return;
        }
        Student pivot = iDNumber[b];
        int wall = a;
        for (int i = a; i <b; i++){
            if (compare(iDNumber[i], pivot)<0){
                Student temp = iDNumber[wall];
                iDNumber[wall] = iDNumber[i];
                iDNumber[i] = temp;
                wall+=1;
            }
        }
        Student temp = iDNumber[wall];
        iDNumber[wall] = pivot;
        iDNumber[b] = temp;
        quickSort(a, wall-1);
        quickSort(wall+1, b);

    }
    public void mergeSort(){
        for (int i = 0; i<iDNumber.length-1 ; i++){
            Student temp = iDNumber[i+1];
            int new_ind = i+1;
            for (int j = 0; j<i+1; j++){
                if (compare(iDNumber[i + 1], iDNumber[j]) < 0){
                    new_ind = j;
                    break;
                }
            }
            for (int j = i+1; j>new_ind; j--){
                iDNumber[j] = iDNumber[j-1];
            }
            iDNumber[new_ind] = temp;
        }
    }
    public void outArray(){
        for(Student s:iDNumber){
            System.out.println(s.getPoints());
        }
    }

    @Override
    public int compare(Student a, Student b) {
        if(a.getPoints()> b.getPoints())
            return 1;
         else if(a.getPoints()< b.getPoints())
            return -1;
        else
            return 0;

    }

    public int compareByAge(Student a, Student b) {
        if(a.getAge()> b.getAge())
            return 1;
        else if(a.getAge()< b.getAge())
            return -1;
        else
            return 0;

    }
}
