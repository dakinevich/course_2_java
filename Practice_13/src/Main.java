public class Main {
    public static void main(String[] args) {
        String s = "Ivan Dakinevich";
        System.out.println(s.charAt(s.length()-1));
        System.out.println(s.contains("Ivan"));
        System.out.println("my family starts at position: " + s.indexOf("Dakinevich"));
    }
}