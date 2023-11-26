public class Main {
    public static void main(String[] args) {
        Client client = new Client();
        Chair chair= ChairFactory.createVictorianChair();
        client.chair = chair;
        client.sit();
    }
}
