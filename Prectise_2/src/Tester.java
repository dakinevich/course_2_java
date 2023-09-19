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
}
