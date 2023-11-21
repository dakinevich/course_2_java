public class Circle {
    private Point center;
    private double radius;
    public  Circle(double x, double y, double radius){
        this.center = new Point(x, y);
        this.radius = radius;
    }

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String toString() {
        return "Circle[radius=" + radius + ",x=" + this.center.getX() + ",y=" + this.center.getY()+"]";
    }
}
