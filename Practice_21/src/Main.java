import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main<T> {
    public static void main(String[] args) {
        File directory = new File("C:\\Users\\Ivan7\\OneDrive\\Рабочий стол\\Docs\\_Mirea\\2-java");
        File[] files = directory.listFiles();

        List<File> fileList = new ArrayList<>(Arrays.asList(files));
        fileList.stream().limit(5).forEach(System.out::println);

    }
    public List<T> convertt(T[] mass){
        List<T> lst = List.of(mass);
        return lst;
    }
}