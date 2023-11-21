import java.util.Scanner;

public class HowMany {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите фразу: ");
        String input = scanner.nextLine();

        int wordCount = countWords(input);
        System.out.println("Количество слов: " + wordCount);
    }

    public static int countWords(String input) {
        String[] words = input.split("\\s+");
        return words.length;
    }
}