public abstract class Shape {
    protected String color;
    protected boolean filled;
    public Shape(){}
    public Shape(String color, boolean filled){
        this.color = color;
        this.filled = filled;
    }


    public double getArea() {
        return 0;
    }

    public double getPerimeter() {
        return 0;
    }

    public String getType() {
        return "Shape";
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        return "Type: " + getType() + ", Area: " + getArea() + ", Perimeter: " + getPerimeter();
    }
}
