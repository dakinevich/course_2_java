public class Square extends Rectangle {
    public Square() {
    }
    public Square(double side) {
        super(side, side);
    }
    public Square(double side, String color, boolean filled) {
        super(side, side);
    }

    @Override
    public String getType() {
        return "Square";
    }

    @Override
    public void setWidth(double side) {
        super.setWidth(side);
    }

    @Override
    public void setHeight(double side) {
        super.setHeight(side);
    }
}