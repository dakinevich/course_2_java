public class Main {
    public static void main(String[] args) {
        System.out.println("\ntask1");
        task1();

        System.out.println("\ntask2");
        task2();

        System.out.println("\ntask3");
        task3();

    }
    public static void task1() {
        Student[] stud_l = {
                new Student(12, "Peter"),
                new Student(13, "Pavel"),
                new Student(9, "Peter"),
                new Student(2, "Pavel"),
                new Student(6, "Peter"),
                new Student(234, "Pavel"),
                new Student(1, "Peter"),
                new Student(53, "Pavel"),
        };
        mergeSort(stud_l);

        for (int i = 0; i<stud_l.length ; i++){
            System.out.println(stud_l[i].points);

        }
    }
    public static void task2() {
        Student[] stud_l = {
                new Student(12, "Peter"),
                new Student(13, "Pavel"),
                new Student(9, "Peter"),
                new Student(2, "Pavel"),
                new Student(6, "Peter"),
                new Student(234, "Pavel"),
                new Student(1, "Peter"),
                new Student(53, "Pavel"),
        };
        quickSort(stud_l, 0 , stud_l.length-1);
        for (int i = 0; i<stud_l.length ; i++){
            System.out.println(stud_l[i].points);

        }
    }



    public static void task3() {
        Student[] stud_l_1 = {
                new Student(12, "Peter"),
                new Student(13, "Pavel"),
                new Student(9, "Peter"),
                new Student(2, "Pavel"),
                new Student(6, "Peter"),
                new Student(234, "Pavel"),
                new Student(1, "Peter"),
                new Student(53, "Pavel"),
        };
        Student[] stud_l_2 = {
                new Student(11, "Peter"),
                new Student(111, "Pavel"),
                new Student(1111, "Peter"),
        };
        Student[] stud_l_3 = new Student[stud_l_1.length+stud_l_2.length];
        for (int i = 0; i<stud_l_1.length+stud_l_2.length ; i++){
            if (i<stud_l_1.length){
                stud_l_3[i] = stud_l_1[i];
            }
            else {
                stud_l_3[i] = stud_l_2[i-stud_l_1.length];
            }
        }
        mergeSort(stud_l_3);
        for (int i = 0; i<stud_l_3.length ; i++){
            System.out.println(stud_l_3[i].points);

        }
    }
    public static void mergeSort(myComparable[] arr) {
        for (int i = 0; i<arr.length-1 ; i++){
            myComparable temp = arr[i+1];
            int new_ind = i+1;
            for (int j = 0; j<i+1; j++){
                if (arr[i + 1].compareTo(arr[j]) < 0){
                    new_ind = j;
                    break;
                }
            }
            for (int j = i+1; j>new_ind; j--){
                arr[j] = arr[j-1];
            }
            arr[new_ind] = temp;
        }

    }
    public static void quickSort(myComparable[] arr, int a, int b) {
        if ((b-a)<2){
            return;
        }
        myComparable pivot = arr[b];
        int wall = a;
        for (int i = a; i <b; i++){
            if (arr[i].compareTo(pivot)<0){
                myComparable temp = arr[wall];
                arr[wall] = arr[i];
                arr[i] = temp;
                wall+=1;
            }
        }
        myComparable temp = arr[wall];
        arr[wall] = pivot;
        arr[b] = temp;
        quickSort(arr, a, wall-1);
        quickSort(arr, wall+1, b);

    }
}