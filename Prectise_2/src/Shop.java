import java.util.ArrayList;

public class Shop {
    private ArrayList<Computer> computers;

    public Shop() {
        computers = new ArrayList<>();
    }

    public void addComputer(Computer computer) {
        computers.add(computer);
    }

    public void removeComputer(Computer computer) {
        computers.remove(computer);
    }

    public Computer findComputer(String brand, String model, double price) {
        for (Computer computer : computers) {
            if (computer.getBrand().equals(brand) && computer.getModel().equals(model) && computer.getPrice() == price) {
                return computer;
            }
        }
        return null;
    }
}
