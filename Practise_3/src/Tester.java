public class Tester {
    private int n;
    private Circle[] circles;
    public Tester(Circle[] circles){
        this.circles = circles;
        this.n = this.circles.length;
    }

    public int getN() {
        return n;
    }

    public Circle[] getCircles() {
        return circles;
    }

    public Circle getCircle(int num){
        return circles[num];
    }

    public void addCircle(Circle circle) {
        if (n < circles.length) {
            circles[n++] = circle;
        }
    }

    public Circle getSmallestCircle() {
        Circle smallest = circles[0];
        for (int i = 1; i < n; i++) {
            if (circles[i].getRadius() < smallest.getRadius()) {
                smallest = circles[i];
            }
        }
        return smallest;
    }

    public Circle getLargestCircle() {
        Circle largest = circles[0];
        for (int i = 1; i < n; i++) {
            if (circles[i].getRadius() > largest.getRadius()) {
                largest = circles[i];
            }
        }
        return largest;
    }
}
