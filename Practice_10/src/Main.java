public class Main {
    public static void main(String[] args) {
        Tester t = new Tester();
        Tester t2 = new Tester();
        t.setArray(10);
        t2.setArray(10);
        Tester t3 = new Tester();
        t3.setArray(20);

        for (int i = 0; i<20 ; i++){
            if (i<10){
                t3.iDNumber[i] = t.iDNumber[i];
            }
            else {
                t3.iDNumber[i] = t2.iDNumber[i-10];
            }
        }
        t3.mergeSort();
        t3.outArray();
    }
}