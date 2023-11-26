public class ChairFactory {
    public static Chair createVictorianChair() {
        return new VictorianChair();
    }

    public static Chair createMultifunctionalChair() {
        return new MultifunctionalChair();
    }

    public static Chair createMagicChair() {
        return new MagicChair();
    }
}
