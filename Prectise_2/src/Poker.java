import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Poker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число игроков: ");
        int n = scanner.nextInt();

        List<String> deck = generateDeck();
        shuffleDeck(deck);

        for (int i = 0; i < n; i++) {
            List<String> hand = dealHand(deck, 5);
            printHand(hand);
            System.out.println();
        }
    }

    public static List<String> generateDeck() {
        List<String> deck = new ArrayList<>();
        String[] suits = {"Пики", "Трефы", "Червы", "Бубны"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Валет", "Дама", "Король", "Туз"};

        for (String suit : suits) {
            for (String rank : ranks) {
                deck.add(rank + " " + suit);
            }
        }

        return deck;
    }

    public static void shuffleDeck(List<String> deck) {
        Collections.shuffle(deck);
    }

    public static List<String> dealHand(List<String> deck, int handSize) {
        List<String> hand = new ArrayList<>();
        for (int i = 0; i < handSize; i++) {
            hand.add(deck.remove(0));
        }
        return hand;
    }

    public static void printHand(List<String> hand) {
        for (String card : hand) {
            System.out.println(card);
        }
    }
}